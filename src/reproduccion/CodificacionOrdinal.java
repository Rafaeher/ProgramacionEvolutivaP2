package reproduccion;

import java.util.ArrayList;
import java.util.Random;

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
		
		ArrayList<Individuo<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB>> poblacionFinal = new ArrayList<Individuo<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB>>();

		Random r = new Random();
		for (int i = 0; i < poblacion.size(); i = i + 2) {

			// Obtenemos dos individuos aleatorios
			Individuo<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB> i1 = 
					poblacion.get(r.nextInt(poblacion.size())).cloneIndividuo();
			Individuo<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB> i2 = 
					poblacion.get(r.nextInt(poblacion.size())).cloneIndividuo();

			if (r.nextDouble() <= c.getCruceporcentaje()) {
				// Cruzamos los dos individuos
				ArrayList<Individuo<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB>> individuosReproducidos = alg_reproduccion(
						i1, i2);
				poblacionFinal.add(individuosReproducidos.get(0));
				poblacionFinal.add(individuosReproducidos.get(1));
			} else {
				// No cruzamos los dos individuos y por tanto los metemos en la
				// población final
				poblacionFinal.add(i1);
				poblacionFinal.add(i2);
			}
		}

		return poblacionFinal;
	}

	private ArrayList<Individuo<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB>> alg_reproduccion(
			Individuo<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB> i1,
			Individuo<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB> i2) {
		
		
		
		return null;
	}
	private ArrayList<Character> obtieneCodificacionOrdinal(
			Individuo<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB> individuo){
		Random r = new Random();
		ArrayList<Character> aux = individuo.getGenotipo().getCodigo();
		
		ArrayList<Character> recorrido = new ArrayList<Character>();
		
		for(int i = 0; i < individuo.getGenotipo().getSize(); i++){
			
			int random = r.nextInt(recorrido.size());
			recorrido.add(aux.get(random));
			aux.remove(random);
			
		}
		
		
		
		
		return null;
	}
	
	
}
