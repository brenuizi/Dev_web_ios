import java.util.Scanner;

public class Inteiro {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println(" Digite um número: ");
        int numero1 = entrada.nextInt();

        System.out.println(" Digite um segundo número: ");
        int numero2 = entrada.nextInt();

        System.out.println(" Digite um terceiro número: ");
        int numero3 = entrada.nextInt();

        if (numero1 == numero2 && numero1 == numero3) {
            System.out.println("Os números são iguais " + numero1 + " " + numero2 + " " + numero3);
        }
        else if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O primeiro número é maior: O " + numero1);
        }
        else if (numero2 >numero3 && numero2 > numero1){
            System.out.println("O segundo número é maior: O " + numero2);
        }
        else {
            System.out.println("O terceiro número é maior: O " + numero3);
        }
        entrada.close();
    }
}