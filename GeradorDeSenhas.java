import java.util.Random;

public class GeradorDeSenhas {

    public static void main(String[] args) {
        gerarSenhaAleatoria();
    }

    public static void gerarSenhaAleatoria() {
        Random random = new Random();
        
        int tamanhoSenha = random.nextInt(6) + 5; 
        
        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < tamanhoSenha; i++) {
            int digito = random.nextInt(10);
            senha.append(digito);
        }

        System.out.println("Senha gerada: " + senha.toString());
    }
}
