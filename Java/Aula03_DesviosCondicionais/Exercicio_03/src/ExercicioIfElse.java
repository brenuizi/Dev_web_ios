import java.util.Scanner;

public class ExercicioIfElse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String mes = "meses";
        System.out.println("Digite um m�s: ");
        mes = entrada.nextLine();

        if (mes.equalsIgnoreCase("ABRIL")) {
            System.out.println("A esta��o do m�s de " + mes + " � Outono");
        } else if (mes.equalsIgnoreCase("MAIO")) {
            System.out.println("A esta��o do m�s de " + mes + " � Outono");
        } else if (mes.equalsIgnoreCase("Junho")) {
            System.out.println("A esta��o do m�s de " + mes + " � Outono");
        } else if (mes.equalsIgnoreCase("JULHO")) {
            System.out.println("A esta��o do m�s de " + mes + " � Inverno");
        } else if (mes.equalsIgnoreCase("AGOSTO")) {
            System.out.println("A esta��o do m�s de " + mes + " � Inverno");
        } else if (mes.equalsIgnoreCase("SETEMBRO")) {
            System.out.println("A esta��o do m�s de " + mes + " � Inverno");
        } else if (mes.equalsIgnoreCase("OUTUBRO")){
            System.out.println("A esta��o do m�s de " + mes + " � Primavera");
        } else if (mes.equalsIgnoreCase("")){
            System.out.println("A esta��o do m�s de " + mes + " � Primavera");
        }
    }
}