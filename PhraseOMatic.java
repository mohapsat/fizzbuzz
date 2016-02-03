public class PhraseOMatic {

	public static void main (String[] args) {
	
	String[] one = {"sing","dance","play","jump"};
	
//	one = new String[4];

	String[] two = {"roof","floor","tree","barn"};
	
//	two = new String[4];

	String[] three = {"happy","sad","excited","cheerful"};

//	three = new String[4];
	

	int counter = 0;

	while ( counter <= 20) {
	
	int twolen = two.length;

	int r_one = (int) (Math.random() *  one.length);

	int r_two = (int) (Math.random() *  twolen);

	int r_three = (int) (Math.random() * three.length);



	String phrase = one[r_one] + " " + two[r_two] + " " + three[r_three];


	System.out.println ("what we need is a " + phrase);
	
	counter++;

	}
	}




}
