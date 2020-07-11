package day4;

import java.util.Scanner;

/**
 * 兔子
 * 
 * @author Redion
 *
 */

public class test2 {

	public static void main(String[] args) {
		System.out.println("请输入你想知道的兔子数量的月份：");

		Scanner in = new Scanner(System.in);

		int mounth = in.nextInt();// 获取输入的整数

		System.out.println("第" + mounth + "个月兔子总数为" + sum(mounth)+"只");

		in.close();

	}
	public static int sum(int mounth) {
		if (mounth == 1||mounth == 2) {
			return 2;
			
		}else {
			return (sum(mounth-1)+sum(mounth-2));
		}
		
	}


}
