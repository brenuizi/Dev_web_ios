import java.util.Scanner;

public class ExemploIdadeWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
    int i = 0, idade;

    while (i < 5) {
        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();
        System.out.println("Sua idade é: " +idade);
        i++;

        if (i == 5){
            System.out.println("Limite atingido");
        }
    }
}
}

