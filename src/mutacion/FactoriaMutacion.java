package mutacion;

import configuracion.Mutacion_enum;
import fenotipo.Fenotipo;
import fitness.Fitness;
import genotipo.Genotipo;

public class FactoriaMutacion<GenotipoFM extends Genotipo, FenotipoFM extends Fenotipo, FitnessFM extends Fitness>
{
	@SuppressWarnings("unchecked")
	public Mutacion<GenotipoFM, FenotipoFM, FitnessFM> getMutacion(Mutacion_enum tipo)
    {
        switch(tipo)
        {
            default: return null;
        }
    }
}
