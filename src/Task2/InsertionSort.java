package Task2;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        int j;
        for (int i = 1; i < arr.length; i++) {
            int swap = arr[i];
            for (j = i; j > 0 && swap < arr[j - 1]; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = swap;

        }

    }
}
