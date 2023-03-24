import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clinica clinica = new Clinica("Ad");
        clinica.criaCliente();
        System.out.println("Digite 0");
        clinica.tratamento(scanner.nextInt());
    }
}