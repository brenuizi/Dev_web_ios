import java.util.Scanner;

public class ExercicioIfElse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String mes = "meses";
        System.out.println("Digite um mês: ");
        mes = entrada.nextLine();

        if (mes.equalsIgnoreCase("ABRIL")) {
            System.out.println("A estação climática do mês de " + mes + " é Outono");
        } else if (mes.equalsIgnoreCase("MAIO")) {
            System.out.println("A estação climática do mês de " + mes + " é Outono");
        } else if (mes.equalsIgnoreCase("JUNHO")) {
            System.out.println("A estação climática do mês de " + mes + " é Outono");
        } else if (mes.equalsIgnoreCase("JULHO")) {
            System.out.println("A estação climática do mês de " + mes + " é Inverno");
        } else if (mes.equalsIgnoreCase("AGOSTO")) {
            System.out.println("A estação climática do mês de " + mes + " é Inverno");
        } else if (mes.equalsIgnoreCase("SETEMBRO")) {
            System.out.println("A estação climática do mês de " + mes + " é Inverno");
        } else if (mes.equalsIgnoreCase("OUTUBRO")){
            System.out.println("A estação climática do mês de " + mes + " é Primavera");
        } else if (mes.equalsIgnoreCase("NOVEMBRO")){
            System.out.println("A estação climática do mês de " + mes + " é Primavera");
        } else if (mes.equalsIgnoreCase("DEZEMBRO")){
            System.out.println("A estação climática do mês de " + mes + " é Primavera");
        } else if (mes.equalsIgnoreCase("JANEIRO")){
            System.out.println("A estação climática do mês de " + mes + " é Verão");
        } else if (mes.equalsIgnoreCase("FEVEREIRO")){
            System.out.println("A estação climática do mês de " + mes + " é Verão");
        } else if (mes.equalsIgnoreCase("MARÇO")){
            System.out.println("A estação climática do mês de " + mes + " é Verão");
        }
    }
}