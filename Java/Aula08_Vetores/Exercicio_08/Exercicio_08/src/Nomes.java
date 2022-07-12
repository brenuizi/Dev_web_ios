import java.util.Scanner;

public class Nomes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[]nomes = new String[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome " +(i+1) + ":");
            nomes[i] = entrada.nextLine();
        }
        System.out.println(" ");
        for (int i = 4; i >= 0; i--) {
            System.out.println(nomes [i]);
        }
        entrada.close();
    }
}