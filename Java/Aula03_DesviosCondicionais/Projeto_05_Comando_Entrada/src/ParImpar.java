import java.util.Scanner; // Import necess�rio para utilizar a classe

public class ParImpar {
    public static void main(String[] args) {
        // Int�ncia do objeto (buffer) utilizando a classe Scanner
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite um n�mero inteiro: ");
        numero = entrada.nextInt(); // Recebe o n�mero

        // Verifica se o n�mero � par
        if ((numero % 2) == 0) {
            System.out.println("O n�mero " + numero + " � par");
        } else {
            System.out.println("O n�mero " + numero + " � �mpar");
        }
        entrada.close();
    } // fim do m�todo main
} // fim da classe ParImpar
