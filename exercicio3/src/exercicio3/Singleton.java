package exercicio3;

public class Singleton {

	private Singleton(){
	}
	
	private static Singleton instace = null;
	public static Singleton getInstace(){
		if (instace == null){
			System.out.println("Criando instancia...");
			instace = new Singleton();
			System.out.println("Instancia criada!");
		}
		return instace;
	}
}
