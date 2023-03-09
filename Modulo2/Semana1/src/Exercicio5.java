import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        //System.out.println("");
        //Scanner scanner = new Scanner(System.in);
        int[] arr1 = {56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47};
        int[] arr2 = {1};
        int[] arr3 = {1, -1};
        int[] arr4 = null;
        int[] arr5 = {-2, -2, -2, -2};
        int[] arr6 = {20, 10, 30};

        try {
            array(arr1);
            array(arr2);
            array(arr3);
            array(arr5);
            array(arr6);
            array(arr4);
        }catch (NullPointerException e) {
            System.out.println("Não foi possível calcular");
        }
    }

    public static void array(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max:" + max);
        System.out.println("Min:" + min);
    }
}
