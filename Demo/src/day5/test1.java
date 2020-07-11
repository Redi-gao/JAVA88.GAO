package day5;
/**
 * 数组
 * @author Redion
 *
 */
public class test1 {

	public static void main(String[] args) {
		String[] studentName = new String[3];
		studentName[0] = "洛天依";
		studentName[1] = "李狗蛋";
		studentName[2] = "哪吒";
		System.out.println("==============学生信息================");
		for (int i = 0; i < studentName.length; i++) {
			String string = studentName[i];
			System.out.println(string);
		}
		System.out.println("==============学生信息end================");
		String[] pros = {"江苏省","河南省","山东省","广东省"};
		for (int i = 0; i < pros.length; i++) {
			System.out.println(pros[i]);
			
		}
	}

}
