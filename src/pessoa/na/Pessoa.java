package pessoa.na;

//tostring é classe de object, implicitamente tem esse extends object
public abstract class Pessoa extends Object {

	protected String nome;
	protected String cpf;
	
	public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	//tostring --> metodo para retornar os dados //(tostring vem da classe object)
	@Override
	public String toString() {
		return nome+ " "+ cpf+ " ";
	}

	
//	@Override
//	public String toString() {
//		String aux= "";
//		aux += "Nome: " +nome  + "\n";
//		aux += "cpf: " +cpf  + "\n";
//		return aux;
//	
	


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}
