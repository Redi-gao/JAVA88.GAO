package day7;
/**
 * 
 * @author Redion
 *
 */
public class Railway {
	//�û���
	String usreName;
	//��¼����
	String userPwd;
	//֤������
	String documentType;
	//����
	String Name;
	//֤������
	String idNumber;
	//����
	String eMail;
	//�ֻ���
	String call;
	//�ÿ�����
	String types;
	//ȷ������
	String userPwd1;
	 

	public static void main(String[] args) {
		

	}

	public  void RailwayInfo(){
		System.out.println("�û���"+this.usreName+"\n��¼����"+this.userPwd+"\n����"+this.Name+"\n֤������"+this.idNumber+"\n����"+this.eMail+"\n�ֻ���"+this.call);
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
