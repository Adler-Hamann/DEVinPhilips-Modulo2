public class Exercicio3 {

    public static void main(String[] args) {
        int[] extrato = { 100, -35, -15, -5, 55, -20 };
        int saldo = 0;

        for (int i = 0; i < extrato.length; i++) {
            System.out.println(extrato[i]);
            saldo += extrato[i];
        }

        for (int i = extrato.length - 1; i >= 0; i--) {
            System.out.println(extrato[i]);
        }

        System.out.println(saldo);
        if (saldo > 0) {
            System.out.println("Saldo positivo!");
        }else{
            System.out.println("Saldo negativo!");
        }
    }
}
