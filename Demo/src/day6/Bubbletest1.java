package day6;

import java.util.Arrays;

/**
 * ð������
 * @author Redion
 *
 */
public class Bubbletest1 {

	public static void main(String[] args) {
		int[] names = {102,-1,45,32,1,6,45,43,4654,12};
		int outName = 0;
		System.out.println("=============û����=================");
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]+"\t");
			
		}
		System.out.println();
		System.out.println("=============����=================");
		int n = 0;//����if�жϴ�С����
		for (int i = 0; i < names.length-1; i++) {//���ѭ�����ƶ����ֽ���
			//boolean flag = true;
			for (int j = 0; j < names.length-1-i; j++) {//��ѭ���ѱȽϺ��������������������Ƚ�
				//��һ��λ��102[j],-1[j+1]
				if (names[j]>names[j+1]) {
					n++;
					
					
					int team = names[j];//��ʱ���
					names[j] = names[j+1];//�Ѻ�һ��λ�ø�ǰһ����λ�ý���
					names[j+1] = team;//��ʱ��ȡ��λ�ø��ڶ���λ��
					System.out.println("�ȽϺ����ֵ"+Arrays.toString(names));
					//flag = false;
				
					
				}
				
			}
			/*if (flag) {
				break;
				
			}*/
		}
		outName++;
		System.out.println("��ѭ���Ƚ϶��ٴ�"+n);
		System.out.println("��ѭ���Ƚ϶��ٴ�"+outName);
	}

}
