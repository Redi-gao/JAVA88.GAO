package task;

import java.util.Scanner;

//import java.util.Scanner;

/**
 * �������
 * 
 * @author Redion
 *
 */
public class hospital {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner inpt = new Scanner(System.in);
		String name = "������";
		String pwd = "147";
		System.out.println("�������¼����");
		String name1 = inpt.next();
		System.out.println("�������¼���룺");
		String pwd1 = inpt.next();

		while (!name.equals(name1) || !pwd.equals(pwd1)) {
			System.out.println("��¼ʧ�ܣ�");

			System.out.println("�����������¼����");
			new String();
			name1 = inpt.next();
			System.out.println("�����������¼���룺");
			new String();
			pwd1 = inpt.next();

		}
		System.out.println("��¼�ɹ�");
		String Depa = depa();
		String Register = register();
		String Data = data();
		personalInformation();
		@SuppressWarnings("unused")
		Scanner input = new Scanner(System.in);

		System.out.println("����ѡ��:    " + Depa + Register);
		System.out.println("��ѡ���ʱ��:" + Data);
		System.out.println("���ĸ�����Ϣ��");
		System.out.println("������" );
		System.out.println("�Ա�"   );
		System.out.println("���֤��" );
		System.out.println("�ֻ��ţ�" );
		System.out.println("��ַ��"  );
		System.out.println("����ԤԼ�ɹ�");

		

		
	}

	public static String depa() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("��ѡ�����:" + "\n�ڿ�  ���");
		String depa = input.nextLine();
		return depa;

	}

	public static String register() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("��ѡ��ר�Һ���ͨ��" + "\nר��  ��ͨ");
		String reg = input.nextLine();
		return reg;

	}

	public static String data() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("��ѡ������" + "\n��һ������");
		String data = input.nextLine();
		System.out.println("��ѡ��ʱ�䣺" + "\n����  ����");
		String time = input.nextLine();
		return data + time;

	}

	public static void personalInformation() {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("����������:");
		String name = input.nextLine();
		System.out.println("�������Ա�:");
		String sex = input.nextLine();
		System.out.println("���������֤�ţ�");
		String id = input.nextLine();
		System.out.println("�������ֻ���:");
		String cell = input.nextLine();
		System.out.println("�������ͥסַ��");
		String address = input.nextLine();
		
	}

}
