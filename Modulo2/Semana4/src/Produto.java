public class Produto implements Tributavel{
    private double valor;
    private double valorimposto;
    public double calcularValorComImposto() {
        return valor + valorimposto;
    }
}
