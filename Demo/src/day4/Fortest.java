package day4;

import java.util.Scanner;

/**
 * ѭ��
 * 
 * @author Redion
 *
 */
public class Fortest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("���������֣�");
		int  endNum = in.nextInt();
		int count = 0;
		System.out.println("=========��ʼִ��=============");
		for (int i = 0; i<= endNum;i++) {
			if(!(i%2==0)&&i !=0){
				System.out.println("��"+count+"����"+i);
				count++;
			}
			
			
		}
		/*do {
			System.out.println(name+"����"+i+"Ȧ");
			i++;
		} while (i <= endNum);
		while (i <= endNum) {
			System.out.println(name+"����"+i+"Ȧ");
			i++;

		}*/
		System.out.println("һ����"+count);
		System.out.println("==========ִ�н���=============");
		in.close();
	}

}
