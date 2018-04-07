package dao;

import java.util.HashMap;

import utils.Pair;


public class FrecuenciasImp extends Frecuencias
{	
	private static int n; // El número n de los ngramas
	private static HashMap<String, Pair<Integer, Double>> ngramas;
	// La clave es el n-grama, el primer elemento del par es el número de apariciones
	// del ngrama en el texto y el segundo es la frecuencia esperada

	@Override
	public HashMap<String, Pair<Integer, Double>> obtenerFrecuencias(int num)
	{
		if (ngramas == null || n != num)
		{
			n = num;
			ngramas = DAO_Ngramas.lectura(n);
		}
		
		return ngramas;
	}
	
	
}
