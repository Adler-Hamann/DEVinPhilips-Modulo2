import java.util.Scanner;

public class Aula03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Peso:");
        double peso = scanner.nextDouble();
        System.out.println("Digite a altura:");
        double altura = scanner.nextDouble();

        double imc = peso/(altura*altura);

        if (imc <= 18.5) {
            System.out.println("Magreza");
        }else if (imc > 18.5 && imc <= 24.9) {
            System.out.println("Normal");
        }else if (imc > 24.9 && imc <= 29.9 ) {
            System.out.println("Sobrepeso");
        }else if (imc > 29.9 && imc <= 39.9) {
            System.out.println("Obesidade");
        }else{
            System.out.println("Obesidade grave");
        }

        System.out.println(imc);


    }
}
