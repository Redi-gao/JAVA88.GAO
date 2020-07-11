package day6;

public class userTest2 {
	String name;
	int age;
	char sex;
	String cal;
	String address;
	public void codeing(String name){
		System.out.println();
		
	}

	public static void main(String[] args) {
		userTest2 u1 = new userTest2();
		u1.name = "洛天依";
		u1.age = 16;
		u1.sex = '女';
		u1.cal = "123456";
		u1.address = "中国";
		System.out.println(u1);
		userTest2 u2 = new userTest2();
		System.out.println(u2);
		userTest2 u3 = new userTest2("name",2, 's', "cal", "address");
		System.out.println(u3);
		userTest2 u4 = new userTest2(null, 0);
		System.out.println(u4);
		
		
		/*userTest2 u1 = new userTest2();
		System.out.println(u1.toString());
		System.out.println(u1.age);
		u1.codeing("高雨生");
		userTest2 u2 = new userTest2();
		System.out.println(u2);*/

	}

	@Override
	public String toString() {
		return "userTest2 [name=" + name + ", age=" + age + ", sex=" + sex + ", cal=" + cal + ", address=" + address
				+ "]";
	}
	public userTest2(String name,int age,char sex,String cal,String address){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.cal = cal;
		this.address = address;
	}
	public userTest2(String name,int age){
		this.name = name;
		this.age = age;
	}
	public userTest2(){
		
	}
	
/*	@Override
	public String toString() {
		return "你猜这是啥:"+hashCode();
	}*/

}
