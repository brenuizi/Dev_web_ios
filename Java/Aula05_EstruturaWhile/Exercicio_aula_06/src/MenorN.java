import java.util.Scanner;

public class MenorN {
    public static void main(String[] args) {
        System.out.println("Digite 10 n�meros: ");
        Scanner entrada = new Scanner(System.in);
        int menorNumero = entrada.nextInt();

        int contador = 0;
        while (contador < 9) {
            int numero = entrada.nextInt();
            if(numero < menorNumero){
                menorNumero = numero;
            }
            contador++;
        }
        System.out.println("O menor n�mero �: " + menorNumero);
    }
}

