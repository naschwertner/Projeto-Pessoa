 package controle.na;
//classe onde � colocada as funcionalidades, no futuro faz a interface com o banco de dados
//futuramente recebe dados, abre conex�o como banco e faz insert 
 
  
//JOptionPane --> essa classe possibilita a cria��o de uma caixa de dialogo padr�o que ou solicita 
//um valor para o usu�rio ou retorna uma informa��o
import static javax.swing.JOptionPane.*;
import java.util.ArrayList;
import java.util.List;
import pessoa.na.Pessoa;
import static java.lang.Integer.*;  //convers�o para inteiro
import static java.lang.Double.*;  //convers�o para double


public class Controle {

	//Lista din�mica Array list
	
	private List<Pessoa> lista = new ArrayList<Pessoa>();
	
	//metodo que vai ser a interface com o main, os outros s�o todos privados
	public void menu() {
		int opcao = 0; //inicializando a variavel opcao
		String aux = "Escolha uma op��o" + "\n";
		aux += "1. Cadastrar Empregado" + "\n";
		aux += "2. Cadastrar Cliente" + "\n";
		aux += "3. Pesquisar " + "\n";
		aux += "4. Listar Empregados " + "\n";
		aux += "5. Listar Clientes" + "\n";
		aux += "6. Remover " + "\n";
		aux += "7. Finalizar" + "\n";
		
		
	//tratamento de excess�o
		do {
			try {
				opcao = parseInt(showInputDialog(aux)); //o que vem da janela grafica � uma string, precisa ser convertido para int
			    if(opcao < 1 || opcao > 7) {
			    	showMessageDialog(null, "Op��o inv�lida   ");
			    } else { 
			    	switch(opcao) {
			    	case 1: 
			    		cadastrarEmpregado();
			    		break;
			    	}
			    }
			}
			catch(NumberFormatException e) {
				showMessageDialog(null, "A op��o deve ser um n�mero");
			}
		} while (opcao != 7); 
		
		
	}

	private void cadastrarEmpregado() {
		   int opcao;
		   String aux += "Escolha uma op��o \n";
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
