package StopWatch;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100000];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000);
        }

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();


        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        stopWatch.stop();
        System.out.println("thời gian thực thi của thuật toán sắp xếp chọn : " + stopWatch.getElapsedTime() + " milliseconds");
    }
}
