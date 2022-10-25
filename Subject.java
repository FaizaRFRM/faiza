import java.util.ArrayList;

public class Subject {

	private String subjectName;
	private String subjectCode;
	private ArrayList<Marks> marksList;

	void setSubjectName(String subName) {
		this.subjectName = subName;
	}

	String getSubjectName() {
		return subjectName;
	}

	void setSubjectCode(String subCode) {
		this.subjectCode = subCode;
	}

	String getSubjectCode() {
		return subjectCode;
	}

	

	void setMarksList(ArrayList<Marks> marksList) {
		this.marksList = marksList;
	}

	public ArrayList<Marks> getMarksList() {
		return marksList;
	}
}
