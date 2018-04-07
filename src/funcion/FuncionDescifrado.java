package funcion;

import java.util.ArrayList;

import configuracion.Configuracion;
import fenotipo.FenotipoMensaje;
import fitness.FitnessReal;
import genotipo.Genotipo;
import individuo.Individuo;

public class FuncionDescifrado<GenotipoFD extends Genotipo> extends Funcion<GenotipoFD, FenotipoMensaje, FitnessReal>
{

	public FuncionDescifrado
	(ArrayList<Individuo<GenotipoFD, FenotipoMensaje, FitnessReal>> poblacion, Configuracion configuracion)
	{
		super(poblacion, configuracion);
	}

	@Override
	public void algEvalua(ArrayList<Individuo<GenotipoFD, FenotipoMensaje, FitnessReal>> poblacion)
	{
		//TODO
	}

	@Override
	public boolean getMaximizar()
	{
		return false;
	}

}
