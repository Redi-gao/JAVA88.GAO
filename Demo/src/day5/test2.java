package day5;

public class test2 {

	public static void main(String[] args) {
		
		String[] pors = { "����ʡ", "ɽ��ʡ" };
		String[] catys1 = { "�Ͼ���", "������" };
		String[] catys2 = { "����", "����" };
		for (int i = 0; i < pors.length; i++) {
			if (pors[i].equals("����ʡ")) {
				for (String a : catys1) {
					System.out.println(pors[i] + "�ĳ���" + a);

				}
			}
			if (pors[i].equals("ɽ��ʡ")) {
				for (String b : catys2) {
					System.out.println(pors[i] + "�ĳ���" + b);

				}
			}

		}
		
		System.out.println("================================================");
		for(String name : pors){
			System.out.println(name);
			
		}
	}
}