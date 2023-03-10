public class Clinica {
    private String nomedono;
    private String nomeclinica;
    private String cnpj;
    private String logradouro;
    private String codclinica;

    public static double IMC(double peso, double altura){
        double imc = peso / (altura * altura);
        return imc;
    }
}
