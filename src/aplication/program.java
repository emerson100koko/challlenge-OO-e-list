package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.taxpayer;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<taxpayer> taxpayers = new ArrayList<>();
		
		System.out.print("How many taxpayers will you enter? ");
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++) {
			
			System.out.println("\nEnter the data of the " + (i+1) + "st contributor:");
			System.out.print("Annual income with salary: ");
			double salaryIncome = sc.nextDouble();
			
			System.out.print("Annual income with services provision: ");
			double servicesIncome = sc.nextDouble();
			
			System.out.print("Annual Income with capital gain: ");
			double capitalIncome = sc.nextDouble();
			
			System.out.print("Health Spending: ");
			double healthSpending = sc.nextDouble();
			
			System.out.print("Education Spending: ");
			double educationSpending = sc.nextDouble();
			
			taxpayer taxpayer = new taxpayer(salaryIncome,servicesIncome, capitalIncome, healthSpending, educationSpending, educationSpending);
			taxpayers.add(taxpayer);
		}
		
		for (int i=0;i<n;i++) {

			System.out.println("\nSummary of the " + (i+1) + "o taxpayer: ");
			
			System.out.printf("\nGross Tax: %.2f" , taxpayers.get(i).grossTax());
			System.out.printf("\nTax Rebate: %.2f", taxpayers.get(i).taxRebate());
			System.out.printf("\nNet Tax : %.2f", taxpayers.get(i).netTax());
			System.out.println();
		}
	}

}
