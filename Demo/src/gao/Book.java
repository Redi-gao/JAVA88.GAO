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
		// 定义一个账户密码
		// 登录
		@SuppressWarnings("resource")
		Scanner inpt = new Scanner(System.in);
		System.out.println("请登录：");
		System.out.println("请输入用户名：");
		String user1 = inpt.nextLine();
		System.out.println("请输入密码：");
		String pwd1 = inpt.nextLine();
		// 判断账户密码是否正确
		while (!user.equals(user1) || !pwd.equals(pwd1)) {
			System.out.println("用户名或密码错误");
			System.out.println("请重新输入用户名：");
			user1 = inpt.nextLine();
			System.out.println("请重新输入密码：");
			pwd1 = inpt.nextLine();
		}

	}

	@SuppressWarnings("resource")
	public static void Price() {
		System.out.println("登录成功");
		System.out.println("请搜索书籍");
		String book = inpt.nextLine();
		String price = "0";
		switch (book) {
		case "头发保养与护理":
			price = "50元";
			break;
		case "码农翻身":
			price = "120元";
			break;
		case "斗破苍穹":
			price = "20元";
			break;
		case "老人与海":
			price = "80元";
			break;

		default:
			break;
		}
		System.out.println("你已选择:" + book + "\n价格为" + price);
		System.out.println("是否选择购买");
		String choice = inpt.next();
		if (choice.equals("是")) {
			Scanner in = new Scanner(System.in);
			System.out.println("请输入收货地址");
			String address = in.nextLine();
			System.out.println("请输入支付密码");
			String pwds = in.nextLine();
			while (!pwds.equals("147258")) {
				System.out.println("密码错误");
				System.out.println("请重新输入");
				pwds = in.nextLine();
			}

			System.out.println("你已购买成功");
			System.out.println("你的收货地址是：" + address);

		} else {

			System.out.println("你已放弃购买");
		}
		return;
	}
	
}
