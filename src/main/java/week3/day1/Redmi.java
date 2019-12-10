package week3.day1;

public class Redmi extends Mobile {
	public String apps() {
		return "Mi app store";
	}
	
	public void miUI()
	{
		System.out.println("UI was MIUI");
	}
	
	public void miUI(String a)
	{
		System.out.println(a);
		
	}
	
	//Overriding Func - same signature with some changes
	public void call() {
		System.out.println(" Video Calling feature");
	
}
}
