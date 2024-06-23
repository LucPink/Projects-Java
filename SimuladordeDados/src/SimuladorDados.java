import java.util.Random;

public class SimuladorDados {
    public static void main(String[] args) {
        
        Random random = new Random();
        
        int dado1 = random.nextInt(6) + 1; 
        int dado2 = random.nextInt(6) + 1;
        int dado3 = random.nextInt(6) + 1;
        
        
        int soma = dado1 + dado2 + dado3;
        
        
        System.out.println("Resultado da simulação de dados:");
        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("Dado 3: " + dado3);
        System.out.println("Soma total: " + soma);
    }
}
