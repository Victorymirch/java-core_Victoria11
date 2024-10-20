package Lab2.project1;

import java.util.Scanner;

public class N5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int thousands = (number / 1000) % 10;

        System.out.println("Число тысяч в введенном числе: " + thousands);
    }
}

