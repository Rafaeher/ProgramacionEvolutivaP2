package funcion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

import configuracion.Configuracion;
import dao.DAOCarlos;
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

}
