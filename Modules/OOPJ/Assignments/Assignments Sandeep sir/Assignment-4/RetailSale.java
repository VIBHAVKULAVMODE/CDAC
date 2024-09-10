package Ass_4_sir;

import java.util.Scanner;


class DiscountCalculator{
	private double originalPriceItem;
	private double discountRate;
	private double discountAmount;
	private double finalPrice;
	
	public DiscountCalculator(double originalPriceItem,double discountRate) {
		 this.originalPriceItem=originalPriceItem;
		 this.discountRate=discountRate;	
		 
	 }

	public double getOriginalPriceItem() {
		return originalPriceItem;
	}

	public void setOriginalPriceItem(double originalPriceItem) {
		this.originalPriceItem = originalPriceItem;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public void calculateDiscount() {
		discountAmount = originalPriceItem * (discountRate / 100);
		finalPrice = originalPriceItem - discountAmount;
	}
	
	
	@Override
	public String toString() {
		return "Bmi [originalPriceItem=" + originalPriceItem + ", discountRate=" + discountRate +  "]";
	}
}
	
	class  DiscountCalculatorUtil {
		Scanner sc=new Scanner(System.in);

		private DiscountCalculator dc;

		private double discountAmount;

		private double finalPrice;
		
		 public void acceptRecord() {
			
			 Scanner sc = new Scanner(System.in);
				System.out.println("Enter the original price of a item :");
				double originalPriceItem = sc.nextDouble();
				System.out.println("enter the discount rate in percentage ");
				double discountRate = sc.nextDouble();
			
			dc=new DiscountCalculator(originalPriceItem,discountRate);
		}

public void  printRecord() {
	//dc.calculateDiscount();
	System.out.println("Discount amount is a :" + this.discountAmount);
	System.out.println("Final price is :" + this.finalPrice);
}
public void menuList() { 
	while(true) {
		System.out.println("1.Accept Record");
		System.out.println("2.Print Record");
		System.out.println("3.Exit");
		System.out.print("Enter option:");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			acceptRecord();
			break;
		case 2:
			printRecord();
			break;
		case 3:
			System.out.println("Program Terminated");
			return;
			default:
				System.out.println("Invalid Option");
		}
	  }
    }
  }


public class RetailSale {
	public static void main(String[] args) {
		DiscountCalculatorUtil dcu=new DiscountCalculatorUtil();
		dcu.menuList();
	}
}


