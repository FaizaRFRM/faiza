import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sa = new Scanner(System.in);
		ArrayList<School> schoolList = new ArrayList<School>();
		ArrayList<String> emailList = new ArrayList<>();
		ArrayList<Subject> subjectList = new ArrayList<Subject>();
		ArrayList<Marks> marksList = new ArrayList<Marks>();
		Stack<String> stackHistory = new Stack<String>();
		Set<String> setUniquEmail = new HashSet<>();
		ArrayList<Student> studentList = new ArrayList<Student>();
		// boolean isExit=true;
		boolean schoolExit = true;
		boolean studentExit = true;
		boolean subjectExit = true;

		do {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("!!!!!!    MENU    !!!!!!!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("Enter one number from the menue");
			System.out.println("===============================");
			System.out.println("1-Enter Student details");
			System.out.println("2-Print report");
			System.out.println("3-show history");
			System.out.println("4-print duplicatted e-mails");
			System.out.println("5-Student fees");
			System.out.println("6-calculate factory");
			System.out.println("7-exit");
			System.out.println("===============================");
			System.out.println("enter your number");
			int option;
			option = sa.nextInt();
			switch (option) {
			case 1:
				while (schoolExit) {
					School schools = new School();
					Subject subject = new Subject();
					System.out.println("Enter School Name:");
					String enterSchool = sa.next();
					schools.setSchoolName(enterSchool);
					// schoolList.add(schools);
					stackHistory.push(enterSchool);

					System.out.println("Enter School Address:");
					String enterAddress = sa.next();
					schools.setSchoolAddress(enterAddress);

					 stackHistory.push(enterAddress);
					studentExit = Boolean.TRUE;

					while (studentExit) {
						Student student = new Student();

						System.out.println("Enter Student Name:");
						String enterStudentName = sa.next();
						student.setStudentName(enterStudentName);
						// studentList.add(student);
						 stackHistory.push(enterStudentName);

						System.out.println("Enter Student Id:");
						int enterStudentId = sa.nextInt();
						String idString = Integer.toString(enterStudentId);
						student.setStudentId(enterStudentId);
						 stackHistory.push(idString);

						System.out.println("Enter Email:");
						String enterEmail = sa.next();

						 stackHistory.push(enterEmail);
						emailList.add(enterEmail);
						subjectExit = Boolean.TRUE;// translate to other while

						while (subjectExit) {
							// Subject subject = new Subject();
							Marks mark = new Marks();
							System.out.println("Enter Subject Name:");
							String enterSubjectName = sa.next();
							subject.setSubjectName(enterSubjectName);
							 stackHistory.push(enterSubjectName);

							System.out.println("Enter Subject Code:");
							String enterCode = sa.next();
							subject.setSubjectCode(enterCode);
							subjectList.add(subject);
							student.setSubjectList(subjectList);

							 stackHistory.push(enterCode);

							System.out.println("Enter mark:");
							int enterMark = sa.nextInt();
							String markString = Integer.toString(enterMark);
							mark.setMark(enterMark);
							subjectList.add(subject);
							marksList.add(mark);
							subject.setMarksList(marksList);

							 stackHistory.push(markString);

							System.out.println("DO YOU WANT TO ADD SUBJECT PRESS 1 IF NOT PRESS 0");
							int exitSubject = sa.nextInt();
							if (exitSubject == 0)
								subjectExit = false;

						}
						schoolList.add(schools);
						studentList.add(student);
						schools.setStudentList(studentList);

						System.out.println("DO YOU WANT TO ADD student PRESS 1 IF NOT PRESS 0");
						int exitStudent = sa.nextInt();
						if (exitStudent == 0) {
							studentExit = false;

						}

						else {
							studentExit = true;
							subjectExit = true;
						}
					}

					System.out.println("DO YOU WANT TO ADD school PRESS 1 IF NOT PRESS 0");
					int exitSchool = sa.nextInt();
					if (exitSchool == 1) {
						schoolExit = true;
						studentExit = true;
						subjectExit = true;
					} else {
						schoolExit = false;
						studentExit = false;
						subjectExit = false;
					}

				}

				break;

			case 2:

				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("!!!!!!   REPORT   !!!!!!!");
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("______________________________________________");
				for (School forSchool : schoolList) {
					System.out.println("SCHOOL NAME:   " + forSchool.getSchoolName() + "    SCHOOL ADDRESS:  "
							+ forSchool.getSchoolAddress());
					for (Student forStudent : forSchool.getStudentList()) {
						System.out.println("STUDENT NAME:  " + forStudent.getStudentName() + "    STUDENT ID:   "
								+ forStudent.getStudentId());
						for (Subject forSubject : forStudent.getSubjectList()) {
							for (Marks forMarks : forSubject.getMarksList()) {
								System.out
										.println("SUBJECT NAME:  " + forSubject.getSubjectName() + "   SUBJECT code:  "
												+ forSubject.getSubjectCode() + "MARKS:  " + forMarks.getmark());
							}
						}
					}
				}
				System.out.println("______________________________________________");
				break;
			case 3:
				System.out.println("HISTORY");
				System.out.println("______________________________________________");
				while (stackHistory.empty() == false) {
					System.out.println(stackHistory.pop());
				}
				System.out.println("______________________________________________");
				break;
			case 4:
				for (String studentEmail : emailList) {
					if (setUniquEmail.add(studentEmail) == false) {
						System.out.println("duplicated Emails are    " + studentEmail);
					}
				}
				break;
			}
		} while (true);

	}
}

/*
 * case 5: break; case 5: break; case 5: break;
 */
// }while(true);

// while();
/*
 * =========================================================================
 * 1-make classes with veriables 2-make set and get methods for every veriables
 * to make it not cgangeable 3-make array list in every class related to onother
 * class with bring lists from the class by get and set methods 4-work in the
 * main class: import scanner and stack
 * 
 */
