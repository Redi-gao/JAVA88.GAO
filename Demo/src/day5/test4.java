package day5;
/**
 * 
 * @author Redion
 *
 */

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		
		
		

	}

	@SuppressWarnings("resource")
	public static boolean signIn() {
		Scanner inpt = new Scanner(System.in);
		System.out.println("请输入用户名");
		String names = inpt.nextLine();
		System.out.println("请输入密码名");
		String pwds = inpt.nextLine();
		if (!(pwds.equals(getPwd()))||!(names.equals(getName()))) {
			 return false;
			
		}else {
			return true;
		}
	
	}

	public static String getPwd() {
		String userPwd = "123";
		return userPwd;
	}

	public static String getName() {
		String userNmae = "123";
		return userNmae;
	}
	public static String[] list(){
		String[] book = {"老人与海","/t码农翻身","/t雷雨"};
		return book;
	}
	

}


































