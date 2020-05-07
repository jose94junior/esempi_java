package esempi_java;
import java.util.*;



public class vettori {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner leggere=new Scanner(System.in);	
	
     int vettore_a[];
     int matrice_a[][];
     int dim, r,c;
     
    System.out.println("dammi valore Dim:"); 
	dim=leggere.nextInt();
	r=leggere.nextInt();
	c=leggere.nextInt();
	
	//dimensionamento degli array
	vettore_a=new int[dim];
	matrice_a=new int[r][c];
	
	
	System.out.println("dammi i valori del vett:");
	for(int i=0;i<vettore_a.length;i++)
	{
		//inserimento valori del vettore
		vettore_a[i]=leggere.nextInt();
		
	}//fine
	System.out.println("valori precedenti vettore:"+ Arrays.toString(vettore_a));	
	
	//ordinamento del vettore
	Arrays.sort(vettore_a);
	
	//conversione vettore INT to String
	System.out.println("valori ordinati vettore:"+ Arrays.toString(vettore_a));
	
	
	System.out.println("inserire valori mat:");
	
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			//inserimento valori della matrice
			matrice_a[i][j]=leggere.nextInt();
			
		}
		
	}//fine
	
	
	//stampa della matrice
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			System.out.print(matrice_a[i][j]);
			
		}
		System.out.println("\n");
	}//fine
	
	
	

	}//fine main

}
