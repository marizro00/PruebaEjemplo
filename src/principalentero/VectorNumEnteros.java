/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package principalentero;

/**
 *
 * @author SOLEDAD
 */
import java.util.*;
public class VectorNumEnteros {
    
    int vector[];
	//int Dim;
	   int Dim=7;
	   Scanner entrada,entrada2;
	   public VectorNumEnteros(){
	       
	  // constructor     
	   vector = new int[Dim];
	   entrada = new Scanner (System.in);
	   entrada2=new Scanner(System.in);
	   }
	   public void cargaVector(){
		   //System.out.println("\n se ingresa la cantidad de numeros del vector  ");
		   //Dim=entrada.nextInt();
			for (int i = 0; i < vector.length; i++) {
				System.out.println("\n se ingresa los numeros enteros del vector  ");		
			    vector[i]=entrada.nextInt();
			}
			
		}
	   public void imprimir(){
	   
	   System.out.println("\n Listado del vector de numeros enteros es : ");
			
	   //System.out.print("---------------------------------------------------------");
	    for (int i = 0; i < vector.length; i++) {
			System.out.print("--------------------------------------------------------");	
				System.out.println("\n El numero almacenado en la posición: " + i
						+ ", es el: " +vector[i]);
				
			}
	   
	   }
	   public void verPar(){
		   int i;
		   int par;
		   int ci=0;
		   for(i=0;i<vector.length;i++){
			   par=(vector[i]/2)*2;
			   if(par==vector[i]){
				   if(vector[i]<32){
					   vector[i]=vector[i]*2;
					   System.out.println("el par es menor a 32 es: "+vector[i]);
				   }
				   else{
					   if(vector[i]>50){
						   vector[i]=vector[i]/2;
						   System.out.println("el par es mayor a 50 es: "+vector[i]);
					   }
				   }
			   }
			   //i++;
			   else{
				   ci=ci+1;
				  // ordenarDecreciente();
			   }
		   }
		   System.out.println("la cantidad de impares es "+ci);
	   }
	   public void ordenarDecreciente(){
		   int i,b;
		   do
		           {
		           b=0;
                           System.out.println("Pasa");
		           for (i=0;i< vector.length-1;i++)
		                   {
		                   if (vector[i]<vector[i+1])
		                           {
		                           intercambio(vector[i],vector[i+1]); /*intercambio los elementos desordenados*/
		                           b=1;
		                           }
		                   }
		           }
		           
		 while(b==0);
	   }
	 public void intercambio(int x , int y)
	   {
               System.out.println("intercambio");
	   int temp;
	   temp = x;
	   x = y;
	   y = temp;
	  // imprimir();
	   }
}
