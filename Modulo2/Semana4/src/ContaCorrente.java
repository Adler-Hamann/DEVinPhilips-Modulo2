import java.util.Scanner;

public class ContaCorrente extends Conta implements Operavel{
    public void acessarConta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor para depositar");
        depositar(scanner.nextDouble());
    }
    public void depositar(double valor){

    }
    public void sacar(double valor){

    }
    public void obterSaldoAtual(){

    }

}
