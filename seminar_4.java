import java.util.*;

public class seminar_4 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J"); // сlear console 
        int[] arr = new int[11];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        int smaller = 0;
        int larger = arr.length - 1;
        System.out.println(Arrays.toString(arr));
        q_sorting (arr, smaller, larger);
        System.out.println(Arrays.toString(arr));
    }
    public static void q_sorting (int[] array, int smaller, int larger) {
        if (array.length == 0)
            return;
        if (smaller >= larger)
            return;
        int middle = smaller + (larger - smaller) / 2;
        int base = array[middle];
        int i = smaller, j = larger;
        while (i <= j) {
            while (array[i] < base) {
                i++;
            }
            while (array[j] > base) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (smaller < j)
            q_sorting (array, smaller, j);
        if (larger > i)
            q_sorting (array, i, larger);
    }
}
