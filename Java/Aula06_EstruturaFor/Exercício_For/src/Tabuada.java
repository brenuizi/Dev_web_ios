import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um n�mero para multiplica��o:");

        int mult = entrada.nextInt();

        //Tabuada
        for (int i = 0; i <= 10; i++) {
            System.out.println(mult + " X " + i + " = " + mult * i);
        }

        //Raiz quadrada
        System.out.println("\nA raiz quadrada de " + mult + " � " + Math.sqrt(mult));

        //Par ou �mpar
        if(mult % 2 == 0) {
            System.out.println("\nEsse n�mero � par " + mult);
        }else{
            System.out.println("\nEsse n�mero � �mpar " + mult);
        }
    }

}
