import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int maior;
        int menor;
        int[] numeros = new int[10];
        int tamanho = numeros.length;

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = entrada.nextInt();
        }

        maior = numeros[0];
        for (int i = 0; i < tamanho; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("O maior número é: " + maior);

        menor = numeros[0];
        for (int i = 0; i < tamanho; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("O menor número é: " + menor);

        float media, soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        media = soma / numeros.length;

        System.out.println("A média das notas é: " + media);
        entrada.close();
    }
}
