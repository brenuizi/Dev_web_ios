public class Par_Impar {
    public static void main(String[] args) {
        int contador = 1;

        while (contador <= 10) {
            if (contador % 2 == 0) {
                System.out.println("Número par: " + contador);
            } else {
                System.out.println("Número ímpar: " + contador);
            }
            contador++;
        }
    }
}