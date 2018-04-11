package genotipo.genes;

import java.util.Random;

public class GenReal implements Cloneable
{
	private double valor;
	private double minimo;
	private double maximo;
	
	public GenReal()
	{
		
	}
	
	public GenReal(double valorE, double minimoE, double maximoE)
	{
		valor = valorE;
		minimo = minimoE;
		maximo = maximoE;
	}
	
	public GenReal(double minimoE, double maximoE)
	{
		minimo = minimoE;
		maximo = maximoE;
	}
	
	public double getValor()
	{
		return valor;
	}
	
	public double minimo()
	{
		return minimo;
	}
	
	public double getMaximo()
	{
		return maximo;
	}
	
	public void setValor(double valorE)
	{
		valor = valorE;
	}
	
	public void setMinimo(double minimoE)
	{
		minimo = minimoE;
	}
	
	public void setMaximo(double maximoE)
	{
		maximo = maximoE;
	}
	
	public void inicializaValorAleatoriamente(double precision)
	{
		Random random = new Random();
		int numDecimales = (int) Math.round((Math.log10(1.0 / precision)));
		valor = random.nextDouble() * (maximo - minimo) + minimo;
		valor = redondeo(valor, numDecimales);
	}
	
	public static double redondeo(final double valorInicial, final int numeroDecimales)
	{
        double parteEntera, resultado;
        resultado = valorInicial;
        parteEntera = Math.floor(resultado);
        resultado =(resultado-parteEntera)*Math.pow(10, numeroDecimales);
        resultado = Math.round(resultado);
        resultado = (resultado/Math.pow(10, numeroDecimales))+parteEntera;
        return resultado;
    }
	
	@Override
	public Object cloneGenotipo()
	{
		return new GenReal(valor, minimo, maximo);
	}
}
