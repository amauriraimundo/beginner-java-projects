package application;

import java.util.Locale;
import java.util.Scanner;

import moeda.Dollar;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Dollar dollar = new Dollar();
		
		System.out.println("Enter the Dollar price: ");
		System.out.print("Price: ");
		dollar.price = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		dollar.howMany = sc.nextDouble();
		
		dollar.convertDollar(dollar.howMany);
		
		System.out.println(dollar.totally);
		
		/*double value = dollar.totally;
		dollar.convertDollar(value);*/
		
		
		System.out.print("Amount to be paid in reais = " + dollar.totally);
		
		
		sc.close();
	}

}
