import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Exercicio6 {

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4);
        triplo(lista);
    }

    public static void triplo(List<Integer> lista) {
        List <Integer> resultado = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
             resultado.add(lista.get(i) * 3);
            System.out.println(resultado.get(i));
        }
        System.out.println(resultado.size());
    }
}
