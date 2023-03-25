public class Teste {
    public void validar (String valorCampo, Integer valorMaximoCampo) {
        try {
            if (valorMaximoCampo < 1) {
                throw new IllegalArgumentException();
            }
            if (valorCampo == "" || valorMaximoCampo == null){
                throw new IllegalArgumentException();
            }
            if (valorCampo.length() > valorMaximoCampo) {
                throw new TamanhoInvalidoException("valorCampo é maior que o valor máximo permitido");
            }
        }catch (IllegalArgumentException e) {
            System.out.println("ValorCampo ou valorMaximoCampo são nulos");
        }catch (TamanhoInvalidoException e){
            System.out.println("valorCampo é maior que o valor máximo permitido");
        }
    }
}
