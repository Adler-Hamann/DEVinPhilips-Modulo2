import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clinica clinica = new Clinica();

        System.out.println("Informe o Peso:");
        double peso = scanner.nextDouble();
        System.out.println("Informe a altura:");
        double altura = scanner.nextDouble();
        System.out.println("IMC:" + clinica.IMC(peso, altura));
    }
}