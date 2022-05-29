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
		String aux = super.toString();
		aux += "Valor da divida " + valorDaDivida + "\n";
		return aux;
	}

	
	public double getValorDaDivida() {
		return valorDaDivida;
	}

	public void setValorDaDivida(double valorDaDivida) {
		this.valorDaDivida = valorDaDivida;
	}
	
	
	
	
	
}
