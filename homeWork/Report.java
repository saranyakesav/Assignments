package homeWork;

public class Report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Report objst=new Report();
		
		System.out.println("************ STUDENT REPORT ******** ");
		objst.Student();
	}
	void Student ()
	{
		String stName="Sana",collName="LD College";
		int rollno=1234;
		int markScored=1150,cgpa=90;
		
		System.out.println("\n Student Name ------>  "+stName);
		System.out.println("\n College Name ------>  "+collName);
		System.out.println("\n Roll Number  ------>  "+rollno);
		System.out.println("\n Mark Scored     ------>  "+markScored);
		System.out.println("\n C.G.P.A          ------>  "+cgpa +"%");
	}

}
