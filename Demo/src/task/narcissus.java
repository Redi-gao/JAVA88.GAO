package task;
/**
 * ˮ�ɻ�
 */
import day3.iftest;

public class narcissus {

	public static void main(String[] args) {
		int a = 0;//��λ��
		int b = 0;//ʮλ��
		int c = 0;//��λ��
		for(int i = 100;i < 1000;i++  ){
			a = i/100;
			b = (i%100)/10;
			c = (i%100)%10;
			if ((a*a*a)+(b*b*b)+(c*c*c)==i) {
				System.out.println(i+ "\t");
				
			}
		}
 
	}

}
