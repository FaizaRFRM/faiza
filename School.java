import java.util.ArrayList;

public class School {

	private String schoolName;
	private String address;
	private ArrayList<Student> studentList;
	private ArrayList<Student> studentIdList;

	void setSchoolName(String sclName) {
		this.schoolName = sclName;
	}

	String getSchoolName() {
		return schoolName;
	}

	void setSchoolAddress(String sclAddress) {
		this.address = sclAddress;
	}

	String getSchoolAddress() {
		return address;
	}

	void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	void setStudentId(ArrayList<Student> studentIdList) {
		this.studentIdList = studentIdList;
	}

	public ArrayList<Student> getStudentIdList() {
		return studentIdList;
	}
	/*
	 * ArrayList<Student> emailList=new ArrayList<Student>(); void
	 * setEmail(ArrayList<Student> emailList) { this.emailList= emailList; } public
	 * ArrayList<Student> getEmailList(){ return emailList; }
	 */

}
