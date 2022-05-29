 package controle.na;
//classe onde é colocada as funcionalidades, no futuro faz a interface com o banco de dados
//futuramente recebe dados, abre conexão como banco e faz insert 
 
  
//JOptionPane --> essa classe possibilita a criação de uma caixa de dialogo padrão que ou solicita 
//um valor para o usuário ou retorna uma informação
import static javax.swing.JOptionPane.*;
import java.util.ArrayList;
import java.util.List;
import pessoa.na.Pessoa;
import static java.lang.Integer.*;  //conversão para inteiro
import static java.lang.Double.*;  //conversão para double


public class Controle {

	//Lista dinâmica Array list
	
	private List<Pessoa> lista = new ArrayList<Pessoa>();
	
	//metodo que vai ser a interface com o main, os outros são todos privados
	public void menu() {
		int opcao = 0; //inicializando a variavel opcao
		String aux = "Escolha uma opção" + "\n";
		aux += "1. Cadastrar Empregado" + "\n";
		aux += "2. Cadastrar Cliente" + "\n";
		aux += "3. Pesquisar " + "\n";
		aux += "4. Listar Empregados " + "\n";
		aux += "5. Listar Clientes" + "\n";
		aux += "6. Remover " + "\n";
		aux += "7. Finalizar" + "\n";
		
		
	//tratamento de excessão
		do {
			try {
				opcao = parseInt(showInputDialog(aux)); //o que vem da janela grafica é uma string, precisa ser convertido para int
			    if(opcao < 1 || opcao > 7) {
			    	showMessageDialog(null, "Opção inválida   ");
			    } else { 
			    	switch(opcao) {
			    	case 1: 
			    		cadastrarEmpregado();
			    		break;
			    	}
			    }
			}
			catch(NumberFormatException e) {
				showMessageDialog(null, "A opção deve ser um número");
			}
		} while (opcao != 7); 
		
		
	}

	private void cadastrarEmpregado() {
		   int opcao;
		   String aux += "Escolha uma opção \n";
		   aux += "1. Cadastrar Vendedor \n";
		   aux += "2. Cadastrar Gerente \n";
		   aux += "3. sair";
		   
		   do {
			   try { //sempre converter, o que ver de janquela grafica sempre sera string
				   opcao = parseInte(showInputDialog(aux));
				   
			   }
		   }
		   
		
	}
	
	
}
