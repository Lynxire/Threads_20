package Task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] task = Task1.task();
        Runnable runnable = () -> {
            int min = Arrays.stream(task).min().getAsInt();
            System.out.println("Минимальное значение: " + min);
        };

        Runnable runnable1 = () -> {
            int max = Arrays.stream(task).max().getAsInt();
            System.out.println("Максимальное значение: " + max);
        };

        Thread threadMin = new Thread(runnable);
        Thread threadMax = new Thread(runnable1);
        threadMin.start();
        threadMax.start();
    }

}
