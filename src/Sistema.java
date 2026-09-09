public class Sistema {

    private static final double MEDIA_MINIMA_APROVACAO = 6.0;

    public static void main(String[] args) {
        String nomeAluno = "Carlos";
        double nota1 = 8;
        double nota2 = 7;

        double media = calcularMedia(nota1, nota2);
        String resultado = verificarAprovacao(media);

        apresentarResultado(nomeAluno, media, resultado);
    }
    
    public static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    public static String verificarAprovacao(double media) {
        return (media >= MEDIA_MINIMA_APROVACAO) ? "Aprovado" : "Reprovado";
    }
    
    public static void apresentarResultado(String nomeAluno, double media, String resultado) {
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Média: " + media);
        System.out.println("Resultado: " + resultado);
    }
}