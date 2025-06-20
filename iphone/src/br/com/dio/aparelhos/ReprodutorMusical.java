package br.com.dio.aparelhos;
import java.util.Scanner;

import static java.lang.System.in;

public class ReprodutorMusical {
    public void tocar(){
        System.out.println("Tocando música.");
    }
    public void pausar(){
        System.out.println("Pausando a música.");
    }
    public void selecionarMusica(String musica){
        System.out.println("Selecionando a música " + musica);
    }
    public void selecionarOpcao(int numero){
        Scanner keybord = new Scanner(in);
        switch (numero) {
            case 1 -> {
                tocar();
            }
            case 2 -> {
                pausar();
            }
            case 3 -> {
                System.out.println("Digite o nome de uma música: ");
                String musica = keybord.next();
                selecionarMusica(musica);

            }
            default -> System.out.println("Escolha uma opção valida.");
        }
    }
}
