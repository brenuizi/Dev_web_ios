public class Strings {
    public static void main(String[] args) {
        String txt = "Ola Pessoal do IOS";
        // Imprime o tamanho da string
        System.out.println("O tamanho da string txt �: " + txt.length());
        // Imprime os caracteres da string em mai�sculo
        System.out.println(txt.toUpperCase());
        // Imprime os caracteres da string em min�sculo
        System.out.println(txt.toLowerCase());
        // Imprime a posi��o da primeira ocorr�ncia de um valor na string
        System.out.println(txt.indexOf("s"));
        System.out.println(txt.indexOf("IO"));
        // N�o encontra o texto na string
        System.out.println(txt.indexOf("io")); // Case Sensitive
    }
}