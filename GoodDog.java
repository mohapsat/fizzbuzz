public class GoodDog {

	private int size;
	private String name;

	public int getSize () {
		
		return size;

	}
	
	public void setSize (int num) {
	
		size = num;
	
	}

	void bark () {
	
		if (size < 10 ){
			System.out.println("woof woof!! ");
		} else if ((size >=10) & (size <= 100)) {
			System.out.println("ruff ruff!!");
		} else {
			System.out.println("wuff wuff!!");
		
		}
		
	}


}
