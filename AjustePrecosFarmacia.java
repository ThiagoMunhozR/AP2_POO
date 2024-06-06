import java.util.Scanner;

public class AjustePrecosFarmacia {

    public static void main(String[] args) {
        ajustarPrecos();
    }

    public static void ajustarPrecos() {
        Scanner scanner = new Scanner(System.in);
        double valorProduto = -1;
        double percentualAumento = 0.12;

        while (valorProduto != 0) {
            System.out.print("Digite o valor do produto (ou 0 para encerrar): ");
            if (scanner.hasNextDouble()) {
                valorProduto = scanner.nextDouble();
                if (valorProduto < 0) {
                    System.out.println("Valor invalido. O valor deve ser zero ou positivo.");
                    continue;
                }
                if (valorProduto == 0) {
                    break;
                }

                double valorAjustado = valorProduto + (valorProduto * percentualAumento);
                double valorAjustadoArredondado = Math.round(valorAjustado * 100.0) / 100.0;
                
                System.out.println("Novo valor do produto apos ajuste de 12%: " + valorAjustadoArredondado + " reais");
            } else {
                System.out.println("Entrada invalida. Digite um valor valido.");
                scanner.next();
            }
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
