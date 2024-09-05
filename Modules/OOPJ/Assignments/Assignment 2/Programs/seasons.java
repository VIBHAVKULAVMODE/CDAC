import java.util.Scanner;
import java.time.Month;
public class seasons 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the month (1-12): ");
		int month = sc.nextInt();
		String monthname = null;
		String season;
		switch (month) 
		{
			case 12: 
			case 1:  
			case 2:  
				season = "Winter";
				break;
			case 3:
			case 4:
			case 5:
				season = "Spring";
				break;
			case 6:
			case 7:
			case 8:
				season = "Summer";
				break;
			case 9:
			case 10:
			case 11:
				season = "Autumn";
				break;
			default:
				season = "Invalid month!";
				break;
		}
		monthname=Month.of(month).toString();
		System.out.print("It's " + season + " season in " + monthname);
		sc.close();
	}
}


