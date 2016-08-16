package exercicio3;

public class Conexao {
	public static void main(String[] args) {
		Singleton singleton = null;
		int x;
		for (x = 0; x<=10; x++){
			singleton = Singleton.getInstace();
		}
	}

}
