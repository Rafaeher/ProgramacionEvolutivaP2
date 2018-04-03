package genotipo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class GenotipoAlfabeto implements Genotipo
{
	private static final int NUMLETRAS = 26;
	private HashMap<Character, Character> codigo;
	
	/**
	 * Constructora por defecto
	 */
	public GenotipoAlfabeto()
	{
		codigo = new HashMap<Character, Character>();
	}
	
	/**
	 * Inicializa aleatoriamente el gen
	 */
	public void inicializacionAleatoria()
	{
		final String caracteres = "abcdefghijklmnopqrstuvwxyz";
		ArrayList<Character> contenedor = new ArrayList<Character>(NUMLETRAS); 
		
		for(int i = 0; i < NUMLETRAS; i++)
		{
			contenedor.add(caracteres.charAt(i));
		}
		
		Random random = new Random();
		
		for(int i = 0; i < NUMLETRAS; i++)
		{
			int index = random.nextInt(contenedor.size());
			codigo.put(caracteres.charAt(i), contenedor.get(index));
			contenedor.remove(index);
		}
	}
	
	/**
	 * Obtiene el código del gen
	 * 
	 * @return copia del código
	 */
	@SuppressWarnings("unchecked")
	public HashMap<Character, Character> getCodigo()
	{
		return (HashMap<Character, Character>) codigo.clone();
	}
	
	
    @SuppressWarnings("unchecked")
	@Override
    public Genotipo clone()
    {
    	GenotipoAlfabeto clon = new GenotipoAlfabeto();
    	clon.codigo = (HashMap<Character, Character>) codigo.clone();
    	
    	return clon;
    } 

}
