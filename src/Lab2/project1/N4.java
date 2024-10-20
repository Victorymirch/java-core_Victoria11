package Lab2.project1;

import java.util.Scanner;

public class N4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        
        if (number >= 5 && number <= 10) {
            System.out.println("Число " + number + " попадает в диапазон от 5 до 10.");
        } else {
            System.out.println("Число " + number + " не попадает в диапазон от 5 до 10.");
        }
        
        scanner.close();
    }
}
