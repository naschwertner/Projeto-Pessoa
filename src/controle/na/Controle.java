package controle.na;

//JOptionPane --> essa classe possibilita a cria��o de uma caixa de dialogo padr�o que ou solicita 
//um valor para o usu�rio ou retorna uma informa��o
import static javax.swing.JOptionPane.*;
import java.util.ArrayList;
import java.util.List;
import pessoa.na.Pessoa;
import static java.lang.Integer.*;  //convers�o para inteiro
import static java.lang.Double.*;  //convers�o para double


public class Controle {

	//instancia do Array list
	
	List<Pessoa> lista = new ArrayList<Pessoa>();
	
	public void menu() {
		int opcao = 0; //inicializando a variavel opcao
		String aux = "Escolha uma op��o";
		aux += "1. Cadastrar Empregado";
		aux += "2. Cadastrar Cliente";
		aux += "3. Pesquisar ";
		aux += "4. Listar Empregados ";
		aux += "5. Listar Clientes";
		aux += "6. Remover ";
		aux += "7. Finalizar";
		
		
	// tratamento de excess�o
		do {
			try {
				opcao = parseInt(showInputDialog(aux));
			}
			catch(NumberFormatException e) {
				showMessageDialog(null, "A op��o deve ser um n�mero");
				
			}
		} while (opcao != 7); 
		
		
	}
	
	
}
