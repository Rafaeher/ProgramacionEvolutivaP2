package mutacion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import fenotipo.Fenotipo;
import fitness.Fitness;
import genotipo.GenotipoAlfabeto;

public class Heuristica<FenotipoH extends Fenotipo, FitnessH extends Fitness>  implements Mutacion<GenotipoAlfabeto, FenotipoH, FitnessH>
{

	@Override
	public void muta(GenotipoAlfabeto genotipo, FenotipoH fenotipo, double prob_mutacion)
	{
		Random random = new Random();
		
		if (random.nextDouble() <= prob_mutacion)
		{
			ArrayList<Integer> posiciones = new ArrayList<Integer>();
			
			while(posiciones.size() < 3)
			{
				int proxima = random.nextInt();
				
				if(!posiciones.contains(proxima))
				{
					posiciones.add(proxima);
				}
			}
		
		}
	}
}
