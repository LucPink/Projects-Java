import java.util.Scanner;

public class ConversorRadianosParaGraus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o ângulo em radianos: ");
        double anguloRadianos = scanner.nextDouble();

        
        double anguloGraus = converterRadianosParaGraus(anguloRadianos);

        
        System.out.println(anguloRadianos + " radianos correspondem a " + anguloGraus + " graus.");

        scanner.close();
    }

    public static double converterRadianosParaGraus(double anguloRadianos) {
        
        return Math.toDegrees(anguloRadianos);
    }
}
