package Ass_5_sir;

class Instance{
	private static int count=0 ;
	
	{
	
		count=count+1;
		//System.out.println("count: "+ this.count );
		
	}
	static void printInstance() {
		System.out.println("count: "+ Instance.count );
	}
}


public class InstanceCounter {

	public static void main(String[] args) {
Instance in= new Instance ();
Instance in1 =new Instance ();
Instance.printInstance();
	}

}
