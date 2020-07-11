package task;

import java.util.Scanner;

/**
 * 酒店预订
 * @author Redion
 *
 */

public class HotelReservation {
	static String name1 = "格林豪泰";
	static String name2 = "如家";
	static String name3 = "速七快捷酒店";

	public static void main(String[] args) {
		System.out.println("===============酒店信息==================");
		address();
		choice();
		

	}
	public static void address(){
		String a1 = "	地址：苏州大道001号";
		String a2 = "	地址：苏州大道002号";
		String a3 = "	地址：苏州大道003号";
		System.out.println(name1+"\n"+a1+"\n"+name2+"\n"+a2+"\n"+name3+"\n"+a3);
	}
	public static void choice(){
		Scanner in = new Scanner(System.in);
		
		System.out.println("===============请选择酒店=================");
		String name4 = in.nextLine();
		if (name4.equals(name1)) {
			System.out.println("你已选择："+name1);
			
		}
		if (name4.equals(name2)) {
			System.out.println("你已选择："+name2);
			
		}
		if (name4.equals(name3)) {
			System.out.println("你已选择："+name3);
			
		}else {
			System.out.println("没有该酒店");
		}

		in.close();
		
	}
	
	
}

