package mutacion;

import java.util.Random;

import fenotipo.Fenotipo;
import fenotipo.FenotipoMensaje;
import fitness.Fitness;
import genotipo.GenotipoAlfabeto;

public class Inversion<FenotipoUPB extends Fenotipo, FitnessUPB extends Fitness>
implements Mutacion<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB> {

	@Override
	public void muta(GenotipoAlfabeto genotipo, double prob_mutacion) {
		//Dado que está mutación cambia gran cantidad del genotipo del individuo
		//La probabilidad es para el individuo entero y no para cada gen
		Random r = new Random();
		int posA = r.nextInt();
		if(r.nextDouble() <= prob_mutacion){
			genotipo = alg_mutacion(genotipo, r.nextInt(posA) ,posA);
		}
	}
	
	private GenotipoAlfabeto alg_mutacion(GenotipoAlfabeto genotipo, int posA, int posB){
		int pososicionesACambiar = posB - posA;
		
		Character aux;
		for(int i = 0; i <= pososicionesACambiar; i++){
			aux = genotipo.getCodigo().get(posA);
			genotipo.getCodigo().set(posA, genotipo.getCodigo().get(posB));
			genotipo.getCodigo().set(posB, aux);
			posA += 1;
			posB -= 1;
		}
		return null;
	}
}
