package day5;
/**
 * ����
 * @author Redion
 *
 */
public class test1 {

	public static void main(String[] args) {
		String[] studentName = new String[3];
		studentName[0] = "������";
		studentName[1] = "���";
		studentName[2] = "��߸";
		System.out.println("==============ѧ����Ϣ================");
		for (int i = 0; i < studentName.length; i++) {
			String string = studentName[i];
			System.out.println(string);
		}
		System.out.println("==============ѧ����Ϣend================");
		String[] pros = {"����ʡ","����ʡ","ɽ��ʡ","�㶫ʡ"};
		for (int i = 0; i < pros.length; i++) {
			System.out.println(pros[i]);
			
		}
	}

}
