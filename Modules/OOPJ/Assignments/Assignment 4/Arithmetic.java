package Ass_4_mam;

/*
3) Write a program that performs arithmetic operations 
involving different data types (int, double, float) and 
observes how Java handles widening conversions 
automatically. 
*/






public class Arithmetic {

	public static void main(String[] args) {
		
		int intVal = 10;
        float floatVal = 20.5f;
        double doubleVal = 30.75;

        
        double res1 = intVal + floatVal;   
        double res2 = floatVal + doubleVal; 
        double res3 = intVal + doubleVal;   

        System.out.println("Result of int + float: " + res1);
        System.out.println("Result of float + double: " + res2);
        System.out.println("Result of int + double: " + res3);

	}

}
