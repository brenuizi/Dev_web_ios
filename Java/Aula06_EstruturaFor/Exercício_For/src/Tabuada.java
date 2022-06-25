import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número para multiplicação:");

        int mult = entrada.nextInt();

        //Tabuada
        for (int i = 0; i <= 10; i++) {
            System.out.println(mult + " X " + i + " = " + mult * i);
        }

        //Raiz quadrada
        System.out.println("\nA raiz quadrada de " + mult + " é " + Math.sqrt(mult));

        //Par ou ímpar
        if(mult % 2 == 0) {
            System.out.println("\nEsse número é par " + mult);
        }else{
            System.out.println("\nEsse número é ímpar " + mult);
        }
    }

}
