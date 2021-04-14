import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    MergeSort mergeSort;
    @Before
    public void setUp() throws Exception {
        mergeSort = new MergeSort();
    }

    @Test
    public void mergeSort() {
        int[] numbers = list();
        long startTime = System.nanoTime();
        mergeSort.mergeSort(numbers);
        long endTime = System.nanoTime();
        System.out.println(String.format("MergeSort takes %,d nanoseconds", endTime-startTime));
        assertTrue(isOrdered(numbers));
    }

    private boolean isOrdered(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private int[] list() {
        int[] list = new int[100];
        for(int i=0;i<list.length;i++)
        {
            list[i] = (int)Math.floor(Math.random()*1000);
        }
        return list;
    }
}