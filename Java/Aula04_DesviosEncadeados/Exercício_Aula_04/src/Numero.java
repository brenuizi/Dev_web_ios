import java.util.Scanner;
public class Numero {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número:");
        float numero1 = entrada.nextFloat();
        System.out.println("Digite outro número:");
        float numero2 = entrada.nextFloat();

        if (numero1 > numero2) {
            System.out.println("Decrescente");
            System.out.println("Primeiro número: " + numero1);
            System.out.println("Segundo número: " + numero2);
        }
        else  {
            if (numero1 < numero2) {
                System.out.println("Decrescente");
                System.out.println("Segundo número: " + numero2);
                System.out.println("Primeiro número: " + numero1);
            }
        }
        entrada.close();
    }
}
