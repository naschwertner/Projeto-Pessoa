package Empregado.na;

import bonus.na.Bonus;

public class Gerente extends Empregado implements Bonus {

	private double salario;
	private double bonus;
	
	public Gerente(String nome, String cpf, String matricula, double salario, double bonus) {
		super(nome, cpf, matricula);
		this.salario = salario;
		this.bonus = bonus;
	}

	//metodo para calcularBonus multiplica o valor do salario pelo valor do bônus (bonus é porcentagem)
	@Override
	public double calcularBonus() {
		return salario * bonus / 100;
    }
	
	//tostring --> metodo para retornar os dados (vem da classe pessoa)
	@Override
	public String toString() {
		return super.toString() + 
		salario+ "Salario R$ " +
		bonus+ "Bônus "  + "%n";
	}

	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	
}
