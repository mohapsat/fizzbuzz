class FlowchartDriver {

	public static void main(String[] args){
	
	Flowchart f1 = new Flowchart();
	Flowchart f2 = new Flowchart();

	f1.name = "SFLY_TEST1";
	f1.type = "TRG";
	f1.id	= 100;
	
	f2 = null;

	System.out.println ("Flowchart: " + f2.name + " of the type " + f2.type + " and id " + f2.id);
	f2.validate();
	f2.run();
	
	
	}


}
