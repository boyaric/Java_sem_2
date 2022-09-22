// Семинар 2. + Написать программу вычисления n-ого треугольного числа.


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class seminar_2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("\033[H\033[J"); // сlear console
        Scanner s = new Scanner(System.in);
        System.out.printf("Введите значение искомого треугольного числа: ");
        int n = s.nextInt();
        var res = ((0.5)*n)*(n+1);
        // System.out.println(res);

        try {
            File f = new File("triang_num.txt"); // create file
            if (!f.exists());
            f.createNewFile();
            PrintWriter pw = new PrintWriter(f);
            pw.println("Значение " + n + "-го по порядку треугольного числа равно: " + res);
            pw.close();
            System.out.println("Результат записан в файл triang_num.txt");
        } catch (IOException e) {
            System.out.print("Error: " + e);
        }
    }
}
