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

}
