package week3.day1;

public class StudentInformation {

	public void getStudentInfo(int StudentID)

	{

		System.out.println("Student Id is :" + StudentID);
	}

	public void getStudentInfo(int StudentID, String name)

	{

		System.out.println("Student Id is :" + StudentID + " and Student Name is :" + name);
	}

	public void getStudentInfo(String email, String phoneNumber)

	{

		System.out.println("Student eamil is :" + email + "  Sudent Phone number is :" + phoneNumber);
	}

	public static void main(String[] args) {

		StudentInformation StdInfo = new StudentInformation();

		StdInfo.getStudentInfo(4567);
		StdInfo.getStudentInfo(4567, "Amir Farooq");
		StdInfo.getStudentInfo("satti.amir@gmail.com", "09788889999");

	}

}
