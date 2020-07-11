package day4;

import java.util.Scanner;

/**
 * Ç¶Ì×
 * 
 * @author Redion
 *
 */
public class Fortest2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("ÇëÊäÈëĞĞÊı£º");
		int n = in.nextInt();
		for (int i = 0; i<=(n+1)/2; i++) {
			for (int j = 0; j <((n+1)/2)-i; j++) {
				System.out.print(" ");
				
			}
			for (int j = 0; j <2*i-1; j++) {
				System.out.print("*");
				
			}

			System.out.println();
		}
		for (int i = 0; i <= n / 2; i++) {
			for (int j = 0; j <i; j++) {
				System.out.print(" ");

			}
			for (int j = 0; j <n-2*i; j++) {
				System.out.print("*");

			}

			System.out.println();
		}

	}
}