public class Task3 {

//    Написать функцию, возвращающую истину, если в переданном массиве
//    есть два соседних элемента, с нулевым значением.

    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 7, 9, 0, 1};
        int[] arr1 = {4, 5, 0, 0, 9, 10, 1};
        int[] arr2 = {4, 5, 0, 0, 9, 0, 0};
        System.out.println(twoZero(arr));
    }

    public static boolean twoZero(int[] arr){
        boolean zero = false;
        for (int i = 0, j = 1; i < arr.length-1; i++, j++) {
            if(arr[i] ==0 && arr[j] == 0) zero = true;
        }
        return zero;
    }
}
