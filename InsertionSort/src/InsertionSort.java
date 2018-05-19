import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 1, 5, 9, 4, 8, 72, 5, 1, 6};
        sortInsertion(array);
        System.out.println(Arrays.toString(array));
    }

    private static void sortInsertion(int[] array) {
        int j;
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            for (j = i - 1; j >= 0; j--) {
                if (array[j] <= temp) {
                    break;
                }
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }
    }
}