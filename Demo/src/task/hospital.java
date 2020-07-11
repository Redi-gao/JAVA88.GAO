package task;

import java.util.Scanner;

//import java.util.Scanner;

/**
 * 输出界面
 * 
 * @author Redion
 *
 */
public class hospital {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner inpt = new Scanner(System.in);
		String name = "高雨生";
		String pwd = "147";
		System.out.println("请输入登录名：");
		String name1 = inpt.next();
		System.out.println("请输入登录密码：");
		String pwd1 = inpt.next();

		while (!name.equals(name1) || !pwd.equals(pwd1)) {
			System.out.println("登录失败！");

			System.out.println("请重新输入登录名：");
			new String();
			name1 = inpt.next();
			System.out.println("请重新输入登录密码：");
			new String();
			pwd1 = inpt.next();

		}
		System.out.println("登录成功");
		String Depa = depa();
		String Register = register();
		String Data = data();
		personalInformation();
		@SuppressWarnings("unused")
		Scanner input = new Scanner(System.in);

		System.out.println("您已选择:    " + Depa + Register);
		System.out.println("您选择的时间:" + Data);
		System.out.println("您的个人信息：");
		System.out.println("姓名：" );
		System.out.println("性别："   );
		System.out.println("身份证：" );
		System.out.println("手机号：" );
		System.out.println("地址："  );
		System.out.println("您已预约成功");

		

		
	}

	public static String depa() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("请选择科室:" + "\n内科  外科");
		String depa = input.nextLine();
		return depa;

	}

	public static String register() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("请选择专家号普通号" + "\n专家  普通");
		String reg = input.nextLine();
		return reg;

	}

	public static String data() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("请选择日期" + "\n周一至周日");
		String data = input.nextLine();
		System.out.println("请选择时间：" + "\n上午  下午");
		String time = input.nextLine();
		return data + time;

	}

	public static void personalInformation() {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("请输入姓名:");
		String name = input.nextLine();
		System.out.println("请输入性别:");
		String sex = input.nextLine();
		System.out.println("请输入身份证号：");
		String id = input.nextLine();
		System.out.println("请输入手机号:");
		String cell = input.nextLine();
		System.out.println("请输入家庭住址：");
		String address = input.nextLine();
		
	}

}
