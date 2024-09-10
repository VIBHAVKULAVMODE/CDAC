package Ass_4_mam;

public class WideningAll {

	public static void main(String[] args) {
		 int num = 42;
	        
	        double doubleResult = num;
	        float floatResult = num;
	        boolean booleanResult = (num != 0);  
	        String stringResult = Integer.toString(num);

	        System.out.println("  int to double: " + doubleResult);
	        System.out.println("  int to float: " + floatResult);
	        System.out.println(" int to boolean: " + booleanResult);
	        System.out.println(" int to string: " + stringResult);
	}

}
