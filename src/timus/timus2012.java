package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class timus2012 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int number0fTanks = in.nextInt();
		
		int difference = 12 - number0fTanks;
		
		int time = difference * 45;
		
		if(time <= 240) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
		out.flush();
	}
}
