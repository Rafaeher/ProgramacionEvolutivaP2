package reproduccion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Map.Entry;

import configuracion.Configuracion;
import fenotipo.Fenotipo;
import fenotipo.FenotipoMensaje;
import fitness.Fitness;
import genotipo.GenotipoAlfabeto;
import individuo.Individuo;

public class PMX<FenotipoUPB extends Fenotipo, FitnessUPB extends Fitness>
		implements Reproduccion<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB> {

	@Override
	public ArrayList<Individuo<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB>> reproduce(
			ArrayList<Individuo<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB>> poblacion, Configuracion c) {

		ArrayList<Individuo<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB>> poblacionFinal = new ArrayList<Individuo<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB>>();

		Random r = new Random();
		for (int i = 0; i < poblacion.size(); i = i + 2) {

			// Obtenemos dos individuos aleatorios
			Individuo<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB> i1 = poblacion.get(r.nextInt(poblacion.size()))
					.clone();
			Individuo<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB> i2 = poblacion.get(r.nextInt(poblacion.size()))
					.clone();

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

		Random r = new Random();
		// Obtenemos dos puntos aleatorios
		// Un punto va de 0 a 26 y el otro de 0 hasta el punto A
		int puntoB = r.nextInt(i1.getGenotipo().getSize()), puntoA = r.nextInt(puntoB);

		ArrayList<Character> GenotipoInd1 = new ArrayList<Character>(26);
		ArrayList<Character> GenotipoInd2 = new ArrayList<Character>(26);

		// Hashmaps para saber que letras estan ya en uso en cada genotipo (son
		// auxiliares)
		HashMap<Character, Character> aux1 = new HashMap<Character, Character>();
		HashMap<Character, Character> aux2 = new HashMap<Character, Character>();

		// Intercambiamos los genotipos entre los puntos A y B
		for (int i = puntoA; i <= puntoB; i++) {
			GenotipoInd1.set(i, i2.getGenotipo().getCodigo().get(i));
			aux1.put(i2.getGenotipo().getCodigo().get(i), i1.getGenotipo().getCodigo().get(i));
			GenotipoInd2.set(i, i1.getGenotipo().getCodigo().get(i));
			aux2.put(i1.getGenotipo().getCodigo().get(i), i2.getGenotipo().getCodigo().get(i));
		}
		// Rellenamos con los que no den conflicto el individuo 1
		for (int i = 0; i < i1.getGenotipo().getSize(); i++) {
			if (GenotipoInd1.get(i) == null) {
				if (!aux1.containsKey(i1.getGenotipo().getCodigo().get(i))) {
					GenotipoInd1.set(i, i1.getGenotipo().getCodigo().get(i));
					aux1.put(i1.getGenotipo().getCodigo().get(i), 
							i2.getGenotipo().getCodigo().get(i));
				}
			}
		}
		// Rellenamos con los que no den conflicto el individuo 2
		for (int i = 0; i < i2.getGenotipo().getSize(); i++) {
			if (GenotipoInd2.get(i) == null) {
				if (!aux2.containsKey(i2.getGenotipo().getCodigo().get(i))) {
					GenotipoInd2.set(i, i2.getGenotipo().getCodigo().get(i));
					aux2.put(i2.getGenotipo().getCodigo().get(i), 
							i1.getGenotipo().getCodigo().get(i));
				}
			}
		}
		//Rellenamos los que dan conflicto del individuo1
		for(int i = 0; i < i1.getGenotipo().getSize(); i++){
			if(GenotipoInd1.get(i) == null){
				Character individuo_buscar = i1.getGenotipo().getCodigo().get(i);
				boolean ok = false;
				while(!ok){
					if(!aux1.containsKey(aux1.get(individuo_buscar))){
						ok = true;
						GenotipoInd1.set(i, aux1.get(individuo_buscar));
						aux1.put(i1.getGenotipo().getCodigo().get(i),
								aux1.get(individuo_buscar));
					}
					else{
						individuo_buscar = aux1.get(individuo_buscar);
					}
				}
			}
		}
		//Rellenamos los que dan conflicto del individuo2
				for(int i = 0; i < i2.getGenotipo().getSize(); i++){
					if(GenotipoInd2.get(i) == null){
						Character individuo_buscar = i2.getGenotipo().getCodigo().get(i);
						boolean ok = false;
						while(!ok){
							if(!aux2.containsKey(aux2.get(individuo_buscar))){
								ok = true;
								GenotipoInd2.set(i, aux2.get(individuo_buscar));
								aux2.put(i2.getGenotipo().getCodigo().get(i),
										aux2.get(individuo_buscar));
							}
							else{
								individuo_buscar = aux2.get(individuo_buscar);
							}
						}
					}
				}
			GenotipoAlfabeto genotipoFinalInd1 = new GenotipoAlfabeto();
			GenotipoAlfabeto genotipoFinalInd2 = new GenotipoAlfabeto();
			
			genotipoFinalInd1.setCodigo(GenotipoInd1);
			genotipoFinalInd2.setCodigo(GenotipoInd2);
			
			i1.setGenotipo(genotipoFinalInd1);
			i2.setGenotipo(genotipoFinalInd2);
			
			ArrayList<Individuo<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB>> poblacionFinal = 
					new ArrayList<Individuo<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB>>();
			poblacionFinal.add(i1);
			poblacionFinal.add(i2);
			
		return poblacionFinal;
	}

}
