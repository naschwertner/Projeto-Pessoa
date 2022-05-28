package cliente.na;
import pessoa.na.Pessoa;

public class Cliente extends Pessoa{

	private double valorDaDivida;

	
	public Cliente(String nome, String cpf, double valorDaDivida) {
		super(nome, cpf);
		this.valorDaDivida = valorDaDivida;
	}

	//tostring --> metodo para retornar os dados (vem da classe pessoa)
	@Override
	public String toString() {
		return super.toString() + valorDaDivida+ "Valor da divida R$ " ;
	}
	//super.toString() pega o tostring da classe Pessoa

	
	//@Override
		//public String toString() {
		//	String aux = super.toString();
		//	aux += "Valor da dívida R$ " + valorDaDivida + "\n";
		//	return aux;
		//}
	
	
	public double getValorDaDivida() {
		return valorDaDivida;
	}

	public void setValorDaDivida(double valorDaDivida) {
		this.valorDaDivida = valorDaDivida;
	}
	
	
	
	
	
}
