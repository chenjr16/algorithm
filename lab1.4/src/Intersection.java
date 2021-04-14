
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Intersection {
    public List<Integer> intersection(int[] a, int[] b) {
        int counter = 0;
        List<Integer> result = new LinkedList<>();
        for (int x : a) {
            for (int y : b) {
                if (x == y) result.add(x);
                counter ++;
            }
        }
        System.out.println(String.format("This took %,d time to get result.", counter));
        return result;
    }

    public List<Integer> intersectionFast(int[] a, int[] b) {
        mergeSort(a);
        mergeSort(b);

        return null;
    }

    private void mergeSort(int[] input) {
        Arrays.sort(input);
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {4, 5, 8, 10};
        Intersection inter = new Intersection();
        List result = inter.intersection(a, b);
        System.out.println(result);
    }
}