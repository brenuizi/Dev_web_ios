import java.util.Scanner;
public class ExerStrings {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] frutas = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite uma fruta " + (i + 1) + " :");
            String semResposta = entrada.nextLine();
            boolean acrescentar = true;

            for (int j = 0; j < 5; j++) {
                if (frutas[j] == null) {
                    continue;
                }
                if (semResposta.compareTo(frutas[j]) == 0 || semResposta.isEmpty() || semResposta.length() < 3) {
                    System.out.println("Inválido");
                    acrescentar = false;
                    break;
                }
            }
            if (acrescentar) {
                frutas[i] = semResposta;
            }
        }

        for (int i = 0; i < frutas.length; i++) {
            if (frutas[i] != null) {
                System.out.print(frutas[i].toUpperCase() + " ");
                System.out.print(frutas[i].toLowerCase() + " ");
                System.out.println(" ");
            }
        }
    }
}
