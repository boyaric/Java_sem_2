// Семинар 2.  

// Задание 1. Написать программу, показывающую последовательность действий для игры “Ханойская башня”.

// import java.io.IOException;
// import java.util.Scanner;
// public class seminar_2 {

//     /**
//      * @param args
//      * @throws IOException
//      */

//     public static void main(String[] args) throws IOException {
//         System.out.print("\033[H\033[J"); // сlear console
//         Scanner s = new Scanner(System.in);
//         System.out.printf("Введите колличество колец: ");
//         int n = s.nextInt();
//         s.close();
//         System.out.println();
//         System.out.println("Перекладывайте кольца в следующем порядке:");
//         hanoi_tower('1', '2', '3', n);
//     }

//     public static void hanoi_tower(char a, char b, char c, int n) {
//         if (n == 1) {
//             System.out.println(String.format("%s -> %s", a, b));
//         } else {
//             hanoi_tower(a, c, b, n - 1);
//             System.out.println(String.format("%s -> %s", a, b));
//             hanoi_tower(c, b, a, n - 1);
//         }
//     }

// }

// Задание 2. Реализовать алгоритм сортировки вставками.

public class seminar_2 {

    public static void main(String[] args) {

        int[] a = new int[] { 112, 23, -1, 54, 78, 77, 22, -5, 59, 60, 105 };
        int[] b = a;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i] + ", ");
            System.out.print("\033[H\033[J"); // сlear console
            System.out.println("Source array: ");
            System.out.print(sb.deleteCharAt(sb.length() - 2));
            System.out.println();
            System.out.println();
            sorting(b);
            StringBuilder sb_2 = new StringBuilder();
            for (int j = 0; j < b.length; j++) {
                sb_2.append(a[j] + ", ");
            }
            System.out.println("Sorted array: ");
            System.out.print(sb_2.deleteCharAt(sb_2.length() - 2));
            System.out.println();
        }
    }

    public static void sorting(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > current) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;
        }

    }

}