package task;
/**
 * ҽ����ţ����������ң�����ԤԼʱ��
 * @author Redion
 *
 */
public class doctor {
		String doctorId;
		String name;
		String department;
		String time;

	public static void main(String[] args) {
		doctor d1 = new doctor("9567", "����", "����", "����");
		System.out.println(d1);

	}

	public doctor(String doctorId, String name, String department, String time) {
		this.doctorId = doctorId;
		this.name = name;
		this.department = department;
		this.time = time;
	}

	public doctor() {
		
	}

	@Override
	public String toString() {
		return "doctor [doctorId=" + doctorId + ", name=" + name + ", department=" + department + ", time=" + time
				+ "]";
	}
	

}
