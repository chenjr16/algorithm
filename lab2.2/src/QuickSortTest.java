import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {
    QuickSort quickSort;
    @Before
    public void setUp() throws Exception {
        quickSort = new QuickSort();
    }

    @Test
    public void sort() {
        int[] numbers = new int[]{2, 5, 7, 2, 4, 2, 8, 1, 0, 9, 3, 6};
        quickSort.sort(numbers);
        assertTrue(isOrdered(numbers));
    }

    @Test
    public void sort_EmptyArray() {
        int[] numbers = new int[]{};
        quickSort.sort(numbers);
        assertTrue(isOrdered(numbers));
    }

    @Test
    public void sort_LargeArray() {
        int[] numbers = list();
        quickSort.sort(numbers);
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