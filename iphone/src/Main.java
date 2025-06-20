import br.com.dio.aparelhos.AparelhoTelefone;
import br.com.dio.aparelhos.NavegadorInternet;
import br.com.dio.aparelhos.ReprodutorMusical;
import static java.lang.System.in;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keybord = new Scanner(in);
        boolean sair = true;
        while (sair) {
            System.out.println("Escolha uma opção do Iphone: \n 1 - Reproduto musical. \n 2 - Aparelho telefone. \n 3 - Navegador. \n 4 - Sair.");
            int option = keybord.nextInt();
            switch (option) {
                case 1 -> {
                    ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
                    System.out.println("Escolha uma opção: \n 1 - Tocar música. \n 2 - Pausar música. \n 3 - Escolher música.");
                    int optionReprodutor = keybord.nextInt();
                    reprodutorMusical.selecionarOpcao(optionReprodutor);

                }
                case 2 -> {
                    AparelhoTelefone aparelhoTelefone = new AparelhoTelefone();
                    System.out.println("Escolha uma opção: \n 1 - Ligar. \n 2 - Atender. \n 3 - Iniciar correio de voz.");
                    int optionAparelho = keybord.nextInt();
                    aparelhoTelefone.selecionarOpcao(optionAparelho);
                }
                case 3 -> {
                    NavegadorInternet navegadorInternet = new NavegadorInternet();
                    System.out.println("Escolha uma opção: \n 1 - Acessar site. \n 2 - Nova aba. \n 3 - Atualizar página.");
                    int optionNavegador = keybord.nextInt();
                    navegadorInternet.selecionarOpcao(optionNavegador);
                }
                case 4 -> {
                    sair = false;
                }
                default -> System.out.println("Escolha uma opção valida.");
            }
        }
    }
}