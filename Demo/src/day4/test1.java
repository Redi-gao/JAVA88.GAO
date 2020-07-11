package day4;

public class test1 {

	public static void main(String[] args) {
		int count = 0;
		f:for (int i = 2; i < 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					continue f;
				}
			}
			System.out.println(i);
			count++;

		}
		System.out.println("100ÄÚËØÊýÓÐ"+count);

	}
	
}
