import java.util.Scanner;

public class Dia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Para um dia da semana, digite um número: ");
        int diaSemana = entrada.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("1 é Domingo");
                break;
                case 2:
                System.out.println("2 é Segunda-feira");
                break;
                case 3:
                System.out.println("3 é Terça-feira");
                break;
                case 4:
                System.out.println("4 é Quarta-feira");
                break;
                case 5:
                System.out.println("5 é Quinta-feira");
                break;
                case 6:
                System.out.println("6 é Sexta-feira");
                break;
                case 7:
                System.out.println("7 é Sábado");
                break;

            default:
                System.out.println("Inválido, entre 1 e 7!");
        }
        entrada.close();
    }
}