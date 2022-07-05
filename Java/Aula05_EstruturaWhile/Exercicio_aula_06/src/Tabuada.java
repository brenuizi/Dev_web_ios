public class Tabuada {
    public static void main (String[] args) {
        int multiplicador = 5;
        int contador = 1;

        while(contador <= 10) {
         int resultado = multiplicador * contador;
         System.out.println(multiplicador + "x" + contador + "=" + resultado);
         contador++;
        }
    }
}
