import java.util.Scanner;

public class AjustePrecosFarmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.print("Digite o valor do produto (ou 0 para encerrar): ");
            double valorProduto = scanner.nextDouble();

            
            if (valorProduto == 0) {
                System.out.println("Encerrando o programa...");
                break;
            }

            
            double novoPreco = valorProduto * 1.12; 

            
            novoPreco = Math.round(novoPreco * 100.0) / 100.0; 

            
            System.out.println("Novo preço com aumento de 12%: R$" + novoPreco);
        }

        scanner.close();
    }
}
