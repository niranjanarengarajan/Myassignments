package week1.day1assignmts;

public class Mobile {

 public void makeCall() {
	 
	System.out.println("calling my friend");
	String mobileModel = "iphone11";
    float mobWeight = 170.50f;
    System.out.println("mobileModel = " + mobileModel);
    System.out.println("mobWeight = " + mobWeight);
}
 public void sendSms() {
	 System.out.println("received Sms");  
     boolean chargingFull = true;
     int mobcost = 50000 ; 
     System.out.println("chargingFull = " + chargingFull);
	 System.out.println("mobcost = " + mobcost);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is my Mobile");
		Mobile name= new Mobile();
		name.makeCall();
		name.sendSms();
		
		
		
        
      
        
        
	}

}
