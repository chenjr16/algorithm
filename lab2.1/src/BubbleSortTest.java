import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {
    BubbleSort bubbleSort;
    int[] numbers;
    @Before
    public void setUp() {
        bubbleSort = new BubbleSort();
        numbers = list();
    }

    @Test
    public void sort() {
        bubbleSort.sort(numbers);
        boolean result = isOrdered();
        assertTrue(result);
    }

    @Test
    public void sortImprovement1() {
        long startTime = System.nanoTime();
        bubbleSort.sortImprovement1(numbers);
        long endTime = System.nanoTime();
        boolean result = isOrdered();
        System.out.println(String.format("Improvement1 takes %,d nanoseconds", endTime-startTime));
        assertTrue(result);
    }

    @Test
    public void sortImprovement2() {
        bubbleSort.sortImprovement2(numbers);
        boolean result = isOrdered();
        assertTrue(result);
        bubbleSort.sortImprovement2(numbers);
    }

    private boolean isOrdered() {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private int[] list() {
        int[] list = new int[100_000];
        for(int i=0;i<list.length;i++)
        {
            list[i] = (int)Math.floor(Math.random()*10_000_000);
        }
        return list;
    }
}