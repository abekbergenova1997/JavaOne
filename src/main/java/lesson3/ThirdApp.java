package lesson3;

import java.util.Arrays;

public class ThirdApp {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        System.out.println(Arrays.toString(createArrayAndFillIt(5, 10)));
        minMaxValue();
        int[] checkBalance = {15,2,2,4,2,9};
        System.out.println(equalSums(checkBalance));
    }

    public static void invertArray() {
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray(){
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6 ){
                arr[i] = arr[i]*2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            arr[i][i]=1;
            arr[i][3-i]=1;
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] createArrayAndFillIt(int length, int initialValue) {
        int[] result = new int[length];
        Arrays.fill(result, initialValue);
        return result;
    }
    public static void minMaxValue() {
        int[] arr = {6, 9, 13, 2, 7, 1, 20};
        int min, max;
        min = max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("минимальный элемент: " + min + "; максимальный элемент: " + max);
    }

    public static boolean equalSums(int[] array){
        for(int i=1;i<array.length-1;i++){
            if(sumRightLeft(array,i)){
                return true;
            }
        }
        return false;
    }
    public static boolean sumRightLeft(int[] array, int n) {
        int left = 0;
        for (int i = 0; i < n; i++) {
            left += array[i];
        }
        int right = 0;
        for (int i=n; i<array.length; i++) {
            right+=array[i];
        }
        if(right==left){
            return true;
        }
        return false;
    }


}
