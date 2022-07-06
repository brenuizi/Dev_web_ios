public class Strings2 {
    public static void main(String[] args) {
        String txt = "Ola Pessoal do IOS";
        String myStr1 = "Hello";
        String myStr2 = "Hello";
        char result = txt.charAt(0); // Caractere na posi��o zero
        System.out.println("Char na posi��o zero: " + result);
        result = txt.charAt(10); // Caractere na posi��o dez
        System.out.println("Char na posi��o dez: " + result);

        // Compara strings
        System.out.println("Compara myStr1 com myStr2: " + myStr1.compareTo(myStr2)); // Returna 0
        System.out.println("Compara txt com myStr2: " + txt.compareTo(myStr2));
// Returna um valor > 0
        System.out.println("Compara myStr1 com txt: " + myStr1.compareTo(txt));
// Returna um valor < 0

        // Verifica o �nico e o final de um string
        System.out.println("Verifica in�cio da string txt: " + txt.startsWith("Ola")); // Retorna true
        System.out.println("Verifica in�cio da string txt: " + txt.startsWith("")); // Retorna true
        System.out.println("Verifica in�cio da string txt: " + txt.startsWith("o")); // Retorna false

        System.out.println("Verifica final da string txt: " + txt.endsWith("IOS"
        )); // Retorna true
        System.out.println("Verifica final da string txt: " + txt.endsWith("S"))
        ; // Retorna true
        System.out.println("Verifica final da string txt: " + txt.endsWith("s"))
        ; // Retorna false
    }
}