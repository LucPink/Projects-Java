import java.util.Scanner;

public class DetectorConteudoImproprio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Detector de Conteúdo Impróprio");
        System.out.println("Digite uma frase para verificar (ou digite 'sair' para encerrar):");

        while (true) {
            String frase = scanner.nextLine();

            if (frase.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando o programa.");
                break;
            }

            verificarConteudo(frase);
            System.out.println("Digite outra frase (ou digite 'sair' para encerrar):");
        }

        scanner.close();
    }

    public static void verificarConteudo(String frase) {
        
        String fraseLowerCase = frase.toLowerCase();

        
        if (fraseLowerCase.contains("sexo") || fraseLowerCase.contains("sexual")) {
            System.out.println("Conteúdo impróprio: '" + frase + "'");
        } else {
            System.out.println("Conteúdo liberado: '" + frase + "'");
        }
    }
}
