public class GoodDogDriver {

	public static void main (String[] args) {
	
	GoodDog d1 = new GoodDog();
	GoodDog d2 = new GoodDog();
	GoodDog d3 = new GoodDog();

	d1.setSize(3);
	d2.setSize(15);
	d3.setSize(55);

	System.out.println (d1.getSize());
	System.out.println (d2.getSize());
	System.out.println (d3.getSize());

	d1.bark();
	d2.bark();
	d3.bark();	
	
	}

}
