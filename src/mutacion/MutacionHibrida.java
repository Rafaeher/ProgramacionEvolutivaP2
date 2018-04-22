package mutacion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import dao.DAO_Ngramas;
import fenotipo.Fenotipo;
import fenotipo.FenotipoMensaje;
import fitness.Fitness;
import genotipo.GenotipoAlfabeto;

public class MutacionHibrida<FenotipoUPB extends Fenotipo, FitnessUPB extends Fitness>
		implements Mutacion<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB> {

	@Override
	public void muta(GenotipoAlfabeto genotipo, FenotipoMensaje fenotipo, double prob_mutacion) {
		HashMap<String, Double> ngramas = DAO_Ngramas.lectura(1);
		HashMap<String, Double> frecuenciaText = new HashMap<String, Double>();
		String mensaje = fenotipo.getMensajeDecodificadoLowerCase();
	//	System.out.println("TAMAÑO " + fenotipo.getMensajeDecodificadoLowerCase().length());
		for(int i = 0; i < mensaje.length(); ++i){
			if(mensaje.charAt(i) != ' ' && esLetra(mensaje.charAt(i))){
				if(!frecuenciaText.containsKey(mensaje.charAt(i))){
					frecuenciaText.put(Character.toString(mensaje.charAt(i)), 1.0 / mensaje.length());
				}
				else{
					double veces = (frecuenciaText.get(Character.toString(mensaje.charAt(i))) * 
							mensaje.length()) + 1.0;
					double frecuencia = veces / mensaje.length();
					frecuenciaText.put(Character.toString(mensaje.charAt(i)), frecuencia);
				}
			}
		}
		//YA HEMOS CALCULADO LA FRECUENCIA DE LOS MONOGRAMAS
		//AHORA INTERCAMBIAREMOS LOS DOS CON FRECUENCIA MAS BAJA
		double errorMasAlto1 = 0.0;
		String errorMasAlto1Character = "";
		double errorMasAlto2 = 0.0;
		String errorMasAlto2Character = "";
		for (String ngrama : frecuenciaText.keySet()) {
			double error = Math.abs(ngramas.get(ngrama) - frecuenciaText.get(ngrama));

			
			
			if(error > errorMasAlto2 && error <= errorMasAlto1){
				errorMasAlto2 = error;
				errorMasAlto2Character = ngrama;
			}
			if(error > errorMasAlto2 && error > errorMasAlto1){
				String characterAux = errorMasAlto1Character;
				double errorAux = errorMasAlto1;
				errorMasAlto1Character = ngrama;
				errorMasAlto1 = error;
				errorMasAlto2 = errorAux;
				errorMasAlto2Character = characterAux;
			}
		}
		
		ArrayList<Character> array = genotipo.getCodigo();
		for(int i = 0; i < array.size(); i++){
			if(array.get(i) == errorMasAlto1Character.charAt(0)){
				array.set(i, errorMasAlto2Character.charAt(0));
			}
			if(array.get(i) == errorMasAlto2Character.charAt(0)){
				array.set(i, errorMasAlto1Character.charAt(0));
			}
		}
		
			
	}
	private boolean esLetra(char c)
	{
		return c == 'a' ||
				c == 'b' ||
				c == 'c' ||
				c == 'd' ||
				c == 'e' ||
				c == 'f' ||
				c == 'g' ||
				c == 'h' ||
				c == 'i' ||
				c == 'j' ||
				c == 'k' ||
				c == 'l' ||
				c == 'm' ||
				c == 'n' ||
				c == 'o' ||
				c == 'p' ||
				c == 'q' ||
				c == 'r' ||
				c == 's' ||
				c == 't' ||
				c == 'u' ||
				c == 'v' ||
				c == 'w' ||
				c == 'x' ||
				c == 'y' ||
				c == 'z';
	}
}
