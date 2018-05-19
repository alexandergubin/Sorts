import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{2, 1};

        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int left, int right) {
        if (right - left + 1 == 1) {
            return;
        }
        if ((right - left + 1 == 2) && (array[left] > array[right])) {
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            return;
        }
        if ((left < right) && (right - left + 1 > 2)) {
            int i = left;
            int j = right;
            int x = array[(right + left) / 2];
            while (i <= j) {
                while (array[i] < x) {
                    i++;
                }
                while (array[j] > x) {
                    j--;
                }

                if (i <= j) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                    i++;
                    j--;
                }
            }
            if (i < right) {
                quickSort(array, i, right);
            }
            if (j > left) {
                quickSort(array, left, j);
            }
        }
    }
}
