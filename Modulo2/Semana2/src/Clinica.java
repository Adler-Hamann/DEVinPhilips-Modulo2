import java.util.ArrayList;
import java.util.Scanner;

public class Clinica {
    private String nomedono;
    private String nomeclinica;
    private String cnpj;
    private String logradouro;
    private String codclinica;
    private static ArrayList<Cliente> clientes= new ArrayList<>();

    public Clinica (String nomedono) {
        this.nomedono = nomedono;
    }

    public Clinica (String nomedono, ArrayList<Cliente> clientes) {
        this.nomedono = nomedono;
        this.clientes = clientes;
    }
    public static double IMC(double peso, double altura){
        Cliente cliente = new Cliente(0, 0);
        double imc = peso / (altura * altura);
        return imc;
    }

    public static void criaCliente() {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente(0, 0);
        System.out.println("Informe o nome:");
        cliente.setNome(scanner.nextLine());
        System.out.println("Informe o Peso:");
        cliente.setPeso(scanner.nextDouble());
        System.out.println("Informe a altura:");
        cliente.setAltura(scanner.nextDouble());
        System.out.println("Informe a idade");
        cliente.setIdade(scanner.nextDouble());
        clientes.add(cliente);
    }
}
