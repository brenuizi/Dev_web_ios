public class Strings3 {
    public static void main(String[] args) {
        String txt1 = "Ola aa Pessoal aa do aa IOS";
        String txt2 = "";
        String txt3 = " Ola mundo! ";
        // Verifica se a string est� vazia
        System.out.println("String txt1 est� vazia? " + txt1.isEmpty());
        System.out.println("String txt2 est� vazia? " + txt2.isEmpty());

        System.out.println("�ltima posi��a do aa: " + txt1.lastIndexOf("aa"));

        // Substituir algo na string
        String txt4 = txt1.replace('a', 'x');
        System.out.println(txt4);

        // Retirar espa�os no in�cio e no final
        System.out.println("String original: " + txt3);
        System.out.println("String sem espa�os: " + txt3.trim());
    }
}
