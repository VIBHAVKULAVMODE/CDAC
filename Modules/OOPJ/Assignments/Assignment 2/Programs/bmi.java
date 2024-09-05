import java.util.Scanner;
public class bmi
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter weight in kg: ");
		double weight = sc.nextDouble();
		System.out.println("Enter height in meters: ");
		double height = sc.nextDouble();
		double bmi = weight / (height*height);
		System.out.printf("BMI IS %.2f\n", bmi);
		if (bmi < 18.5)
		{
			System.out.println("You are underweight.");
		} 
		else if (bmi >= 18.5 && bmi < 24.9) 
		{
			System.out.println("You have a normal weight.");
		} 
		else if (bmi >= 25 && bmi < 29.9)
		{
			System.out.println("You are overweight.");
		} 
		else if (bmi >= 30 && bmi < 34.9) 
		{
			System.out.println("You have obesity class 1.");
		} 
		else if (bmi >= 35 && bmi < 39.9) 
		{
			System.out.println("You have obesity class 2.");
		} 
		else
		{
			System.out.println("You have obesity class 3.");
		}
		sc.close();
	}
}




