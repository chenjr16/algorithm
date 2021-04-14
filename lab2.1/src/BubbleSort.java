import java.util.Arrays;

class BubbleSort {
    public void sort(int[] numbers) {
        int counter = 0;
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                counter ++;
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println(String.format("Bubble Sort Counter: %,d", counter));
    }

    public void sortImprovement1(int[] numbers) {
        int counter = 0;
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i; j++) {
                counter ++;
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                }
            }
        }
        System.out.println("Improvement 1 Counter: " + counter);
    }

    private void swap(int[] numbers, int j, int i) {
        int temp = numbers[j];
        numbers[j] = numbers[i];
        numbers[i] = temp;

    }

    public void sortImprovement2(int[] numbers) {
        int i = 0;
        int counter = 0;
        boolean swapOccured = true;
        while (swapOccured) {
            swapOccured = false;
            i++;
            for (int j = 0; j < numbers.length - i; j++) {
                counter ++;
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                    swapOccured = true;
                }
            }
        }
        System.out.println("Improvement 2 Counter: " + counter);

    }

}