package week3.day1;

public class Student extends Department {

	public void studentName() {
		System.out.println("Student Name : Amir Farooq");

	}

	public void studentDept() {
		System.out.println("Student Depart : Java Selenium");

	}

	public void studentId() {
		System.out.println("Student ID is : 89");
	}

	public static void main(String[] args) {

		Student St = new Student();

		St.collegeName();
		St.collegeCode();
		St.collegeRank();
		St.deptName();
		St.studentName();
		St.studentDept();
		St.studentId();

	}

}
