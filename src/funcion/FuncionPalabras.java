package funcion;

import java.util.ArrayList;
import java.util.HashMap;

import configuracion.Configuracion;
import dao.DAO_Ngramas;
import decodificador.Decodificador;
import fenotipo.FenotipoMensaje;
import fitness.FitnessReal;
import genotipo.Genotipo;
import individuo.Individuo;

public class FuncionPalabras<GenotipoFD extends Genotipo> extends Funcion<GenotipoFD, FenotipoMensaje, FitnessReal> {
	private int numNGrama;
	private String mensaje;
	private static HashMap<String, Double> frecuenciasEsperadas;

	public FuncionPalabras(ArrayList<Individuo<GenotipoFD, FenotipoMensaje, FitnessReal>> poblacion,
			Configuracion configuracion) {
		super(poblacion, configuracion);
		mensaje = configuracion.getMensaje();
		numNGrama = configuracion.getNumNGrama();
		frecuenciasEsperadas = DAO_Ngramas.lectura(numNGrama);
		numNGrama = configuracion.getNumNGrama();
	}

	@Override
	public void algEvalua(ArrayList<Individuo<GenotipoFD, FenotipoMensaje, FitnessReal>> poblacion) {
		for (Individuo<GenotipoFD, FenotipoMensaje, FitnessReal> individuo : poblacion) {
			FenotipoMensaje fenotipo = new FenotipoMensaje(mensaje);
			Decodificador.decodifica(individuo.getGenotipo(), fenotipo);
			individuo.setFenotipo(fenotipo);

			String mensajeDecodificado = fenotipo.getMensajeDecodificado();

			double factor = MultiplicaPalabras(mensajeDecodificado);

			individuo.setFitness(new FitnessReal(factor));
		}
	}

	private double MultiplicaPalabras(String mensajeDecodificado) {
		String[] palabras = mensajeDecodificado.split(" ");
		double cont = 0.0;
		HashMap<String, Double> mapTop1 = DAO_Ngramas.lectura(6);
		HashMap<String, Double> mapTop2 = DAO_Ngramas.lectura(7);
		HashMap<String, Double> mapTop3 = DAO_Ngramas.lectura(8);
		HashMap<String, Double> mapTop4 = DAO_Ngramas.lectura(9);
		HashMap<String, Double> mapTop5 = DAO_Ngramas.lectura(10);
		ArrayList<Double> array = new ArrayList<Double>(5);
		for (int i = 0; i < 5; i++)
			array.add(0.0);
		HashMap<String, Double> aux = new HashMap<String, Double>();
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
		// HashMap<String, Double> mapTop4= DAO_Ngramas.lectura(9);
		for (int i = 0; i < palabras.length; i++) {
			if (mapTop1.containsKey(palabras[i])) {
				if(!aux.containsKey(palabras[i])){
					array.add(0, array.get(0) + 1);
					
				}
				num1++;
			} else if (mapTop2.containsKey(palabras[i])) {
				if(!aux.containsKey(palabras[i])){
					array.add(1, array.get(1) + 1);
				}
				num2++;
			} else if (mapTop3.containsKey(palabras[i])) {
				if(!aux.containsKey(palabras[i])){
					array.add(2, array.get(2) + 1);
				}
				num3++;
			} else if (mapTop4.containsKey(palabras[i])) {
				if(!aux.containsKey(palabras[i])){
					array.add(2, array.get(2) + 1);
				}
				num4++;
			} else if (mapTop5.containsKey(palabras[i])) {
				if(!aux.containsKey(palabras[i])){
					array.add(2, array.get(2) + 1);
				}
				num5++;
			}

		}
		double resultado = (num1 * 3) + (num2 * 1) + (num3 * 0.5) + (num4 * 0.25) + (num5 * 0.125);
		//double factor = ((array.get(0) * 3) + array.get(1)) / 6;
		// System.out.println("factor " + factor);
		// if(array.get(0) == 0) factor = factor/3;
		// else System.out.println("hay the");
		// double total = (array.get(2) * factor) + (array.get(3) * factor) +
		// (array.get(4) * factor);
		// System.out.println("total "+ total);
		//double total = cont * factor;
		return resultado;
	}

	/**
	 * Indica si un caracter es letra del alfabeto ingl�s
	 * 
	 * @param c:
	 *            el caracter
	 * @return true si es letra del alfabeto ingl�s y false en otro caso
	 */
	private static boolean esLetra(char c) {
		return c == 'a' || c == 'b' || c == 'c' || c == 'd' || c == 'e' || c == 'f' || c == 'g' || c == 'h' || c == 'i'
				|| c == 'j' || c == 'k' || c == 'l' || c == 'm' || c == 'n' || c == 'o' || c == 'p' || c == 'q'
				|| c == 'r' || c == 's' || c == 't' || c == 'u' || c == 'v' || c == 'w' || c == 'x' || c == 'y'
				|| c == 'z';
	}

	/**
	 * Calcula las frecuencias de aparici�n de los ngramas del mensaje
	 * decodificado
	 * 
	 * @param n:
	 *            el n�mero del ngrama
	 * @return
	 */
	private HashMap<String, Double> calcularFrecuencias(int n, String mensajeDecodificado) {
		Double ngramasTotales = 0.0;
		HashMap<String, Double> resultado = new HashMap<String, Double>();

		for (int i = 0; i <= mensajeDecodificado.length() - n; i++) {
			String ngrama = "";
			for (int j = i; j < n + i; j++) {
				if (esLetra(mensajeDecodificado.charAt(j))) {
					ngrama += mensajeDecodificado.charAt(j);
				} else {
					j = n + i;
					ngrama = "";
				}
			}

			if (!ngrama.equals("")) {
				if (!resultado.containsKey(ngrama)) {
					resultado.put(ngrama, 0.0);
					ngramasTotales++;
				} else {
					resultado.put(ngrama, (resultado.get(ngrama) + 1));
					// resultado.replace(ngrama, (resultado.get(ngrama) + 1));
				}
			}
		}

		for (String ngrama : resultado.keySet()) {
			if (ngrama.length() == n) {
				resultado.replace(ngrama, resultado.get(ngrama) / ngramasTotales);
			}
		}

		return resultado;
	}

	@Override
	public boolean getMaximizar() {
		return true;
	}

	public Individuo<GenotipoFD, FenotipoMensaje, FitnessReal> mejor(
			ArrayList<Individuo<GenotipoFD, FenotipoMensaje, FitnessReal>> poblacion) {
		Individuo<GenotipoFD, FenotipoMensaje, FitnessReal> mejor = poblacion.get(0);
		for (int i = 0; i < poblacion.size(); i++) {
			if (poblacion.get(i).getFitness().getValor() > mejor.getFitness().getValor())
				mejor = poblacion.get(i);
		}
		return mejor.cloneIndividuo();
	}
}