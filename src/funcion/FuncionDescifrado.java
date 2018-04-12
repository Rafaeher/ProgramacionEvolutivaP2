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

public class FuncionDescifrado<GenotipoFD extends Genotipo> extends Funcion<GenotipoFD, FenotipoMensaje, FitnessReal>
{
	private int numNGrama;
	private String mensaje;
	private static HashMap<String, Double> frecuenciasEsperadas;
	
	public FuncionDescifrado
	(ArrayList<Individuo<GenotipoFD, FenotipoMensaje, FitnessReal>> poblacion, Configuracion configuracion)
	{
		super(poblacion, configuracion);
		mensaje = configuracion.getMensaje();
		numNGrama = configuracion.getNumNGrama();
		frecuenciasEsperadas = DAO_Ngramas.lectura(numNGrama);
		numNGrama = configuracion.getNumNGrama();
	}

	@Override
	public void algEvalua(ArrayList<Individuo<GenotipoFD, FenotipoMensaje, FitnessReal>> poblacion)
	{
		for(Individuo<GenotipoFD, FenotipoMensaje, FitnessReal> individuo : poblacion)
		{
			FenotipoMensaje fenotipo = new FenotipoMensaje(mensaje);
			Decodificador.decodifica(individuo.getGenotipo(), fenotipo);
			individuo.setFenotipo(fenotipo);
			
			String mensajeDecodificado = fenotipo.getMensajeDecodificado();
			HashMap<String, Double> frecuenciasRelativas = calcularFrecuencias(numNGrama, mensajeDecodificado);
			
			double fitness = 0.0;
			
			for(String ngrama : frecuenciasRelativas.keySet())
			{
				double frecuencia = 0.0;
				if(ngrama.length() < numNGrama){
					frecuencia = DAO_Ngramas.lectura(ngrama.length()).get(ngrama);
				}
				else{
					try{
						if(frecuenciasEsperadas.containsKey(ngrama))
						frecuencia = frecuenciasEsperadas.get(ngrama);
						else frecuencia = 0.0;
					}
					catch(Exception e){
						System.out.println("");
					}
				}
				double diferencia = frecuenciasRelativas.get(ngrama) - frecuencia;
				fitness += diferencia * diferencia;
			}
			
			individuo.setFitness(new FitnessReal(fitness));
		}
	}

	/**
	 * Indica si un caracter es letra del alfabeto inglés
	 * 
	 * @param c: el caracter
	 * @return true si es letra del alfabeto inglés y false en otro caso
	 */
	private static boolean esLetra(char c)
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
	
	/**
	 * Calcula las frecuencias de aparición de los ngramas del mensaje decodificado
	 * 
	 * @param n: el número del ngrama
	 * @return 
	 */
	private HashMap<String, Double> calcularFrecuencias(int n, String mensajeDecodificado)
	{
		Double ngramasTotales = 0.0;
		HashMap<String, Double> resultado = new HashMap<String, Double>();
			
		for(int i = 0; i <= mensajeDecodificado.length() - n; i++)
		{
			String ngrama = "";
			for(int j = i; j < n + i; j++)
			{
				if (esLetra(mensajeDecodificado.charAt(j)))
				{
					ngrama += mensajeDecodificado.charAt(j);
				}
				else
				{
					j = n + i;
					ngrama = "";
				}
			}
				
			if (!ngrama.equals(""))
			{ 
				if (!resultado.containsKey(ngrama))
				{
					resultado.put(ngrama, 0.0);
					ngramasTotales++;
				}
				else
				{
					resultado.put(ngrama, (resultado.get(ngrama) + 1));
					//resultado.replace(ngrama, (resultado.get(ngrama) + 1));
				}
			}
		}
			
		for(String ngrama : resultado.keySet())
		{
			if (ngrama.length() == n)
			{
				resultado.replace(ngrama, resultado.get(ngrama) / ngramasTotales);
			}
		}
		
		return resultado;
	}
	
	@Override
	public boolean getMaximizar()
	{
		return false;
	}

}