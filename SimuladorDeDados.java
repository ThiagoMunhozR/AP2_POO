import java.util.Random;

public class SimuladorDeDados {

    public static void main(String[] args) {
        simularJogadaDeDados();
    }

    public static void simularJogadaDeDados() {
        Random random = new Random();
        int soma = 0;
        
        System.out.println("Jogando o dado tres vezes...");

        for (int i = 1; i <= 3; i++) {
            int jogada = random.nextInt(6) + 1;
            System.out.println("Resultado da jogada " + i + ": " + jogada);
            soma += jogada;
        }

        System.out.println("Soma dos valores obtidos: " + soma);
    }
}
