package mutacion;

import configuracion.Mutacion_enum;
import fenotipo.Fenotipo;
import fitness.Fitness;
import genotipo.Genotipo;

public class
FactoriaMutacionImp<GenotipoALF extends Genotipo, FenotipoALF extends Fenotipo, FitnessALF extends Fitness>
extends FactoriaMutacion<GenotipoALF, FenotipoALF, FitnessALF>
{

    @SuppressWarnings("unchecked")
	@Override
    public Mutacion<GenotipoALF, FenotipoALF, FitnessALF> getMutacion(Mutacion_enum tipo)
    {
        switch(tipo)
        {
        case INSERCION: return (Mutacion<GenotipoALF, FenotipoALF, FitnessALF>) new Insercion<FenotipoALF, FitnessALF>();
        case INVERSION: return (Mutacion<GenotipoALF, FenotipoALF, FitnessALF>) new Inversion<FenotipoALF, FitnessALF>();
        case INTERCAMBIO: return (Mutacion<GenotipoALF, FenotipoALF, FitnessALF>) new Intercambio<FenotipoALF, FitnessALF>();
            default: return null;
        }
    }
}
