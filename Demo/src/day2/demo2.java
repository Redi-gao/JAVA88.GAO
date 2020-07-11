package day2;
/**
 * 比较
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
		String name = "李狗蛋";
		String name2 = "李狗蛋";
		System.out.println(name == name2+"");
		System.out.println(name.equals(name2+""));*/
		String s1 = new String("李狗蛋");
		System.out.println(System.identityHashCode(s1));
		String s2 = new String("李狗蛋");
		System.out.println(System.identityHashCode(s2));
		String s3 = "李狗蛋";
		System.out.println(System.identityHashCode(s3));
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		
		
	}

}
