package day5;
/**
 * ����������ݷ���
 * @author Redion
 *
 */

public class test3 {

	public static void main(String[] args) {
		int age = 18;
		showUserInfoByAge(age);
		int ages[] = {18,21,34};
		showAge(ages);

	}

	public static void showAge(int[] ages) {
		for (int age  : ages) {
			System.out.println(age);
		}
		
	}

	public static void showUserInfoByAge(int age) {
		System.out.println("����"+age);
		
		
	}

}
