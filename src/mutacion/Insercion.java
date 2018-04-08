package mutacion;

import java.util.Random;

import fenotipo.Fenotipo;
import fenotipo.FenotipoMensaje;
import fitness.Fitness;
import genotipo.GenotipoAlfabeto;

public class Insercion<FenotipoUPB extends Fenotipo, FitnessUPB extends Fitness>
		implements Mutacion<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB> {

	@Override
	public void muta(GenotipoAlfabeto genotipo, double prob_mutacion) {

		Random r = new Random();
		int pos = r.nextInt();
		if (r.nextDouble() < prob_mutacion) {
			genotipo = alg_mutacion(genotipo, pos, r.nextInt(pos));
		}

	}

	private GenotipoAlfabeto alg_mutacion(GenotipoAlfabeto genotipo, int posOrigen, int posDestino) {
		Character aux = genotipo.getCodigo().get(posOrigen);

		for (int i = posDestino; i <= posOrigen; i++) {
			genotipo.getCodigo().set(i, aux);
			aux = genotipo.getCodigo().get(i);
		}

		return genotipo;
	}
}
