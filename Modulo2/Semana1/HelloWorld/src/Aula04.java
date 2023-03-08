import java.util.ArrayList;
import java.util.List;

public class Aula04 {

    public static void main(String[] args) {

        int[] arr = {3, 5, 1, 4, 7, 6, 5, 2, 3, 4, 2, 3, 1, 0, 6};
        List<Integer> nrepete = new ArrayList<>();
        List<Integer> repete = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            int cont = 0;
            for (int j = 0; j < arr.length; j++) {
                if (j == i) {
                    continue;
                }
                if (arr[j] == arr[i]) {
                    cont++;
                    break;
                }
            }
            if (cont > 0) {
                repete.add(arr[i]);
            }else{
                nrepete.add(arr[i]);
            }

        }
        System.out.println(repete);
        System.out.println(nrepete);
    }

}
