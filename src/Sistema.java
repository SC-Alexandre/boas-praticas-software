public class Sistema {
    public static void main(String[] args) {
        String nome = "Carlos";
        double nota1 = 8;
        double nota2 = 7;
        double média = (nota1 + nota2) / 2;

        System.out.println("Aluno: " + nome);
        System.out.println("Media: " + média);
    
        if (média >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}