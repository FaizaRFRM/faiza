import java.util.ArrayList;

public class Student {

	private String studentName;
	private int studentId;
	private String studentEmail;
	private ArrayList<Subject> subjectList;
	private ArrayList<Subject> subjectCodeList;

	public String getEmail() {
		return studentEmail;
	}

	public void setEmail(String email) {
		studentEmail = email;
	}

	void setStudentName(String stdName) {
		this.studentName = stdName;
	}

	String getStudentName() {
		return studentName;
	}

	void setStudentId(int stdId) {
		this.studentId = stdId;
	}

	int getStudentId() {
		return studentId;
	}

	

	void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}

	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}

	

	void setSubjectCode(ArrayList<Subject> subjectCodeList) {
		this.subjectCodeList = subjectCodeList;
	}

	public ArrayList<Subject> getSubjectCodeList() {
		return subjectCodeList;
	}
}
