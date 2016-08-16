package exercicio1;

public class Fatura {

	String numero;
	String descricao;
	int quantidadeItem;
	double precoItem;
	double valorFatura;
	
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidadeItem() {
		return quantidadeItem;
	}
	public void setQuantidadeItem(int quantidadeItem) {
		this.quantidadeItem = quantidadeItem;
	}
	public double getPrecoItem() {
		return precoItem;
	}
	public void setPrecoItem(double precoItem) {
		this.precoItem = precoItem;
	}
	
	public double getValorFatura(){
		
		if(precoItem<0){
			precoItem = 0.0;
			
			if(valorFatura<0){
				valorFatura = 0;
			}
		}	
		valorFatura = quantidadeItem * precoItem;
		return valorFatura;
	}
	
}
