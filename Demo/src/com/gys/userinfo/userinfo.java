package com.gys.userinfo;

import java.util.Scanner;

public class userinfo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("�������û�����");
		String userName =input.nextLine();
		System.out.println("�������¼���룺");
		String loginPassword = input.nextLine();
		System.out.println("��ȷ�����룺");
		String confirmPassword =input.nextLine();
		System.out.println("������֤�����ͣ�");
		String certificateType = input.nextLine();
		System.out.println("���������֣�");
		String name = input.nextLine();
		System.out.println("������֤���ţ�");
		String IDNumber = input.nextLine();
		System.out.println("���������䣺");
		String mail = input.nextLine();
		System.out.println("�������ֻ��ţ�");
		String cell = input.nextLine() ;
		System.out.println("������˿����ͣ�");
		String passengerType = input.nextLine();
		System.out.println("�û�����   "+userName+"\n��¼���룺"+loginPassword+"\nȷ�����룺"+confirmPassword+"\n֤�����ͣ�"+certificateType+"\n������   "+name+"\n֤�����룺"+IDNumber+"\n���䣺"+mail+"\n�ֻ���"+cell+"\n�˿����ͣ�"+passengerType);
		
	}

}
