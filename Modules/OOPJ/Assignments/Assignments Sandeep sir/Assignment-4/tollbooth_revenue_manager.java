package Ass_4_sir;


import java.util.Scanner;

public class tollbooth_revenue_manager {
    public static void main(String[] args) {
    	tollBoothRevenueManagerUtil.menuList();
    }
}

class Tollbooth_revenue_manager {
	
	    private int cars;
	    private int trucks;
	    private int motorcycles;

	    private final double carRate = 50.00;
	    private final double truckRate = 100.00;
	    private final double motorcycleRate = 30.00;

	    public Tollbooth_revenue_manager(int cars, int trucks, int motorcycles) {
	        this.cars = cars;
	        this.trucks = trucks;
	        this.motorcycles = motorcycles;
	    }

	    public double calculateTotalRevenue() {
	        return (cars * carRate) + (trucks * truckRate) + (motorcycles * motorcycleRate);
	    }

	    public int calculateTotalVehicles() {
	        return cars + trucks + motorcycles;
	    }

	    @Override
	    public String toString() {
	        return "tollbooth_revenue_manager{" +
	                "cars=" + cars +
	                ", trucks=" + trucks +
	                ", motorcycles=" + motorcycles +
	                '}';
	    }
	}
class tollBoothRevenueManagerUtil {
    public static Tollbooth_revenue_manager acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of cars: ");
        int cars = scanner.nextInt();
        System.out.print("Enter number of trucks: ");
        int trucks = scanner.nextInt();
        System.out.print("Enter number of motorcycles: ");
        int motorcycles = scanner.nextInt();
        
        return new Tollbooth_revenue_manager(cars, trucks, motorcycles);
    }

    public static void printRecord(Tollbooth_revenue_manager manager) {
        System.out.println("Total Vehicles: " + manager.calculateTotalVehicles());
        System.out.println("Total Revenue: ₹" + manager.calculateTotalRevenue());
    }

    public static void menuList() {
    	Tollbooth_revenue_manager manager = acceptRecord();
        printRecord(manager);
    }
}



