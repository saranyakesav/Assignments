package day1.homeassignment;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i, n=20;
         int t1 = 0, t2 = 1;
		  int t3 = t1 + t2;
		  
		System.out.println("Fibonacci Series are  :\n"+ t1 +"\n" + t2);

		
		for (i = 0; i <= n; ++i) {
			 System.out.println("\n"+ t3);
		    t1 = t2;
		    t2 = t3;
		    t3 = t1 + t2;
		   
		  }
	}

}
