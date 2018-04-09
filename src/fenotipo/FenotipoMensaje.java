package fenotipo;

import java.util.ArrayList;
import java.util.HashMap;

public class FenotipoMensaje implements Fenotipo
{
	private String mensajeCodificado;
	private String mensajeDecodificado;
	
	/**
	 * Constructora a partir del mensaje codificado
	 * 
	 * @param mensajeCodificadoE: mensaje codificado de entrada
	 */
	public FenotipoMensaje(String mensajeCodificadoE)
	{
		mensajeCodificado = mensajeCodificadoE;
		mensajeDecodificado = "";
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
	
	@SuppressWarnings("unchecked")
	@Override
	public Fenotipo clone()
	{
		return new FenotipoMensaje(mensajeCodificado);
	}
	
	public double comparaFrecuencias()
	{
		return 0;
	}


	
}
