package task;

import java.util.Scanner;

/**
 * �Ƶ�Ԥ��
 * @author Redion
 *
 */

public class HotelReservation {
	static String name1 = "���ֺ�̩";
	static String name2 = "���";
	static String name3 = "���߿�ݾƵ�";

	public static void main(String[] args) {
		System.out.println("===============�Ƶ���Ϣ==================");
		address();
		choice();
		

	}
	public static void address(){
		String a1 = "	��ַ�����ݴ��001��";
		String a2 = "	��ַ�����ݴ��002��";
		String a3 = "	��ַ�����ݴ��003��";
		System.out.println(name1+"\n"+a1+"\n"+name2+"\n"+a2+"\n"+name3+"\n"+a3);
	}
	public static void choice(){
		Scanner in = new Scanner(System.in);
		
		System.out.println("===============��ѡ��Ƶ�=================");
		String name4 = in.nextLine();
		if (name4.equals(name1)) {
			System.out.println("����ѡ��"+name1);
			
		}
		if (name4.equals(name2)) {
			System.out.println("����ѡ��"+name2);
			
		}
		if (name4.equals(name3)) {
			System.out.println("����ѡ��"+name3);
			
		}else {
			System.out.println("û�иþƵ�");
		}

		in.close();
		
	}
	
	
}

