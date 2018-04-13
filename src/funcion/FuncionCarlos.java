package funcion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

import configuracion.Configuracion;
import dao.DAOCarlos;
import dao.DAO_Ngramas;
import decodificador.Decodificador;
import fenotipo.FenotipoMensaje;
import fitness.FitnessReal;
import genotipo.Genotipo;
import individuo.Individuo;

public class FuncionCarlos<GenotipoFD extends Genotipo> extends Funcion<GenotipoFD, FenotipoMensaje, FitnessReal> {

	private Configuracion c;

	public FuncionCarlos(ArrayList<Individuo<GenotipoFD, FenotipoMensaje, FitnessReal>> poblacion,
			Configuracion configuracion) {

		super(poblacion, configuracion);
		this.c = configuracion;
	}

	@Override
	public void algEvalua(ArrayList<Individuo<GenotipoFD, FenotipoMensaje, FitnessReal>> poblacion) {
		
		for(int i = 0; i < poblacion.size(); i++){
			String mensaje = poblacion.get(0).getFenotipo().getMensajeDecodificado();
			String[] palabras = mensaje.split(" ");
			double fitness = 0.0;
			for(int j = 0; j < palabras.length; j++){
				double frecuencia = 0.0;
				if(palabras[i].length() < c.getNumNGrama()){
					DAO_Ngramas.lectura(palabras[i].length()).get(palabras[i]);
				}
				else{
					String ngrama = "";
					for(int k = 0; k < palabras[i].length(); k++){
						
					}
				}
			}
		}
		
		
		
		
		DAOCarlos dao = new DAOCarlos();
		int cont = 0;
		for (Individuo<GenotipoFD, FenotipoMensaje, FitnessReal> individuo : poblacion) {

			
			cont += 1;
			FenotipoMensaje fenotipo = new FenotipoMensaje(c.getMensaje());
			Decodificador.decodifica(individuo.getGenotipo(), fenotipo);
			individuo.setFenotipo(fenotipo);
			Double fitness = (double) c.getMensaje().length();
			System.out.println(fitness);
			String palabra = "";
			String[] parts = individuo.getFenotipo().getMensajeDecodificado().split(" ");
			for (int i = 0; i < parts.length; i++) {

				if (dao.estaPalabra(palabra)) {
					fitness -= 1;
				}
				palabra = "";
			}
			System.out.println(fitness);
			individuo.setFitness(new FitnessReal(fitness));
		}

	}

	@Override
	public boolean getMaximizar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Individuo<GenotipoFD, FenotipoMensaje, FitnessReal> mejor(
			ArrayList<Individuo<GenotipoFD, FenotipoMensaje, FitnessReal>> poblacion) {
		// TODO Auto-generated method stub
		return null;
	}

}
