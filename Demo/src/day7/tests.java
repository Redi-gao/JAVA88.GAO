package day7;
/**
 * 值传递
 * @author Redion
 *
 */

public class tests {
	String name;
	public void getName(tests uTests){
		System.out.println(uTests);
		uTests.name = "赵柳";
	}
	public void getName2(tests uTests){
		System.out.println("原来的内存地址："+uTests);
		uTests = new tests();
		System.out.println("new之后的内存地址："+uTests);
		uTests.name = "赵高";
		
	}

	public static void main(String[] args) {
		tests Tests = new tests();
		System.out.println(Tests);
		Tests.name = "张三";
		Tests.getName(Tests);
		System.out.println(Tests.name);
		
		Tests.getName2(Tests);
		System.out.println(Tests.name);
		
		
	}

}
