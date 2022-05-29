package Empregado.na;
import pessoa.na.Pessoa;

public class Empregado extends Pessoa {

	protected String matricula;

	public Empregado(String nome, String cpf, String matricula) {
		super(nome, cpf);
		this.matricula = matricula;
	}
	
	//tostring --> metodo para retornar os dados (vem da classe pessoa)
	@Override
	public String toString() {
		String aux = super.toString();
		aux += "Matricula " + matricula + "\n";
		return aux;
	}
	
	
	
}
