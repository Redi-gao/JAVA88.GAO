package day7;

import java.util.Scanner;

public class RailwayTest {

	public static void main(String[] args) {
		Scanner inpt = new Scanner(System.in);
		Railway user = new Railway();
		System.out.println("==================��ע��=============================");
		System.out.println("�������û�����");
		user.setUsreName(inpt.nextLine());
		System.out.println("���������룺");
		user.setUserPwd(inpt.nextLine());
		System.out.println("��ȷ������");
		user.setUserPwd1(inpt.nextLine());
		
		while (!user.userPwd.equals(user.userPwd1)) {
			System.out.println("ȷ�������������������");
			System.out.println("���������룺");
			user.setUserPwd(inpt.nextLine());
			System.out.println("��ȷ������");
			user.setUserPwd1(inpt.nextLine());
			
		}
		
		System.out.println("��ѡ��֤������");
		System.out.println("�й��������֤"+" ��������þ������֤"+" �۰�̨�����ס֤");
		user.setIdNumber(inpt.nextLine());
		System.out.println("����������");
		user.setName(inpt.nextLine());
		System.out.println("������֤����");
		user.setIdNumber(inpt.nextLine());
		
		System.out.println("�������ֻ���");
		user.setCall(inpt.nextLine());
		
		System.out.println("����������");
		user.seteMail(inpt.nextLine());
		System.out.println("��ѡ��˿�����");
		System.out.println("��ͯ"+" ѧ��"+" ����");
		user.setType(inpt.nextLine());
		
		user.RailwayInfo();

		inpt.close();

	}



}
