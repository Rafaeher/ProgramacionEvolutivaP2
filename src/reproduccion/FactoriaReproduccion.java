package reproduccion;

import configuracion.Reproduccion_enum;
import fenotipo.Fenotipo;
import fitness.Fitness;
import genotipo.Genotipo;

public class FactoriaReproduccion<GenotipoFR extends Genotipo, FenotipoFR extends Fenotipo, FitnessFR extends Fitness>
{
	
	@SuppressWarnings("unchecked")
	public Reproduccion<GenotipoFR,FenotipoFR,FitnessFR> getReproduccion(Reproduccion_enum reproduccion)
	{
		switch(reproduccion)
		{
			default: return null;
		}
	}
	
}
