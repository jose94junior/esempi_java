package esempi_java;
import java.util.Arrays;


public class macchina {


	String matricola;
	String colore;
	String marchio;
	String modello;
	boolean disponibile;
	
	
	//creazione metodo costruttore
	public macchina(String matricola, 
					String colore, 
					String marchio, 
					String modello, 
					boolean disponibile  )
	{
	 this.matricola=matricola;
	 this.colore=colore;
	 this.marchio=marchio;
	 this.modello=modello;
	 this.disponibile=disponibile;
		
	}//fine costruttore
	
	
 	
	public static void main(String[] args){
		// TODO Auto-generated method stub

		
	//creazione oggetti a partire della classe macchina
	macchina modello1=new macchina("17lK","RED","BMW","X5",true);
	macchina modello2=new macchina("13HK","GREY","TOYOTA","MBN",false);
	/*
	System.out.println(modello1.colore);
	System.out.println(modello1.matricola);
	System.out.println(modello1.modello);
	System.out.println(modello1.marchio);
	System.out.println(modello1.disponibile);
	*/
	//stampa valori degli oggetti modello 1 e 2
	System.out.println("-----------------");
	System.out.println(modello2.colore);
	System.out.println(modello2.matricola);
	System.out.println(modello2.modello);
	System.out.println(modello2.marchio);
	System.out.println(modello2.disponibile);
	
	System.out.println("----valore:"+modello2.get_matricola());
			
	
	System.out.println("valore modificato:" + modello2.m_matricola( Integer.toString(567) ) );


	
	}
	

	
	//metodo che ritorna la matricola
	public String get_matricola()
	{
		return this.matricola;
		
	}//fine 
	
	//metodo modifica matricola
	public String m_matricola(String nuova_m)
	{
		return this.matricola=nuova_m;
		
	}//fine 
	


}
