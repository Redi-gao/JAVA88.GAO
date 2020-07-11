package day8;
/**
 * 封装
 * @author Redion
 *
 */
public class dame1 {
	private String name;
	int age;
	char sex;
	
	
	void showDameInfo(){
		System.out.println("进入dame类的showDameInfo方法。。。");
		this.name = "张三";
		System.out.println("姓名为："+name);
	}
	public void showPublicshowDameInfo(){
		System.out.println("进入dame类的showPublicshowDameInfo方法。。。");
		this.name = "张三";
		System.out.println("姓名为："+name);
	}

	public static void main(String[] args) {
		

	}

}
