package genotipo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import utils.Alfabeto;
import utils.Pair;

public class GenotipoAlfabeto implements Genotipo
{
	private static final int NUMLETRAS = 26;
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
		Random r = new Random();
		Alfabeto alfabeto = new Alfabeto();
		HashMap<Character, Character> aux = new HashMap<Character, Character>();
		while(codigo.size() < NUMLETRAS){
			Character letra = alfabeto.getAlfabeto().charAt(r.nextInt(NUMLETRAS));
			if(!aux.containsKey(letra)){
				aux.put(letra, null);
				codigo.add(letra);
			}
			
		}
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
    public void setCodigo(ArrayList<Character> c){
    	codigo = c;
    }

}
