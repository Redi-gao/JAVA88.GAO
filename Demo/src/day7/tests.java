package day7;
/**
 * ֵ����
 * @author Redion
 *
 */

public class tests {
	String name;
	public void getName(tests uTests){
		System.out.println(uTests);
		uTests.name = "����";
	}
	public void getName2(tests uTests){
		System.out.println("ԭ�����ڴ��ַ��"+uTests);
		uTests = new tests();
		System.out.println("new֮����ڴ��ַ��"+uTests);
		uTests.name = "�Ը�";
		
	}

	public static void main(String[] args) {
		tests Tests = new tests();
		System.out.println(Tests);
		Tests.name = "����";
		Tests.getName(Tests);
		System.out.println(Tests.name);
		
		Tests.getName2(Tests);
		System.out.println(Tests.name);
		
		
	}

}
