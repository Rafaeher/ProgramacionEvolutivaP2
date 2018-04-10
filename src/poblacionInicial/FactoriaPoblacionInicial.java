package poblacionInicial;

import java.util.ArrayList;

import configuracion.Configuracion;
import decodificador.Decodificador;
import fenotipo.FenotipoMensaje;
import fitness.FitnessReal;
import genotipo.GenotipoAlfabeto;
import individuo.Individuo;

public class FactoriaPoblacionInicial
{
	@SuppressWarnings("unchecked")
	public ArrayList<?> getPrimeraPoblacion(Configuracion configuracion)
	{
		ArrayList<?> result = null;
		
		result = new ArrayList<Individuo<GenotipoAlfabeto, FenotipoMensaje, FitnessReal>>(configuracion.getTamano_poblacion());
		
		for(int i = 0; i < configuracion.getTamano_poblacion(); i++)
		{
			Individuo<GenotipoAlfabeto, FenotipoMensaje, FitnessReal> individuo = new Individuo<GenotipoAlfabeto, FenotipoMensaje, FitnessReal>();
			GenotipoAlfabeto genotipo = new GenotipoAlfabeto();
			genotipo.inicializacionAleatoria();
			FenotipoMensaje fenotipo = new FenotipoMensaje(configuracion.getMensaje());
			Decodificador.decodifica(genotipo, fenotipo);
			
			individuo.setGenotipo(genotipo);
			individuo.setFenotipo(fenotipo);
			
			((ArrayList<Individuo<GenotipoAlfabeto, FenotipoMensaje, FitnessReal>>) result).add(individuo);
		}
		
		return result;
	}
}
