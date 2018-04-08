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
			Individuo<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB> i1 = 
					poblacion.get(r.nextInt(poblacion.size())).clone();
			Individuo<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB> i2 = 
					poblacion.get(r.nextInt(poblacion.size())).clone();

			if (r.nextDouble() <= c.getCruceporcentaje()) {
				// Cruzamos los dos individuos
				ArrayList<Individuo<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB>> individuosReproducidos = 
						alg_reproduccion(i1, i2);
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
		//Obtenemos dos puntos aleatorios
		//Un punto va de 0 a 26 y el otro de 0 hasta el punto A
		int puntoB = r.nextInt(i1.getGenotipo().getSize()),
				puntoA = r.nextInt(puntoB);
		
		HashMap<Character, Character> codigoInd1 = new HashMap<Character, Character>();
		HashMap<Character, Character> codigoInd2 = new HashMap<Character, Character>();
		
		Iterator<Entry<Double, ArrayList<Individuo<GenotipoR, FenotipoR, FitnessR>>>> it = mapa.entrySet().iterator();
		double acumulada = 0;
		while (it.hasNext()) {
			Entry<Double, ArrayList<Individuo<GenotipoR, FenotipoR, FitnessR>>> e = it.next();
			ArrayList<Individuo<GenotipoR, FenotipoR, FitnessR>> arrayaux = e
					.getValue();
			for (int i = 0; i < arrayaux.size(); i++) {
				acumulada = acumulada + (e.getKey() / fitnessTotal);
				mapaProbabilidadesAcumuladas.put(acumulada, arrayaux.get(i));
			}

		}
		
		return null;
	}

}
