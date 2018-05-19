import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{1, 0, 9, 1, 2, 3, 4};

        SortBubble(array);
        System.out.println(Arrays.toString(array));
    }

    private static void SortBubble(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean isSwap = false;
            for (int j = 0; j < (array.length - 1) - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    isSwap = true;
                }
            }
            if (!isSwap) {
                break;
            }
        }
    }
}
