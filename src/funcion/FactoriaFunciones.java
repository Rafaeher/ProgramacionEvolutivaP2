package funcion;

import java.util.ArrayList;

import configuracion.Configuracion;
import fenotipo.*;
import fitness.*;
import genotipo.Genotipo;
import individuo.Individuo;

public class FactoriaFunciones <GenotipoFF extends Genotipo, FenotipoFF extends Fenotipo, FitnessFF extends Fitness> {

	@SuppressWarnings("unchecked")
	public Funcion<GenotipoFF,FenotipoFF,FitnessFF> getSeleccion(int f,
			ArrayList<Individuo<GenotipoFF,FenotipoFF, FitnessFF>> poblacion,
			Configuracion config)
    {
		
    	switch(f)
		{
		default: return null;
		}
    }
}