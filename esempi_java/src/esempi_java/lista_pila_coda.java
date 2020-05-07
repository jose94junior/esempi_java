package esempi_java;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lista_pila_coda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//creazione della lista
List Lista = new ArrayList();

//creazione di lista tipo String
List<String> Lista2 = new ArrayList<String>();

//aggiungere un elemento alla lista
      Lista2.add("Juan");
      Lista2.add("Pedro");
      Lista2.add("José67765");
      Lista2.add("María");
      Lista2.add("Sofía");

      //Lista2.size()---> dimensione della lista
      
      
      //Lista2.get(0)--> prendere un certo elemento
      System.out.println(Lista2.size());
      System.out.println(Lista2.get(0));
      System.out.println(Lista2);

//stampare elementi della lista
for (int i = 0; i <= Lista2.size() - 1; i++) 
{
    System.out.println(Lista2.get(i));
              
}//fine for



//Lista2.clear();

//metodo isEmpty--> sapere se la lista è uvota
System.out.println(Lista2.isEmpty());

//metodo contains--> sapere se la lista contiene un elemento
System.out.println(Lista2.contains("José"));
System.out.println("--------------------");
Lista2.set(1, "Félix");
System.out.println(Lista2);


	}//fine main
}//fine class
