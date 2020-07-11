package day7;
/**
 * 
 * @author Redion
 *
 */
public class Railway {
	//用户名
	String usreName;
	//登录密码
	String userPwd;
	//证件类型
	String documentType;
	//姓名
	String Name;
	//证件号码
	String idNumber;
	//邮箱
	String eMail;
	//手机号
	String call;
	//旅客类型
	String types;
	//确认密码
	String userPwd1;
	 

	public static void main(String[] args) {
		

	}

	public  void RailwayInfo(){
		System.out.println("用户名"+this.usreName+"\n登录密码"+this.userPwd+"\n姓名"+this.Name+"\n证件号码"+this.idNumber+"\n邮箱"+this.eMail+"\n手机号"+this.call);
	}
	public void setType(String types) {
		this.types = types;
	}

	public void setUsreName(String usreName) {
		this.usreName = usreName;
	}



	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setDocumentType(String documentType){
		this.documentType =documentType;
		
	}



	public void setName(String name) {
		Name = name;
	}



	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}



	public void seteMail(String eMail) {
		this.eMail = eMail;
	}



	public void setCall(String call) {
		this.call = call;
	}
	
	public void setUserPwd1(String userPwd1) {
		this.userPwd1 = userPwd1;
	}

	
}
