package esempi_java;
import java.util.*;


public class esempio {

	static String nome="jose";
	static String cognome="perez";
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
    int a;
	String prova_string;

	//per leggere dati
	Scanner leggere=new Scanner(System.in); 	
	
	System.out.println("------dammi il valore di a:");
	//come leggere un valora nextInt, nextFloat,nextDouble,...
	a=leggere.nextInt();
	//leggere un string
	prova_string=leggere.next();
	
	System.out.println("il valore di a:"+a);
	System.out.println("il valore di prova:"+prova_string);
	
	// creazione di figli a partire della classe padre Esempio
	esempio figlio=new esempio();
	esempio figlio1=new esempio();
	esempio figlio2=new esempio();
	
	System.out.println("il valore figlio, nome:"+figlio.nome);
	System.out.println("il valore figlio, cognome:"+figlio.cognome);
	//modificazione di attributi figli
	figlio.nome="francesco";
	figlio.cognome="santos";
	System.out.println("nuovo valore figlio, nome:"+figlio.nome);
	System.out.println("nuovo valore figlio, cognome:"+figlio.cognome);

	//chiamata ai metodi dei figli
	figlio.sommare(5);
	figlio1.sommare(6);
	figlio2.sommare(7);
		
	}//fine main
	
	
	//metodo per somma
	public void sommare(int arg)
	{
		arg=arg+5;
		//stampa argomento sommato
		System.out.println("valore di arg:"+arg);
		
	}//fine somma
	

}//fine classe



