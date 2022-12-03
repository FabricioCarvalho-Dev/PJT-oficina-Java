import javax.swing.JOptionPane;
public class Ofic_Carros {

	 public static void main(String[] args) {
	        int menu;
	        Oficina oficina = new Oficina();        
	        do{
	            menu = Integer.parseInt(JOptionPane.showInputDialog("Oficina Carros\n"
	                    + "1 - Fazer entrada do carro \n2 - Fazer saida do Carro\n"
	                    + "3 - Listar carro com serviço \n4 - Listar Vagas disponiveis\n"
	                    + "0 - Sair do Sistema"));
	            switch(menu){
	                case 1: oficina.entrada(); break;
	                case 2: oficina.saida(); break;
	                case 3: oficina.listarCarros_serv();break;
	                case 4: oficina.listarVagas();break;     
	                case 0: JOptionPane.showMessageDialog(null,"Fim do Sistema"); break;
	                default: JOptionPane.showMessageDialog(null,"Opção Invalida");
	            }
	        }while(menu!=0);
	    }
}
