package day5;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * ÅÅÐò
 * @author Redion
 *
 */
public class test6 {

	public static void main(String[] args) {
		int[] i = {1,5,88,56,13,79,45,2,45,31};
		System.out.println("==============Î´ÅÅÐò==============");
		for (int j : i) {
			System.out.print(j+"\t");
			
		}
		System.out.println();
		Arrays.sort(i);
		System.out.println("==============ÉýÐòÅÅÐò==============");
		for (int j : i) {
			System.out.print(j+"\t");
			
		}
		System.out.println();
		System.out.println("==============½µÐòÅÅÐò==============");
		for (int j = i.length-1;j>=0;j--) {
			System.out.print(i[j]+"\t");
			
		}
		System.out.println();
		
		

	}

}
