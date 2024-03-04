package day1.homeassignment;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number=100,rem,count,num;
int i ;
for(num = 1;num<=number;num++){

    count = 0;
for (i=2; i <= num/2;) {
    rem = num % i;
    
    if (rem ==  0)
    	count++;
    break;
}
if(count==0 && num!= 1)
{
    System.out.println(""+num);
}   	
}
      
}
	}


