package day1.classroom;

public class Mobile {
	public long makeCall()
	{
		System.out.println("call not lifted");
		return 9999999999l;
	}
	
	public String sendSMS()
	{
		System.out.println("SMS sent");
		return "HI";
	}
	
	public void shutDown()
	{
		System.out.println("phone off");
	
	}
	
	public static void main(String[] args) {
		Mobile mobCall= new Mobile();
		long makeCall = mobCall.makeCall();
		System.out.println(makeCall);
		
Mobile sms=new Mobile();
String sendSMS = sms.sendSMS();
System.out.println(sendSMS);

Mobile shut=new Mobile();
shut.shutDown();
	}

}
