package funcion;

import java.util.ArrayList;
import java.util.HashMap;

import configuracion.Configuracion;
import dao.DAO_Ngramas;
import decodificador.Decodificador;
import fenotipo.FenotipoMensaje;
import fitness.FitnessReal;
import genotipo.Genotipo;
import individuo.Individuo;
import utils.Pair;

public class FuncionDescifrado<GenotipoFD extends Genotipo> extends Funcion<GenotipoFD, FenotipoMensaje, FitnessReal>
{
	private int numNGrama;
	private String mensaje;
	private static HashMap<String, Pair<Double, Double>> frecuencias;
	
	public FuncionDescifrado
	(ArrayList<Individuo<GenotipoFD, FenotipoMensaje, FitnessReal>> poblacion, Configuracion configuracion)
	{
		super(poblacion, configuracion);
		mensaje = configuracion.getMensaje();
		numNGrama = configuracion.getNumNGrama();
		frecuencias = DAO_Ngramas.lectura(numNGrama);
	}

	@Override
	public void algEvalua(ArrayList<Individuo<GenotipoFD, FenotipoMensaje, FitnessReal>> poblacion)
	{
		for(Individuo<GenotipoFD, FenotipoMensaje, FitnessReal> individuo : poblacion)
		{
			FenotipoMensaje fenotipo = new FenotipoMensaje(mensaje);
			Decodificador.decodifica(individuo.getGenotipo(), fenotipo);
			
			individuo.setFenotipo(fenotipo);
			fenotipo.setFrecuencias(frecuencias);
			fenotipo.calcularFrecuencias(numNGrama);
			
			
			
			
			
		}
	}

	@Override
	public boolean getMaximizar()
	{
		return false;
	}

}
