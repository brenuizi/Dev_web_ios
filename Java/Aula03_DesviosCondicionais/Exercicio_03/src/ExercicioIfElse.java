import java.util.Scanner;

public class ExercicioIfElse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String mes = "meses";
        System.out.println("Digite um m�s: ");
        mes = entrada.nextLine();

        if (mes.equalsIgnoreCase("ABRIL")) {
            System.out.println("A esta��o clim�tica do m�s de " + mes + " � Outono");
        } else if (mes.equalsIgnoreCase("MAIO")) {
            System.out.println("A esta��o clim�tica do m�s de " + mes + " � Outono");
        } else if (mes.equalsIgnoreCase("JUNHO")) {
            System.out.println("A esta��o clim�tica do m�s de " + mes + " � Outono");
        } else if (mes.equalsIgnoreCase("JULHO")) {
            System.out.println("A esta��o clim�tica do m�s de " + mes + " � Inverno");
        } else if (mes.equalsIgnoreCase("AGOSTO")) {
            System.out.println("A esta��o clim�tica do m�s de " + mes + " � Inverno");
        } else if (mes.equalsIgnoreCase("SETEMBRO")) {
            System.out.println("A esta��o clim�tica do m�s de " + mes + " � Inverno");
        } else if (mes.equalsIgnoreCase("OUTUBRO")){
            System.out.println("A esta��o clim�tica do m�s de " + mes + " � Primavera");
        } else if (mes.equalsIgnoreCase("NOVEMBRO")){
            System.out.println("A esta��o clim�tica do m�s de " + mes + " � Primavera");
        } else if (mes.equalsIgnoreCase("DEZEMBRO")){
            System.out.println("A esta��o clim�tica do m�s de " + mes + " � Primavera");
        } else if (mes.equalsIgnoreCase("JANEIRO")){
            System.out.println("A esta��o clim�tica do m�s de " + mes + " � Ver�o");
        } else if (mes.equalsIgnoreCase("FEVEREIRO")){
            System.out.println("A esta��o clim�tica do m�s de " + mes + " � Ver�o");
        } else if (mes.equalsIgnoreCase("MAR�O")){
            System.out.println("A esta��o clim�tica do m�s de " + mes + " � Ver�o");
        }
    }
}