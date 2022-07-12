import java.util.Scanner;

public class Matriz1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero[][] = new int[4][4];
        int inicial = 0;

        for (int i = 0; i <numero.length; i++) {
            for (int j = 0; j <numero[i].length; j++) {
                System.out.println("Insira um número para a posição: ["+i+"]["+j+"]");
                numero[i][j] = entrada.nextInt();
            }
        }
        System.out.println (">>>>>>>>>>Números maiores que 10<<<<<<<<<<");
        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[i].length; j++) {

                if (numero[i][j] > 10) {
                    System.out.println("[ " + numero[i][j] + " ] \t");
                    inicial++;
                }
            }
        }
        System.out.println("Encontramos " + inicial + " números no Array maior que 10");
        System.out.println(" ");

        System.out.println(">>>>>>>>>>Elementos da Matriz<<<<<<<<<<");


        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[i].length; j++) {
                System.out.print(numero[i][j] + "\t");
            }
            System.out.println(" ");
        }
        entrada.close();
    }
}