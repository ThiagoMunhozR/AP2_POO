import java.util.Scanner;

public class ManipulacaoDeSubstrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        
        if (frase.isEmpty()) {
            System.out.println("A frase esta vazia.");
        } else {
            String substring = frase.substring(0, frase.length() - 1);
            System.out.println("Substring: " + substring);
        }
        
        scanner.close();
    }
}
