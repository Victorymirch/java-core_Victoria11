package Lab2.project1;

import java.util.Scanner;
public class N3 {
    public static void main(String[] args)
    {
        System.out.println("Введите число:");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
     
        if (x % 4==0 && x > 10) {
            System.out.printf("x = %d кратно 4, x>10\n", x);}
        else {
            System.out.printf("x = %d не удовлетворяет условиям: x кратно 4, x>10\n", x);}
    }
}