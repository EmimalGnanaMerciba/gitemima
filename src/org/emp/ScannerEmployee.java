package org.emp;
import java.util.Scanner;
public class ScannerEmployee {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Employee Details:");
		System.out.println("=================");
		String nextLine = s.nextLine();
		System.out.println(nextLine);
		System.out.println("Employee Id: 07");
		System.out.println("Employee Name: Emima"); 
		System.out.println("Employee Email: emi.pauldurai@gmail.com");
		System.out.println("Employee Ph:9384399679");
		System.out.println("Employee Salary:15k");
		System.out.println("Employee Gender:F");
		System.out.println("Employee City: Chennai");
	}
	
}