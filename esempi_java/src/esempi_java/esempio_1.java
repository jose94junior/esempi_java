package esempi_java;

public class esempio_1 {

//attributi della calsse
String nome="jose";
String cognome="perez";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a;
		a="hola";
		
		//Scanner sc = new Scanner(System.in);
		esempio_1 b=new esempio_1();
		//modifica attributi del figlio
		b.nome="nuevo nome";
		b.cognome="nuevo cognome";
		System.out.println(b.nome);
		System.out.println(b.cognome);
		//uso del metodo ereditato
		b.metodo_1(5);
		
	}

	public void metodo_1(int a)
	{ 
		a=a+5;
		System.out.println("prueba:"+a);
	}//fine metodo
}
