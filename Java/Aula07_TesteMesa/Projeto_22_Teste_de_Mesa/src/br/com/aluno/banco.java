package br.com.aluno;
import java.util.Scanner;

public class banco {
    public static void main(String[] args) {
        int menu;
        char voltar = 'S';
        Scanner entrada = new Scanner(System.in);

        while (voltar == 'S' || voltar == 's') {
            System.out.println(">>>>>>>CloudBank<<<<<<<");
            System.out.println("Por favor, selecione uma das op��es abaixo:");
            System.out.println("\n=======Op��es=======");
            System.out.println("\n1 - Conta corrente");
            System.out.println("2 - Conta poupan�a");
            System.out.println("3 - Conta estudante");
            System.out.println("\nInsira aqui:");

            menu = entrada.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Voc� selecionou a conta Corrente");
                    System.out.println("Voc� est� no CloudBank");
                    break;
                case 2:
                    System.out.println("Voc� selecionou a conta poupan�a");
                    System.out.println("Voc� est� no CloudBank");
                    break;
                case 3:
                    System.out.println("Voc� selecionou a conta Estudante");
                    System.out.println("Voc� est� no CloudBank");
                    break;
                default:
                    System.out.println("Op��o inv�lida!");


            }
            System.out.println("Deseja refazer a opera��o? (S/N)");
            voltar = entrada.next().charAt(0);
        }
    }
}

