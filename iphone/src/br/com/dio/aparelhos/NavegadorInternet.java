package br.com.dio.aparelhos;

import java.util.Scanner;

import static java.lang.System.in;

public class NavegadorInternet {
    public void exibirPagina(String url){
        System.out.println("Você acessou o site: " + url);
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba.");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando a página.");
    }
    public void selecionarOpcao(int numero) {
        Scanner keybord = new Scanner(in);
        switch (numero) {
            case 1 -> {
                System.out.println("Digite o URL do site: ");
                String url = keybord.next();
                exibirPagina(url);
            }
            case 2 -> {
                adicionarNovaAba();
            }
            case 3 -> {
                atualizarPagina();
            }
            default -> System.out.println("Escolha uma opção valida.");
        }
    }
}
