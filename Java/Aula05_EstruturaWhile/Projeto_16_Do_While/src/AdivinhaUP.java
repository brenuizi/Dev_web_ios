import java.util.Scanner; // Import necess�rio para utilizar a classe Scanner
import java.util.Random; // Import necess�rio para utilizar a classe Random

public class AdivinhaUP {
    public static void main(String[] args) {
        // Inst�ncia (buffer) utilizando a classe Scanner
        Scanner entrada = new Scanner(System.in);
        // Inst�ncia utilizando a classe Random
        Random rand = new Random();
        int palpite, num = 0;
        num = rand.nextInt(10) + 1;

        do {
            System.out.println("Digite seu palpite:");
            palpite = entrada.nextInt();
            if (palpite == num) {
                System.out.println("Voc� acertou!!!");
            } else {
                if (palpite < num) {
                    System.out.println("Seu palpite est� abaixo.");
                } else {
                    System.out.println("Seu palpite est� acima.");
                }
            }
        } while (palpite != num);

        entrada.close();
    }
} // fim do m�todo main