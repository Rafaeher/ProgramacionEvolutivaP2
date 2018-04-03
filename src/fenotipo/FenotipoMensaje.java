package fenotipo;

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
	public void decodifica(final HashMap<Character, Character> codigo)
	{
		mensajeDecodificado = "";
		
		for(int i = 0; i < mensajeCodificado.length(); i++)
		{
			mensajeDecodificado += codigo.get(mensajeCodificado.charAt(i));
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

}
