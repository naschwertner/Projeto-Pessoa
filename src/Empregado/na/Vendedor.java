package Empregado.na;
import salario.na.Salario;

public class Vendedor extends Empregado implements Salario {

	private double totalDasVendas;
	private double comissao;
	
	public Vendedor(String nome, String cpf, String matricula, double totalDasVendas, double comissao) {
		super(nome, cpf, matricula);
		this.totalDasVendas = totalDasVendas;
		this.comissao = comissao;
	}

    // metodo para calcular salario multiplica o total de vendas pelo valor da comissão (é porcentagem)
	@Override
	public double calcularSalario() {
		return totalDasVendas * comissao / 100;
	}
	
	//tostring --> metodo para retornar os dados (vem da classe pessoa)
	@Override
	public String toString() {
		return super.toString() +
		totalDasVendas+ "total das vendas: " +
		comissao+ "Comissão: "  + "%n" ;
	}
	

	public double getTotalDasVendas() {
		return totalDasVendas;
	}

	public void setTotalDasVendas(double totalDasVendas) {
		this.totalDasVendas = totalDasVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	

}
