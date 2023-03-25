import java.util.Scanner;

public class Idade {
    private int idade;
    public void testaIdade(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade");
        idade = scanner.nextInt();
        try {
            if (idade > 0 && idade < 100) {
                System.out.println("Olá, você tem "+idade+" anos de idade");
            }else{
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Idade inválida, tente novamente");
            testaIdade();
        }
    }
}
