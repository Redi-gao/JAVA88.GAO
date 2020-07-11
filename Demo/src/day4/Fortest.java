package day4;

import java.util.Scanner;

/**
 * 循环
 * 
 * @author Redion
 *
 */
public class Fortest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入数字：");
		int  endNum = in.nextInt();
		int count = 0;
		System.out.println("=========开始执行=============");
		for (int i = 0; i<= endNum;i++) {
			if(!(i%2==0)&&i !=0){
				System.out.println("第"+count+"个是"+i);
				count++;
			}
			
			
		}
		/*do {
			System.out.println(name+"跑了"+i+"圈");
			i++;
		} while (i <= endNum);
		while (i <= endNum) {
			System.out.println(name+"跑了"+i+"圈");
			i++;

		}*/
		System.out.println("一共有"+count);
		System.out.println("==========执行结束=============");
		in.close();
	}

}
