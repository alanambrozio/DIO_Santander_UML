package br.com.dio.aparelhos;

import java.util.Scanner;

import static java.lang.System.in;

public class AparelhoTelefone {
    public void ligar(String numero){
        System.out.printf("Ligando para o número %s.",numero);
    }
    public void atender(){
        System.out.println("Atendendo ligação.");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Reproduzindo correio de voz.");
    }
    public void selecionarOpcao(int numero){
        Scanner keybord = new Scanner(in);
        switch (numero) {
            case 1 -> {
                System.out.println("Digite um número para ligar: ");
                String numeroTelefone = keybord.next();
                ligar(numeroTelefone);
            }
            case 2 -> {
                atender();

            }
            case 3 -> {
                iniciarCorreioVoz();

            }
            default -> System.out.println("Escolha uma opção valida.");
        }
    }
}
