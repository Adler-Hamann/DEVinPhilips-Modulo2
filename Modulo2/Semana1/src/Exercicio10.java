import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio10 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("ana", "radar", "inteiro", "onibus", "abba", "obito");
        palindrome(palavras);
    }

    public static void palindrome(List<String> lista){
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).length() % 2 == 0) {
                for (int j = 0; j < lista.get(i).length()/2; j++){
                    if (lista.get(i).charAt(j) == (lista.get(i).charAt(lista.get(i).length()-(j+1)))) {
                        System.out.println(lista.get(i).charAt(j));
                        if (j == lista.get(i).length()/2-1) {
                            System.out.println("É palindrome");
                        }
                    }else{
                        System.out.println("Não palindrome");
                        break;
                    }
                }
            }else{
                for (int j = 0; j < lista.get(i).length()/2; j++){
                    if (lista.get(i).charAt(j) == (lista.get(i).charAt(lista.get(i).length()-(j+1)))) {
                        System.out.println(lista.get(i).charAt(j));
                        if (j == (lista.get(i).length()/2-1)) {
                            System.out.println("É palindrome");
                        }
                    }else{
                        System.out.println("Não palindrome");
                        break;
                    }
                }
            }
        }
    }
}
