package Task2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] array = {2,12,19,8,10};
        Runnable bubbleSort = () -> {
           BubbleSort.bubbleSort(array);
            System.out.println("bubbleSort");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        };
        Runnable insertionSort = () -> {
            InsertionSort.insertionSort(array);
            System.out.println("insertionSort");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        };
        Runnable selectionSort = () -> {
            SelectionSort.selectionSort(array);
            System.out.println("selectionSort");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        };
        Thread threadBubble = new Thread(bubbleSort);
        Thread threadInsertion = new Thread(insertionSort);
        Thread threadSelection = new Thread(selectionSort);
        threadBubble.start();
        threadInsertion.start();
        threadSelection.start();



    }
}
