import java.util.Scanner; // Import necess�rio para utilizar a classe 

public class Media {
    public static void main(String[] args) {
        // Int�ncia do objeto (buffer) utilizando a classe Scanner
        Scanner entrada = new Scanner(System.in);
        // Declara��o de vari�veis
        String aluno;
        double nota1, nota2, media;
        System.out.println("Digite seu nome: ");
        aluno = entrada.nextLine(); // Recebe o nome do aluno

        System.out.println("Digite duas notas");
        nota1 = entrada.nextDouble(); // Recebe a primeira nota
        nota2 = entrada.nextDouble(); // Recebe a segunda nota

        media = (nota1 + nota2) / 2; // Calcula a m�dia das notas

        System.out.println(aluno + " sua m�dia �: " + media); // Exibe a m�dia

        entrada.close(); // Encerra a inst�ncia
    } // fim do m�todo main
} // fim da classe Media