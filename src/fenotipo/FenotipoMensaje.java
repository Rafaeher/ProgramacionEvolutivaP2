package fenotipo;

import java.util.ArrayList;
import java.util.HashMap;

import dao.DAO_Ngramas;
import utils.Pair;

public class FenotipoMensaje implements Fenotipo
{
	private String mensajeCodificado;
	private String mensajeDecodificado;
	private HashMap<String, Pair<Double, Double>> frecuencias;
	private ArrayList<Boolean> frecuenciasPreviamenteCalculadas;
	
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
		frecuenciasPreviamenteCalculadas = new ArrayList<Boolean>(DAO_Ngramas.NMAX);
	}
	
	/**
	 * Decodifica el mensaje a partir del c�digo
	 * 
	 * @param codigo: el c�digo utilizado para encriptar el mensaje
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
	
	/**
	 * Actualiza el valor de las frecuencias
	 * 
	 * @param frecuenciasE: frecuencias de entrada
	 */
	public void setFrecuencias(HashMap<String, Pair<Double, Double>> frecuenciasE)
	{
		frecuencias = frecuenciasE;
	}
	
	/**
	 * Calcula las frecuencias si no se han calculado previamente
	 * 
	 * @param n: el n�mero del ngrama
	 */
	public void calcularFrecuencias(int n)
	{
		if (!frecuenciasPreviamenteCalculadas.get(n))
		{
			int ngramasTotales = 0;
			
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
					frecuencias.get(ngrama).first += 1;
					ngramasTotales++;
				}
			}
			
			for(String ngrama : frecuencias.keySet())
			{
				if (ngrama.length() == n)
				{
					frecuencias.get(ngrama).first = frecuencias.get(ngrama).first / ngramasTotales;
				}
			}
		}
	}
	
	/**
	 * Obtiene la frecuencia de aparaci�n del ngrama en el mensaje
	 * 
	 * @param ngrama: el ngrama cuya frecuencia queremos obtener
	 * @param numCaracteres: el n�mero de caracteres del mensaje
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
	 * @return frecuencia esperada
	 */
	public Double obtenerFrecuenciaEsperada(String ngrama)
	{
		return frecuencias.get(ngrama).second;
	}
	
	/**
	 * Incrementa la frecuencia de un ngrama en el n�mero de incrementos indicados en un mensaje con un
	 * n�mero de letras dado
	 * 
	 * @param ngrama: el ngrama
	 * @param incrementos: las nuevas apariciones del ngrama (pueden ser negativas)
	 * @param numLetras: el n�mero de letras totales que tiene el mensaje
	 */
	public void incrementarFrecuencia(String ngrama, double incrementos, int numLetras)
	{
		frecuencias.get(ngrama).first += incrementos / numLetras;
	}
	
	public double comparaFrecuencias()
	{
		
	}

	/**
	 * Indica si un caracter es letra del alfabeto ingl�s
	 * 
	 * @param c: el caracter
	 * @return true si es letra del alfabeto ingl�s y false en otro caso
	 */
	public static boolean esLetra(char c)
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
