import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clinica clinica = new Clinica("Ad");
        clinica.criaCliente();
        System.out.println("Digite o id do cliente e o peso que deseja alterar, nesta ordem.");
        clinica.tratamento(scanner.nextInt(), scanner.nextDouble());
        clinica.retornaClientes();
    }
}