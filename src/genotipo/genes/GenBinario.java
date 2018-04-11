package genotipo.genes;

import java.util.ArrayList;
import java.util.Random;

public class GenBinario implements Cloneable
{
    ArrayList<Boolean> codigo; // El c�digo del gen
    private int longitud;

    /**
     * Constructora a partir de la longitud
     *
     * @param longitud: numero de bits que debe tener el gen
     */
    public GenBinario(int longitud)
    {
        codigo = new ArrayList<Boolean>(longitud);
        this.longitud = longitud;
    }
    
    /**
     * Inicializa aleatoriamente el gen
     */
    public void inicializacionAleatoria()
    {
    	Random r = new Random();
    	
        for(int i = 0; i < longitud; i++)
        {
            if (r.nextBoolean())
                codigo.add(true);
            else
                codigo.add(false);
        }
    }

    /**
     * Obtiene el c�digo del gen
     *
     * @return codigo: el c�digo del gen
     */
    @SuppressWarnings("unchecked")
	public ArrayList<Boolean> getCodigo()
    {
        return (ArrayList<Boolean>) codigo.clone();
    }

    /**
     * Calcula la longitud que debe tener el c�digo del gen para poder almacenar un real
     *
     * @param min valor m�nimo que puede tomar el real
     * @param max valor m�ximo que puede tomar el real
     * @param precision precisi�n que debe tener el real
     * @return longitud que debe tener el c�digo del gen para poder almacenar el real
     */
    public static int calculaLongitud(final Double min, final Double max, final Double precision)
    {
        return (int) Math.ceil(Math.log(1 + (max - min) / precision) / Math.log(2));
    }

    /**
     * Convierte un c�digo binario a int
     *
     * @param codigo: el c�digo binario
     * @return resultado: el int equivalente
     */
    public static int genAInt(ArrayList<Boolean> codigo)
    {
        int resultado = 0;

        for(int i = 0; i < codigo.size(); i++)
            if(codigo.get(codigo.size() - i - 1))
                resultado += Math.ceil(Math.pow(2, i));

        return resultado;
    }

    /**
     * Obtiene el tama�o del c�digo
     *
     * @return tama�o del c�digo
     */
    public int getTamGen()
    {
        return codigo.size();
    }
    
    /**
     * Actualiza el valor del c�digo del gen
     * 
     * @param codigo: el c�digo del gen
     */
    public void setCodigo(ArrayList<Boolean> codigo)
    {
    	this.codigo = codigo;
    }
    
    /**
     * Obtiene el bit i - �simo
     * 
     * @param indiceBit: el �ndice
     * @return el bit i - �simo
     */
    public boolean getBit(int indiceBit)
    {
    	return codigo.get(indiceBit);
    }
    
    /**
     * Actualiza el bit i - �simo
     * 
     * @param indiceBit: el �ndice
     * @param valor: el valor con el que se quiere actualizar
     */
    public void setBit(int indiceBit, boolean valor)
    {
    	codigo.set(indiceBit, valor);
    }
    
    @SuppressWarnings("unchecked")
	@Override
    public Object cloneGenotipo()
    {
    	GenBinario clon = new GenBinario(longitud);
    	clon.codigo = (ArrayList<Boolean>) codigo.clone();
    	
    	return clon;
    }  
}
