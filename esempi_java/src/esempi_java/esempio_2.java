package esempi_java;
import java.util.*;



public class esempio_2 {

	String a="prova lettera";
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	Scanner leggere=new Scanner(System.in);
		
		
	String prova="ciauooo";
	
	String prova2="a tutti22"; 
	
	//uso del metodo EQUALS per verificare ugualianza
	if(prova.equals(prova2)) 
	{
		System.out.println("siii" );	
	}
	
	//uso del metodo concat(concatenare)
	System.out.println("nuovo valore concat:"+prova.concat(prova2));
	
	
	System.out.println("----"+ prova );
	
	//metodo charAt- prende carattere in certa posizione
    System.out.println( prova.charAt(3) );
    //metodo substring - prende caratteri dentro un intervallo
	System.out.println(prova.substring(1, 2) );
	
	//metodo indexOf per trovare la posizine di un carattere
	System.out.println("position: "+prova.indexOf("u"));
	
	int a;	
	}


	

	
	

}
