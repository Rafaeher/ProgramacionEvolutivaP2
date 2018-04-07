package dao;

import java.util.HashMap;

import utils.Pair;

public abstract class Frecuencias
{
	private static Frecuencias instancia;
	
	
	public static void instanciar()
	{
		if (instancia == null)
			instancia = new FrecuenciasImp();
	}
	
	/**
	 * Obtiene un HashMap con las frecuencias a partir del número n de ngrama
	 * 
	 * @param n
	 * @return HashMap con las frecuencias
	 */
	public abstract HashMap<String, Pair<Integer, Double>> obtenerFrecuencias(int num);
}
