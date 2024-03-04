package homeWork;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mb=new Mobile();
		mb.makeCall();
		mb.sendMsg();
		

	}
public void makeCall()
{
	String mobileModel="NOKIA";
	float mbWeight=99.9f;
	System.out.println("MOBILE FEATURES : [from makecall()]");System.out.println("*******************");
	System.out.println("This is my mobile---> "+mobileModel);
	System.out.println("");
	System.out.println("Mobile Weighs ---> "+mbWeight+"gms");
	System.out.println("");	
			
	
}
public void sendMsg() {
	boolean isFullyCharged=true;
	int mobileCost=4000;
	System.out.println("From Sendmsg()");System.out.println("**************");
	System.out.println("Is It FullyCharged ---> "+isFullyCharged+" & FULL");
	System.out.println("");
	System.out.println("Mobile Cost ---> "+mobileCost+" RS");
			
	
			
	
}
}

