package day6;

import java.util.Arrays;

/**
 * 冒泡排序
 * @author Redion
 *
 */
public class Bubbletest1 {

	public static void main(String[] args) {
		int[] names = {102,-1,45,32,1,6,45,43,4654,12};
		int outName = 0;
		System.out.println("=============没排序=================");
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]+"\t");
			
		}
		System.out.println();
		System.out.println("=============排序=================");
		int n = 0;//进入if判断大小次数
		for (int i = 0; i < names.length-1; i++) {//外层循环控制多少轮结束
			//boolean flag = true;
			for (int j = 0; j < names.length-1-i; j++) {//内循环把比较后的最大数挑出来，不做比较
				//第一次位置102[j],-1[j+1]
				if (names[j]>names[j+1]) {
					n++;
					
					
					int team = names[j];//临时存放
					names[j] = names[j+1];//把后一个位置给前一个，位置交换
					names[j+1] = team;//临时抽取的位置给第二个位置
					System.out.println("比较后输出值"+Arrays.toString(names));
					//flag = false;
				
					
				}
				
			}
			/*if (flag) {
				break;
				
			}*/
		}
		outName++;
		System.out.println("内循环比较多少次"+n);
		System.out.println("外循环比较多少次"+outName);
	}

}
