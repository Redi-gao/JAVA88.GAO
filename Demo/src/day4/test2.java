package day4;

import java.util.Scanner;

/**
 * ����
 * 
 * @author Redion
 *
 */

public class test2 {

	public static void main(String[] args) {
		System.out.println("����������֪���������������·ݣ�");

		Scanner in = new Scanner(System.in);

		int mounth = in.nextInt();// ��ȡ���������

		System.out.println("��" + mounth + "������������Ϊ" + sum(mounth)+"ֻ");

		in.close();

	}
	public static int sum(int mounth) {
		if (mounth == 1||mounth == 2) {
			return 2;
			
		}else {
			return (sum(mounth-1)+sum(mounth-2));
		}
		
	}


}
