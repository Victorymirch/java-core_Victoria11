package Lab1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int less = number - 1;
        int more = number + 1;
        int sum = less + number + more;
        int square = sum * sum;

        System.out.println("Последовательность чисел: " + less + ", " + number + ", " + more + ", " + square);

        scanner.close();
    }
}
