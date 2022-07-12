import java.util.Random;

public class Sorteio {
    public static void main (String[] args) {
        Random random = new Random();

        int[] numeroAle = new int[10];

        for(int i = 0; i < numeroAle.length; i++) {
            numeroAle[i] = random.nextInt(10) +1;
            System.out.print(numeroAle [i] + " ");
        }

        int menor = numeroAle[0];
        for(int i = 0; i < numeroAle.length; i++) {
            if (numeroAle [i] < menor){
                menor = numeroAle [i];
            }
        }
        System.out.println("\nO menor número é o: " + menor);
    }
}
