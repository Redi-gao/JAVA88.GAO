package day5;

public class test2 {

	public static void main(String[] args) {
		
		String[] pors = { "江苏省", "山东省" };
		String[] catys1 = { "南京市", "徐州市" };
		String[] catys2 = { "日照", "菏泽" };
		for (int i = 0; i < pors.length; i++) {
			if (pors[i].equals("江苏省")) {
				for (String a : catys1) {
					System.out.println(pors[i] + "的城市" + a);

				}
			}
			if (pors[i].equals("山东省")) {
				for (String b : catys2) {
					System.out.println(pors[i] + "的城市" + b);

				}
			}

		}
		
		System.out.println("================================================");
		for(String name : pors){
			System.out.println(name);
			
		}
	}
}