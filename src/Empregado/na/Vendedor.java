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

    // metodo para calcular salario multiplica o total de vendas pelo valor da comiss�o (� porcentagem)
	@Override
	public double calcularSalario() {
		return totalDasVendas * comissao / 100;
	}
	
	//tostring --> metodo para retornar os dados (vem da classe pessoa)
	@Override
	public String toString() {
		String aux = super.toString();
		aux += "Total das vendas R$" + totalDasVendas + "/n";
		aux += "Comiss�o " + comissao + "%\n";
		return aux;
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
