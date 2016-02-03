class Dog {

	String name;

	public static void main(String[] args) {
	
		//make a dog object and access it

		Dog dog1 = new Dog();

		dog1.bark();
		dog1.name = "Bart";

		//make a dog array

		Dog[] myDogs = new Dog[3];

		//put some dogs in it

		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;
		
		//access the Dogs using reference

		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";

		///what is myDogs[2] name ?

		System.out.print("last dogs name is :");
		System.out.println(myDogs[2].name);

		//loop through array

		int x = 0;

		while (x < myDogs.length) {
		
			myDogs[x].bark();

			x+=1;
		
		}


	}

	public void bark() {
	
		System.out.println(name + " Says Ruff!!");

	}


	public void eat() {
	
	}


	public void chaseCat() {
	
	}


}
