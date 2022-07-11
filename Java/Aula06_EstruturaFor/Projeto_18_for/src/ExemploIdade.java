import java.util.Scanner;

public class ExemploIdade {
    public static void main(String[]args){
        Scanner entrada = new Scanner (System.in);

        for(int i = 0; i <5; i++){
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Sua idade é: " +idade);
        }

        //Loop no while
        //int idade = 0;
        //while (idade < 5){
           // System.out.println("Sua idade é: " +idade);
            //idade++;
        }
    }



