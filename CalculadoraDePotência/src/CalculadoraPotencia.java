import java.util.Scanner;

public class CalculadoraPotencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a base: ");
        double base = scanner.nextDouble();

        
        System.out.print("Digite o expoente: ");
        double expoente = scanner.nextDouble();

        
        double resultado = calcularPotencia(base, expoente);

        
        System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);

        scanner.close();
    }

    public static double calcularPotencia(double base, double expoente) {
        
        return Math.pow(base, expoente);
    }
}
