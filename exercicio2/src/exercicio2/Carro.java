package exercicio2;

public class Carro {

	String modelo, cor;
	int velocidadeAtual, velocidadeMaxima;
	boolean ligar;

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public void ligar (){
		
		if(ligar == true){
			System.out.println("O carro está ligado!");
		} else {
			System.out.println("O carro está desligado!");
		}
	}
	
	public void acelerar(){
		
		int x;
		velocidadeMaxima = 100;
			for(x = 0;x <= 110; x++){
				velocidadeAtual = x;
				System.out.println("A velocidade atual do veiculo é: " + velocidadeAtual);
				
				if(velocidadeAtual > velocidadeMaxima){
					System.out.println("O veiculo ultrapassou a velocidade limite");
				}
			}
		}
	
}
