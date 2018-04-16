package mutacion;

import configuracion.Mutacion_enum;
import fenotipo.Fenotipo;
import fitness.Fitness;
import genotipo.Genotipo;

public class
FactoriaMutacion<GenotipoALF extends Genotipo, FenotipoALF extends Fenotipo, FitnessALF extends Fitness>
{

    @SuppressWarnings("unchecked")
    public Mutacion<GenotipoALF, FenotipoALF, FitnessALF> getMutacion(Mutacion_enum tipo)
    {
        switch(tipo)
        {
        case INSERCION: return (Mutacion<GenotipoALF, FenotipoALF, FitnessALF>) new Insercion<FenotipoALF, FitnessALF>();
        case INVERSION: return (Mutacion<GenotipoALF, FenotipoALF, FitnessALF>) new Inversion<FitnessALF>();
        case INTERCAMBIO: return (Mutacion<GenotipoALF, FenotipoALF, FitnessALF>) new Intercambio<FenotipoALF, FitnessALF>();
        case MUTACION_HIBRIDA: return (Mutacion<GenotipoALF, FenotipoALF, FitnessALF>) new MutacionHibrida<FenotipoALF, FitnessALF>();
            default: return null;
        }
    }
}

