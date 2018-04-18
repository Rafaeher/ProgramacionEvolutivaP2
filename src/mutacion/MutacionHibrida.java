package mutacion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import dao.DAO_Ngramas;
import fenotipo.Fenotipo;
import fenotipo.FenotipoMensaje;
import fitness.Fitness;
import genotipo.GenotipoAlfabeto;

public class MutacionHibrida<FenotipoUPB extends Fenotipo, FitnessUPB extends Fitness>
implements Mutacion<GenotipoAlfabeto, FenotipoMensaje, FitnessUPB>  {

	@Override
	public void muta(GenotipoAlfabeto genotipo, FenotipoMensaje fenotipo, double prob_mutacion) {
		Random r = new Random();
		
			HashMap<String, Double> mapTop1 = DAO_Ngramas.lectura(6);
			HashMap<String, Double> mapTop2 = DAO_Ngramas.lectura(7);
			HashMap<String, Double> mapTop3 = DAO_Ngramas.lectura(8);
			HashMap<String, Double> mapTop4 = DAO_Ngramas.lectura(9);
			HashMap<String, Double> mapTop5 = DAO_Ngramas.lectura(10);
			
			HashMap<String, Double> mapAux = new HashMap<String, Double>();
			
			int top1 = 0, top2 = 0;
			
			String[] palabras = fenotipo.getMensajeDecodificadoLowerCase().split(" ");
			HashMap<Character, Double> aux = new HashMap<Character, Double>();
			for(int i = 0; i < palabras.length; i++){
				if((mapTop1.containsKey(palabras[i]) || mapTop2.containsKey(palabras[i]))
						&& !mapAux.containsKey(palabras[i])){
					mapAux.put(palabras[i], null);
					if(mapTop1.containsKey(palabras[i])) top1 += 1;
					if(mapTop2.containsKey(palabras[i])) top2 += 1;
					for(int j = 0; j < palabras[i].length(); j++){
						if(!aux.containsKey(palabras[i].charAt(j))){
							aux.put(palabras[i].charAt(j), null);
						}
					}
				}
			}
			int a = 0, b = 0, num = 0, i = 0;
			boolean ok = false;
			r = new Random();
			
			double posibilidad = (top1 * 0.3) + (top2 * 0.1);
			//if(top1 == 0) posibilidad = 0.0;
			
			for(int j = 0; j < genotipo.getCodigo().size(); j++){
				r = new Random();
				if (r.nextDouble() < prob_mutacion) {
					while(!ok){
						i = r.nextInt(genotipo.getSize());
						if(genotipo.getCodigo().get(i) == 'h' && aux.containsKey(genotipo.getCodigo().get(i))){
							System.out.println("h estaba");
						}
						if((!aux.containsKey(genotipo.getCodigo().get(i)) || r.nextDouble() > posibilidad) && num == 0){
							num += 1;
							a = i;
						}
						i = r.nextInt(genotipo.getSize());
						if((!aux.containsKey(genotipo.getCodigo().get(i)) || r.nextDouble() > posibilidad) && num == 1){
							num += 1;
							b = i;
							ok = true;
						}
					}
				}
				ArrayList<Character> array = genotipo.getCodigo();
				
				Character characterAux = array.get(a);
				
				array.set(a, array.get(b));
				array.set(b, characterAux);

				genotipo.setCodigo(array);
			}
			
		}
}
