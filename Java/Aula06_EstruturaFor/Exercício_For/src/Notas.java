import java.util.Scanner;

public class Notas {
    public static void main(String[] args){
       Scanner entrada = new Scanner(System.in);
       int acumulando = 0;
       for(int vezes = 1; vezes <=8; vezes++){
           System.out.println("Digite um número: ");
           int nota = entrada.nextInt();
           acumulando += nota;
       }
       System.out.println("A sua média é " + acumulando / 8 );
    }
}
