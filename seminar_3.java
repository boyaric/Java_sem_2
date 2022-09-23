// Семинар 3. + Написать программу, показывающую последовательность действий для игры “Ханойская башня”.

import java.io.IOException;
import java.util.Scanner;

public class seminar_3 {

    /**
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) throws IOException {
        System.out.print("\033[H\033[J"); // сlear console
        Scanner s = new Scanner(System.in);
        System.out.printf("Введите колличество колец: ");
        int n = s.nextInt();
        s.close();
        System.out.println();
        System.out.println("Перекладывайте кольца в следующем порядке:");
        hanoi_tower('1', '2', '3', n);
    }

    public static void hanoi_tower(char a, char b, char c, int n) {
        if (n == 1) {
            System.out.println(String.format("%s -> %s", a, b));
        } else {
            hanoi_tower(a, c, b, n - 1);
            System.out.println(String.format("%s -> %s", a, b));
            hanoi_tower(c, b, a, n - 1);
        }
    }

}