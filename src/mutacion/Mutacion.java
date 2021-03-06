package mutacion;

import fenotipo.Fenotipo;
import fitness.Fitness;
import genotipo.Genotipo;

public interface Mutacion<GenotipoM extends Genotipo, FenotipoM extends Fenotipo, FitnessM extends Fitness>
{
	/**
	 * Muta un genotio
	 */
	void muta(GenotipoM genotipo, double prob_mutacion);
}
