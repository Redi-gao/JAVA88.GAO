package com.gys.userinfo;

import java.util.Scanner;

public class userinfo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("请输入用户名：");
		String userName =input.nextLine();
		System.out.println("请输入登录密码：");
		String loginPassword = input.nextLine();
		System.out.println("请确认密码：");
		String confirmPassword =input.nextLine();
		System.out.println("请输入证件类型：");
		String certificateType = input.nextLine();
		System.out.println("请输入名字：");
		String name = input.nextLine();
		System.out.println("请输入证件号：");
		String IDNumber = input.nextLine();
		System.out.println("请输入邮箱：");
		String mail = input.nextLine();
		System.out.println("请输入手机号：");
		String cell = input.nextLine() ;
		System.out.println("请输入乘客类型：");
		String passengerType = input.nextLine();
		System.out.println("用户名：   "+userName+"\n登录密码："+loginPassword+"\n确认密码："+confirmPassword+"\n证件类型："+certificateType+"\n姓名：   "+name+"\n证件号码："+IDNumber+"\n邮箱："+mail+"\n手机号"+cell+"\n乘客类型："+passengerType);
		
	}

}
