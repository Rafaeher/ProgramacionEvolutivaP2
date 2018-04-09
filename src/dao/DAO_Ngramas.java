package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;



public class DAO_Ngramas
{
	private final static String RUTA = "ngrams/";
	public final static int NMAX = 5;
	
	/**
	 * Obtiene un HashMap que contiene los n -gramas y sus frecuencias relativas, con n dado.
	 * 
	 * @param n
	 * @return un HashMap en el que la clave es el ngrama y el valor es un par del cual el
	 * primer elemento se inicializa a 0 y el segundo es la frecuencia relativa del ngrama
	 */
   public static HashMap<String, Double> lectura(int n)
   {
      File archivo = null;
      FileReader fileReader = null;
      BufferedReader bufferedReader = null;
      HashMap<String, Double> resultado = new HashMap<String, Double>();
      Double total = 0.0;
      try
      {
         archivo = new File (RUTA + obtenerNombreFichero(n));
         fileReader = new FileReader (archivo);
         bufferedReader = new BufferedReader(fileReader);

         String linea;
         while((linea=bufferedReader.readLine()) != null)
         {
            String[] separacion = linea.split(" ");
            String ngrama = separacion[0];
            Double frecuencia = Double.valueOf(separacion[1]);
                        
            resultado.put(ngrama, frecuencia);
            total = total + (frecuencia);
         }
         
         
         for(String ngrama : resultado.keySet()) // Para cada n - grama, añade al resultado el n - grama con su frecuencia relativa
         {
        	 Double frecuenciaRelativa = resultado.get(ngrama) / (total);
        	 resultado.replace(ngrama, frecuenciaRelativa);
         }
      }
      catch(Exception e)
      {
         e.printStackTrace();
      }
      finally
      {
         try
         {                    
            if( null != fileReader )
            {   
               fileReader.close();     
            }                  
         }
         catch (Exception e2)
         { 
            e2.printStackTrace();
         }
      }
      
      return resultado;
   }
   
   /**
    * Obtiene el nombre del fichero de los n - gramas, con n dado
    * 
    * @param n
    * @return
    */
   private static String obtenerNombreFichero(int n)
   {
	   switch(n)
	   {
	   case 1: return "monograms.txt";
	   case 2: return "bigrams.txt";
	   case 3: return "trigrams.txt";
	   case 4: return "quadgrams.txt";
	   case 5: return "quintgrams.txt";
	   default: return "words.txt";
	   }
   }
   
   public static void main(String[] args)
   {
	   HashMap<String, Double> ngramas = DAO_Ngramas.lectura(1);
	   
	   Double total = 0.0;
	   
	   for(String ngrama : ngramas.keySet())
	   {
		   System.out.println(ngrama + "    " + ngramas.get(ngrama).toString());
		   total += ngramas.get(ngrama);
	   }
	   
	   System.out.println("TOTAL " + total);
   }
}