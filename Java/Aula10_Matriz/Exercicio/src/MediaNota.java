public class MediaNota {
    public static void main(String[] args) {
        //criação das variaveis para receber nota
        //valores com virgula (pontos flutuantes) são  representados pelo double e o float
        double nota1 = 10, nota2 = 8, nota3 = 7, nota4 = 9;

        //fazer a soma dos valores declarados e calcular a média
        double media = ((nota1 + nota2 + nota3 + nota4) / 4);

        //comando para fazer mostrar o resultado, chamando a variavel do calculo
        System.out.print(media);
    }
}
