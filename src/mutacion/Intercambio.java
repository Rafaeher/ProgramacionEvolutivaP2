package mutacion;

import java.util.Random;

import fenotipo.Fenotipo;
import fenotipo.FenotipoMensaje;
import fitness.Fitness;
import genotipo.GenotipoAlfabeto;

public class Intercambio<FenotipoUPB extends Fenotipo, FitnessUPB extends Fitness>
implements Mutacion<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB> {

	@Override
	public void muta(GenotipoAlfabeto genotipo, double prob_mutacion) {
		Random r = new Random();
		if (r.nextDouble() < prob_mutacion) {
			genotipo = alg_mutacion(genotipo, r.nextInt(genotipo.getSize()), r.nextInt(genotipo.getSize()));
		}

		
	}

	private GenotipoAlfabeto alg_mutacion(GenotipoAlfabeto genotipo, int a, int b) {
		Character aux = genotipo.getCodigo().get(a);
		
		genotipo.getCodigo().set(a, genotipo.getCodigo().get(b));
		genotipo.getCodigo().set(b, aux);
		
		return genotipo;
	}

}
