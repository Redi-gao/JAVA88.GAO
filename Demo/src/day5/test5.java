package day5;

import java.awt.event.MouseWheelEvent;

public class test5 {
	public final static int CAPACITY = 2;

	public static void main(String[] args) {
		String[] oldName = {"天依","三三","纱雾",};
		System.out.println("老数组长度："+oldName.length);
		
		
		/*String[] newName = new String[oldName.length*CAPACITY];
		System.out.println("新数组长度："+newName.length);
		System.arraycopy(oldName, 0, newName, 0, oldName.length);
		oldName = newName;*/
		
		if (oldName.length<=3) {
			oldName = very(oldName);
			oldName[3] = "祢豆子";
			for (String ver : oldName) {
				System.out.println(ver);
				
			}
			
		}
		/*oldName[3] = "祢豆子";
		for (String ver : oldName) {
			System.out.println(ver);
			
		}*/
		
	
		/*StringBuffer name = new StringBuffer();
		name.append("1");
		name .append("2");
		name .append("3");
		name .append("4");
		System.out.println(name);
		String[] res = gerName();
		for (String n : res) {
			name.append(n+",");
			
		}
		System.out.println(name.substring(0, name.lastIndexOf(",")));
	}

	public static String[] gerName() {
		String[] user = {"a","b","c","d"};
		return user;*/
	}
	
	
	public static String[] very(String[] oldName){
		String[] newName = new String[oldName.length*CAPACITY];
		System.out.println("新数组长度："+newName.length);
		System.arraycopy(oldName, 0, newName, 0, oldName.length);
		oldName = newName;
		return oldName;
		
	}

}
