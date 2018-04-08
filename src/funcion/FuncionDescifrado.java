package funcion;

import java.util.ArrayList;
import java.util.HashMap;

import configuracion.Configuracion;
import dao.DAO_Ngramas;
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
	DAO_Ngramas dao = new DAO_Ngramas();

		HashMap<String, Double> ngramas = dao.lectura(2);
		double fitness = 0.0;
		for (int i = 0; i < poblacion.size(); i++) {
			
		}
	}
	@Override
	public boolean getMaximizar() {
		return false;
	}

}
