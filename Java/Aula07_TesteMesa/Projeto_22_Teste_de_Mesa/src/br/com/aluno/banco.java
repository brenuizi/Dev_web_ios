package br.com.aluno;
import java.util.Scanner;

public class banco {
    public static void main(String[] args) {
        int menu;
        char voltar = 'S';
        Scanner entrada = new Scanner(System.in);

        while (voltar == 'S' || voltar == 's') {
            System.out.println(">>>>>>>CloudBank<<<<<<<");
            System.out.println("Por favor, selecione uma das opções abaixo:");
            System.out.println("\n=======Opções=======");
            System.out.println("\n1 - Conta corrente");
            System.out.println("2 - Conta poupança");
            System.out.println("3 - Conta estudante");
            System.out.println("\nInsira aqui:");

            menu = entrada.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Você selecionou a conta Corrente");
                    System.out.println("Você está no CloudBank");
                    break;
                case 2:
                    System.out.println("Você selecionou a conta poupança");
                    System.out.println("Você está no CloudBank");
                    break;
                case 3:
                    System.out.println("Você selecionou a conta Estudante");
                    System.out.println("Você está no CloudBank");
                    break;
                default:
                    System.out.println("Opção inválida!");


            }
            System.out.println("Deseja refazer a operação? (S/N)");
            voltar = entrada.next().charAt(0);
        }
    }
}

