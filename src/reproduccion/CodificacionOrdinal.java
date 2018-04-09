package reproduccion;

import java.util.ArrayList;

import configuracion.Configuracion;
import fenotipo.Fenotipo;
import fenotipo.FenotipoMensaje;
import fitness.Fitness;
import genotipo.GenotipoAlfabeto;
import individuo.Individuo;

public class CodificacionOrdinal<FenotipoUPB extends Fenotipo, FitnessUPB extends Fitness>
implements Reproduccion<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB> {

	@Override
	public ArrayList<Individuo<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB>> reproduce(
			ArrayList<Individuo<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB>> poblacion, Configuracion c) {
		// TODO Auto-generated method stub
		return null;
	}

}
