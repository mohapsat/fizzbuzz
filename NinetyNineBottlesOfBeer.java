public class NinetyNineBottlesOfBeer {

	public static void main (String[] args) {
	
	
	int bottle_num = 99;

	while ( bottle_num > 0 ) {
		
		System.out.println (bottle_num + " bottles of beer on the wall, " + bottle_num + " bottles of beer.");
		bottle_num -= 1;
		System.out.println ("Take one down and pass it around, " + bottle_num + " bottles of beer on the wall.\n");
		
	
		if (bottle_num == 1) {
				
				System.out.println (bottle_num + " bottle of beer on the wall, " + bottle_num + " bottle of beer.");
		                bottle_num -= 1;
				String nomo = "no more";
		                System.out.println ("Take one down and pass it around, " + nomo + " bottles of beer on the wall.\n");
	
				System.out.println (nomo + " bottles of beer on the wall, " + nomo + " bottles of beer.");
  //                              bottle_num -= 1;
  //                              String nomo = "no more";
                                System.out.println ("Go to the store and buy some more, " + "99 bottles of beer on the wall.\n");


			}


		}
	
	
	}





}
