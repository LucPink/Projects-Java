import java.util.Scanner;

public class InversorDeFrases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        while (continuar) {
            // Solicita uma frase ao usuário
            System.out.print("Digite uma frase para inverter (ou '0' para sair): ");
            String fraseOriginal = scanner.nextLine();
            
            if (fraseOriginal.equals("0")) {
                continuar = false;
            } else {
                
                String fraseInvertida = inverterFrase(fraseOriginal);
                System.out.println("Frase Original: " + fraseOriginal);
                System.out.println("Frase Invertida: " + fraseInvertida);
            }
        }
        
        scanner.close();
    }
    
    /**
     *
     * @param frase A frase a ser invertida.
     * @return 
     */
    public static String inverterFrase(String frase) {
        
        frase = frase.replace(" ", "");
        
        
        StringBuilder sb = new StringBuilder();
        for (int i = frase.length() - 1; i >= 0; i--) {
            sb.append(frase.charAt(i));
        }
        
        return sb.toString();
    }
}
