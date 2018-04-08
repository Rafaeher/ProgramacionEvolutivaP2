package genotipo;

import java.util.ArrayList;
import java.util.HashMap;

import utils.Pair;

public class GenotipoAlfabeto implements Genotipo
{
	private static final int NUMLETRAS = 26;
	private HashMap<String, Pair<Double, Double>> frecuencias;
	private ArrayList<Character> codigo;
	
	/**
	 * Constructora por defecto
	 */
	public GenotipoAlfabeto()
	{
		codigo = new ArrayList<Character>();
	}
	
	/**
	 * Inicializa aleatoriamente el gen
	 */
	public void inicializacionAleatoria()
	{

	}
	
	/**
	 * Obtiene el código del gen
	 * 
	 * @return copia del código
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Character> getCodigo()
	{
		return (ArrayList<Character>) codigo.clone();
	}
	
	
    @SuppressWarnings("unchecked")
	@Override
    public Genotipo clone()
    {
    	GenotipoAlfabeto clon = new GenotipoAlfabeto();
    	clon.codigo = (ArrayList<Character>) codigo.clone();
    	
    	return clon;
    } 
    public int getSize(){
    	return NUMLETRAS;
    }


}
