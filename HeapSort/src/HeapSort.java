import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] array = new int[]{9, 8, 7, 5, 4, 3, 2, 1, 8, 7, 5, 4, 3, 2, 8, 7, 5, 4, 3, 2, 8, 7, 5, 4, 3, 2, 8, 7, 5, 4, 3, 2, 8, 7, 5, 4, 3, 2, 8, 7, 5, 4, 3, 2};

        pyramidalSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void siftTree(int[] array, int root, int bottom) {
        boolean isDone = false;
        while ((root * 2 <= bottom) && !isDone) {
            int maxChild;
            if (((2 * root + 1) <= bottom) && ((2 * root + 2) <= bottom)) {
                if (array[2 * root + 1] > array[2 * root + 2]) {
                    maxChild = 2 * root + 1;
                } else {
                    maxChild = 2 * root + 2;
                }
            } else if ((2 * root + 1) <= bottom) {
                maxChild = 2 * root + 1;
            } else {
                maxChild = root;
            }

            if ((maxChild != root) && (array[root] < array[maxChild])) {
                int temp = array[root];
                array[root] = array[maxChild];
                array[maxChild] = temp;
                root = maxChild;
            } else {
                isDone = true;
            }
        }
    }

    private static void pyramidalSort(int[] array) {
        for (int j = (array.length - 1) / 2 - 1; j >= 0; j--) {
            siftTree(array, j, array.length - 1);
        }

        for (int i = array.length - 1; i >= 1; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            siftTree(array, 0, i - 1);
        }
    }
}


