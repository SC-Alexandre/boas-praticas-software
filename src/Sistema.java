public class Sistema {
    public static void main(String[] args) {
        String nome = "Carlos";
        double nota1 = 8;
        double nota2 = 7;
        
        double media = calcularMedia(nota1, nota2);
        String resultado = verificarAprovacao(media);
        
        apresentarResultado(nome, media, resultado);
    }
    
    public static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    public static String verificarAprovacao(double media) {
        return (media >= 6) ? "Aprovado" : "Reprovado";
    }

    public static void apresentarResultado(String nome, double media, String resultado) {
        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media);
        System.out.println("Resultado: " + resultado);
    }
}