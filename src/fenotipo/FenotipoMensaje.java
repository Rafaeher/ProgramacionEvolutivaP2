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
	public FenotipoMensaje(String mensajeCodificadoE,String mensajeDeCodificadoE )
	{
		mensajeCodificado = mensajeCodificadoE;
		mensajeDecodificado = mensajeDeCodificadoE;
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
			if(codigoHash.containsKey(mensajeCodificado.charAt(i)))
			{
				mensajeDecodificado += codigoHash.get(mensajeCodificado.charAt(i));
			}
			else
			{
				mensajeDecodificado += " ";
			}
			
		}
		//System.out.println("");
	}
	
	/**
	 * Obtiene el mensaje decodificado
	 * @return
	 */
	public String getMensajeDecodificado()
	{
		return new String(mensajeDecodificado);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Fenotipo cloneFenotipo()
	{
		FenotipoMensaje clon =  new FenotipoMensaje( new String(mensajeCodificado));
		clon.mensajeDecodificado = new String( mensajeDecodificado);
		return clon;
	}
}
