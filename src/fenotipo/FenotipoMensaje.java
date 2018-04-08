package fenotipo;

import java.util.ArrayList;
import java.util.HashMap;

import utils.Pair;

public class FenotipoMensaje implements Fenotipo
{
	private String mensajeCodificado;
	private String mensajeDecodificado;
	private HashMap<String, Pair<Double, Double>> frecuencias;
	
	/**
	 * Constructora a partir del mensaje codificado
	 * 
	 * @param mensajeCodificadoE: mensaje codificado de entrada
	 */
	public FenotipoMensaje(String mensajeCodificadoE)
	{
		mensajeCodificado = mensajeCodificadoE;
		mensajeDecodificado = "";
		frecuencias = null;
	}
	
	/**
	 * Decodifica el mensaje a partir del código
	 * 
	 * @param codigo: el código utilizado para encriptar el mensaje
	 */
	public void decodifica(final ArrayList<Character> codigo)
	{
		final String alfabeto = "abcdefghijklmnopqrstuvwxyz";
		HashMap<Character, Character> codigoHash = new HashMap<Character, Character>();
		mensajeDecodificado = "";
		
		for(int i = 0; i < alfabeto.length(); i++)
		{
			codigoHash.put(alfabeto.charAt(i), codigo.get(i));
		}
		
		for(int i = 0; i < mensajeCodificado.length(); i++)
		{
			mensajeDecodificado += codigoHash.get(mensajeCodificado.charAt(i));
		}
	}
	
	/**
	 * Obtiene el mensaje decodificado
	 * @return
	 */
	public String getMensajeDecodificado()
	{
		return mensajeDecodificado;
	}
	
	@Override
	public Fenotipo clone()
	{
		FenotipoMensaje clon = new FenotipoMensaje(mensajeCodificado);
		clon.mensajeDecodificado = mensajeDecodificado;
		
		return clon;
	}
	
	public void setFrecuencias(HashMap<String, Pair<Double, Double>> frecuenciasE)
	{
		frecuencias = frecuenciasE;
	}
	
	public void calcularFrecuencias()
	{
		
	}
	
	/**
	 * Obtiene la frecuencia de aparación del ngrama en el mensaje
	 * 
	 * @param ngrama: el ngrama cuya frecuencia queremos obtener
	 * @param numCaracteres: el número de caracteres del mensaje
	 * @return
	 */
	public Double obtenerFrecuenciaCalculada(String ngrama, int numCaracteres)
	{
		return frecuencias.get(ngrama).first / numCaracteres;
	}
	
	/**
	 * Obtiene la frecuencia esperada de un ngrama
	 * 
	 * @param ngrama: el ngrama
	 * @return
	 */
	public Double obtenerFrecuenciaEsperada(String ngrama)
	{
		return frecuencias.get(ngrama).second;
	}
	
	public void incrementarFrecuencia(String ngrama, double incrementos, int numCaracteres)
	{
		frecuencias.get(ngrama).first += incrementos / numCaracteres;
	}

}
