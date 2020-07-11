package day7;

import java.util.Scanner;

public class RailwayTest {

	public static void main(String[] args) {
		Scanner inpt = new Scanner(System.in);
		Railway user = new Railway();
		System.out.println("==================请注册=============================");
		System.out.println("请输入用户名：");
		user.setUsreName(inpt.nextLine());
		System.out.println("请输入密码：");
		user.setUserPwd(inpt.nextLine());
		System.out.println("请确认密码");
		user.setUserPwd1(inpt.nextLine());
		
		while (!user.userPwd.equals(user.userPwd1)) {
			System.out.println("确认密码错误，请重新输入");
			System.out.println("请输入密码：");
			user.setUserPwd(inpt.nextLine());
			System.out.println("请确认密码");
			user.setUserPwd1(inpt.nextLine());
			
		}
		
		System.out.println("请选择证件类型");
		System.out.println("中国居民身份证"+" 外国人永久居留身份证"+" 港澳台居民居住证");
		user.setIdNumber(inpt.nextLine());
		System.out.println("请输入姓名");
		user.setName(inpt.nextLine());
		System.out.println("请输入证件号");
		user.setIdNumber(inpt.nextLine());
		
		System.out.println("请输入手机号");
		user.setCall(inpt.nextLine());
		
		System.out.println("请输入邮箱");
		user.seteMail(inpt.nextLine());
		System.out.println("请选择乘客类型");
		System.out.println("儿童"+" 学生"+" 成人");
		user.setType(inpt.nextLine());
		
		user.RailwayInfo();

		inpt.close();

	}



}
