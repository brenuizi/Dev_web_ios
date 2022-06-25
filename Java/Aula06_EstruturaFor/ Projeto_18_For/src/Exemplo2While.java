public class Exemplo2While {
    public static void main(String[] args){
        int i = 0;

        while(i < 1000){
            System.out.print(i + " ");
            if(i % 30 == 0) System.out.println("");
            i+=2;
        }
    }
}
