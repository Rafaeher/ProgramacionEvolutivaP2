package genotipo;

import genotipo.genes.GenBinario;

import java.util.ArrayList;

public class GenotipoBinario implements Genotipo
{

    ArrayList<GenBinario> genes;

    public GenotipoBinario() {
    	genes = new  ArrayList<GenBinario>();
    }
    
	/**
	 * Obtiene los genes
	 *
	 * @return genes: los genes
	 */
    public GenotipoBinario(ArrayList<GenBinario> genes) {
    	this.genes = genes;
    }
    
	public ArrayList<GenBinario> getGenes()
	{
		ArrayList<GenBinario> genesCopia = new ArrayList<GenBinario>();
		
		for(int i = 0; i < genes.size(); i++)
		{
			genesCopia.add((GenBinario) genes.get(i).clone());
		}
		
		return genesCopia;
	}

	/**
	 * Obtiene el n�mero de genes que tiene el genotipo
	 *
	 * @return el n�mero de genes que tiene el genotipo
	 */
	public int getNumGenes()
	{
		return genes.size();
	}

	public GenBinario getGen(int indice)
	{
		return (GenBinario) genes.get(indice).clone();
	}
	
	public void setGen(int indice, GenBinario gen){
		genes.set(indice, gen);
	}

	/**
	 * Asigna un nuevo valor a los genes
	 *
	 * @param genesE: genes de entrada
	 */
	public void setGenes(ArrayList<GenBinario> genesE)
	{
		genes = genesE;
	}
	
	/**
	 * Devuelve el tama�o del gen i - �simo
	 * 
	 * @indice
	 * @return
	 */
	public int getTamGen(int indice)
	{
		return genes.get(indice).getTamGen();
	}
	
	/**
	 * Devuelve el bit i - �simo del gen j - �simo
	 * 
	 * @param indiceGen
	 * @param indiceBit
	 * @return
	 */
	public boolean getBitDeGen(int indiceGen, int indiceBit)
	{
		return genes.get(indiceGen).getBit(indiceBit);
	}
	
	/**
	 * Actualiza el valor del bit i - �simo del gen j - �simo
	 * 
	 * @param indiceGen
	 * @param indiceBit
	 * @param valor
	 */
	public void setBitDeGen(int indiceGen, int indiceBit, boolean valor)
	{
		genes.get(indiceGen).setBit(indiceBit, valor);
	}
	
	@Override
	public GenotipoBinario clone()
	{
		GenotipoBinario clon = new GenotipoBinario();
		for(int i = 0; i < genes.size(); i++)
		{
			clon.genes.add(i, (GenBinario) genes.get(i).clone());
		}
		
		return clon;
	}

}
