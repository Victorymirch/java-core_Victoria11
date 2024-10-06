package Lab1;

import java.util.Scanner;
import java.time.LocalDate;

public class Example10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш год рождения: ");
        int birthYear = scanner.nextInt();

        int currentYear = LocalDate.now().getYear();

        int age = currentYear - birthYear;

        System.out.println("Ваш возраст: " + age + " лет.");

        scanner.close();
    }
}


