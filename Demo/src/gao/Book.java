package gao;

import java.util.Scanner;

public class Book {
	static Scanner inpt = new Scanner(System.in);
	static String user = "redi";
	static String pwd = "redi";

	public static void main(String[] args) {
		user();
		Price();
	}
	public static void runWelcome() {
		
		
	}
	public static void user() {
		// ����һ���˻�����
		// ��¼
		@SuppressWarnings("resource")
		Scanner inpt = new Scanner(System.in);
		System.out.println("���¼��");
		System.out.println("�������û�����");
		String user1 = inpt.nextLine();
		System.out.println("���������룺");
		String pwd1 = inpt.nextLine();
		// �ж��˻������Ƿ���ȷ
		while (!user.equals(user1) || !pwd.equals(pwd1)) {
			System.out.println("�û������������");
			System.out.println("�����������û�����");
			user1 = inpt.nextLine();
			System.out.println("�������������룺");
			pwd1 = inpt.nextLine();
		}

	}

	@SuppressWarnings("resource")
	public static void Price() {
		System.out.println("��¼�ɹ�");
		System.out.println("�������鼮");
		String book = inpt.nextLine();
		String price = "0";
		switch (book) {
		case "ͷ�������뻤��":
			price = "50Ԫ";
			break;
		case "��ũ����":
			price = "120Ԫ";
			break;
		case "���Ʋ��":
			price = "20Ԫ";
			break;
		case "�����뺣":
			price = "80Ԫ";
			break;

		default:
			break;
		}
		System.out.println("����ѡ��:" + book + "\n�۸�Ϊ" + price);
		System.out.println("�Ƿ�ѡ����");
		String choice = inpt.next();
		if (choice.equals("��")) {
			Scanner in = new Scanner(System.in);
			System.out.println("�������ջ���ַ");
			String address = in.nextLine();
			System.out.println("������֧������");
			String pwds = in.nextLine();
			while (!pwds.equals("147258")) {
				System.out.println("�������");
				System.out.println("����������");
				pwds = in.nextLine();
			}

			System.out.println("���ѹ���ɹ�");
			System.out.println("����ջ���ַ�ǣ�" + address);

		} else {

			System.out.println("���ѷ�������");
		}
		return;
	}
	
}
