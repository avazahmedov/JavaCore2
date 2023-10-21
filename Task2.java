import java.util.Arrays;

public class Task2 {

//    Написать функцию, возвращающую разницу между самым
//    большим и самым ма- леньким элементами переданного не пустого массива.

    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 7, 9, 10, 1};
        System.out.println(minMax(arr));
    }

    public static int minMax(int[] arr){
        int min = arr[0];
        int max = arr[1];
        if (min>max) {
            max = arr[0];
            min = arr[1];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i]>max) max = arr[i];
            if (arr[i]<min) min = arr[i];
        }
        return max-min;
    }

}
