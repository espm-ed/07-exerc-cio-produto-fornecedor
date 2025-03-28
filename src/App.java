import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
public class App {
    
    ListaDupla<Produto> listaProduto = new ListaDupla<>();
    ListaDupla<Fornecedor> listaFornecedor = new ListaDupla<>();

    public static void main(String[] args) throws Exception {
        
        menuPrincipal();

    }

    public static void menuPrincipal() {
        String menu = "1. Cadastrar produto\n2. Pesquisar produto\n3. Pesquisar        fornecedor\n4. Finalizar";
        int opcao;
        int resposta;

        while(true) {
            opcao = parseInt(showInputDialog(menu));
            if(opcao == 4) {
                resposta = showConfirmDialog(null, "Tem certeza que deseja sair?");
                if(resposta == YES_OPTION) {
                    break;
                }
            }
        }
    }

}
