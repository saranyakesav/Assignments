package day1.homeassignment;

public class NumPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int r,sum=0,temp;    
		  int number=222;
		  
		  temp=number;    
		  while(number>0){    
		   r=number%10;  
		   sum=(sum*10)+r;    
		   number=number/10;    
		  }    
		  if(temp==sum)    
		   System.out.println(+temp+" is a Palindrome number ");    
		  else    
		   System.out.println(+temp+"  is Not a palindrome");    
		}  
	}


