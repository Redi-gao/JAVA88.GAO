package day5;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * ����
 * @author Redion
 *
 */
public class test6 {

	public static void main(String[] args) {
		int[] i = {1,5,88,56,13,79,45,2,45,31};
		System.out.println("==============δ����==============");
		for (int j : i) {
			System.out.print(j+"\t");
			
		}
		System.out.println();
		Arrays.sort(i);
		System.out.println("==============��������==============");
		for (int j : i) {
			System.out.print(j+"\t");
			
		}
		System.out.println();
		System.out.println("==============��������==============");
		for (int j = i.length-1;j>=0;j--) {
			System.out.print(i[j]+"\t");
			
		}
		System.out.println();
		
		

	}

}
