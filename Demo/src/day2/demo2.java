package day2;
/**
 * �Ƚ�
 * @author Redion
 *
 */
public class demo2 {

	public static void main(String[] args) {
		compare();
	

	}
	public static void compare() {
		
		/*int i = 9;
		int j = 10;
		System.out.println(j==i);
		System.out.println(j= i);
		System.out.println(i == j);
		String name = "���";
		String name2 = "���";
		System.out.println(name == name2+"");
		System.out.println(name.equals(name2+""));*/
		String s1 = new String("���");
		System.out.println(System.identityHashCode(s1));
		String s2 = new String("���");
		System.out.println(System.identityHashCode(s2));
		String s3 = "���";
		System.out.println(System.identityHashCode(s3));
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		
		
	}

}
