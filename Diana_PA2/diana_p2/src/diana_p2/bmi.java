package diana_p2;

import java.util.Scanner;

public class bmi 
{
	public static void main(String[] args) 
	{
		double bmi = 0, weight, height;
		int input;
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter the integer of the mesurement would you like to use? "
				+ "\n(1) Customary\n(2) Metric");
		
		input = scnr.nextInt();
		
		while(input != 1 && input != 2)
		{
			System.out.println("Please Enter 1 for customary or 2 for metric.");
			input = scnr.nextInt();
		}
		
		if(input == 1)
		{
			System.out.println("Please enter your height in inches.");
			height = scnr.nextDouble();
			System.out.println("Please enter your weight in pounds.");
			weight = scnr.nextDouble();
			bmi = (703 * weight) / Math.pow(height, 2);
		}
		else if(input == 2)
		{
			System.out.println("Please enter your height in meters.");
			height = scnr.nextDouble();
			System.out.println("Please enter your weight in kilograms.");
			weight = scnr.nextDouble();
			bmi = weight / Math.pow(height, 2);
		}
		
		System.out.println("-------------------Body Weight Catagories-------------------");
		System.out.println("Underweight =< 18.5");
		System.out.println("Normal weight = 18.5 - 24.9");
		System.out.println("Overweight = 25 - 29.9");
		System.out.println("Obesity >= 30");
		System.out.println("------------------------------------------------------------");
		
		System.out.printf("The users BMI is: %2.2f", bmi);
		
		if(bmi < 18.5)
		{
			System.out.println(" and is considered underweight.");
		}
		else if(bmi >= 18.5 && bmi <= 24.9)
		{
			System.out.println(" and is considered normal weight.");
		}
		else if(bmi >= 25 && bmi <=29.9)
		{
			System.out.println(" and is considered overweight.");
		}
		else
			System.out.println(" and is considered obese.");
	}
}
