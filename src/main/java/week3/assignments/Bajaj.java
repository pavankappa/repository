package week3.assignments;

public class Bajaj extends Bike{

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("speed is High");
	}
	
	public static void main(String[] args)
	{
		Bike b=new Bajaj();
		int price = b.cost();
		System.out.println("Cost of the Vehicle is "+price);
		b.speed();
	}

}
