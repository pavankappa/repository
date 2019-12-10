package week3.assignments;

public class Desktop implements HardWare,Software {

	@Override
	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Windows 10");
	}

	@Override
	public void hardwareResources() {
		// TODO Auto-generated method stub
		String ram = "16GB";
		String os = "Win 10";
		System.out.println("RAM is "+ram+" "+", OS is "+os);
	}
	
	public void desktopModel()
	{
		System.out.println("Pavillion Series");
	}
	
	public static void main(String[] args)

	{
		HardWare hw = new Desktop();
		hw.hardwareResources();
		
		Software sw = new Desktop();
		sw.softwareResources();
		
		Desktop dp = new Desktop();
		dp.desktopModel();
		
	}

}
