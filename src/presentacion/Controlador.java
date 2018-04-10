package presentacion;

import java.util.ArrayList;

import configuracion.Configuracion;
import fenotipo.FenotipoMensaje;
import fenotipo.FenotipoReal;
import fitness.FitnessReal;
import funcion.FactoriaFunciones;
import funcion.Funcion;
import genotipo.GenotipoAlfabeto;
import individuo.Individuo;

public class Controlador {
	
	
	public void execute(Configuracion c)
	{
		FactoriaPrimeraPoblacionBinario factoriaPrimeraPoblacion = new FactoriaPrimeraPoblacionBinario();
		ArrayList<?> poblacion = factoriaPrimeraPoblacion.getPrimeraPoblacion(c);
		@SuppressWarnings("unchecked")
		ArrayList<Individuo<GenotipoAlfabeto, FenotipoMensaje, FitnessReal>> pob = (ArrayList<Individuo<GenotipoAlfabeto, FenotipoMensaje, FitnessReal>>) poblacion;
		FactoriaFunciones<GenotipoAlfabeto,FenotipoMensaje, FitnessReal> factoriaFunciones = new FactoriaFunciones<GenotipoAlfabeto,FenotipoMensaje, FitnessReal>();
		Funcion<GenotipoAlfabeto, FenotipoMensaje, FitnessReal> funcion = factoriaFunciones.getSeleccion(1, pob, c);
		funcion.algoritmoGenetico();
		Vista.getVista().repintaGrafica(funcion.getGeneraciones(), funcion.getmejoriteracion(), funcion.gety_mejor_total(),funcion.getMedia());
		
	}
	
	
	
}
