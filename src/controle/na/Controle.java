package controle.na;

//JOptionPane --> essa classe possibilita a criação de uma caixa de dialogo padrão que ou solicita 
//um valor para o usuário ou retorna uma informação
import static javax.swing.JOptionPane.*;
import java.util.ArrayList;
import java.util.List;
import pessoa.na.Pessoa;
import static java.lang.Integer.*;  //conversão para inteiro
import static java.lang.Double.*;  //conversão para double


public class Controle {

	//instancia do Array list
	
	List<Pessoa> lista = new ArrayList<Pessoa>();
	
	public void menu() {
		int opcao = 0; //inicializando a variavel opcao
		String aux = "Escolha uma opção";
		aux += "1. Cadastrar Empregado";
		aux += "2. Cadastrar Cliente";
		aux += "3. Pesquisar ";
		aux += "4. Listar Empregados ";
		aux += "5. Listar Clientes";
		aux += "6. Remover ";
		aux += "7. Finalizar";
		
		
	// tratamento de excessão
		do {
			try {
				opcao = parseInt(showInputDialog(aux));
			}
			catch(NumberFormatException e) {
				showMessageDialog(null, "A opção deve ser um número");
				
			}
		} while (opcao != 7); 
		
		
	}
	
	
}
