package diana_p1;

import java.util.Scanner;

public class encrypt
{
	public static void main(String[] args) 
	{
	int input, a, b, c, d;
	int aa, bb, cc, dd;
	Scanner scnr = new Scanner(System.in);
	
	System.out.println("Enter the number you would like to be encrypted.");
	input = scnr.nextInt();
	
	a = input % 10;
	b = (input % 100 - a) / 10;
	c = (input % 1000 - b - a) / 100;
	d = (input % 10000 -c - b - a) / 1000;
			
	aa = (a + 7) % 10;
	bb = (b + 7) % 10;
	cc = (c + 7) % 10;
	dd = (d + 7) % 10;
	
	System.out.printf("%d%d%d%d\n", bb,aa,dd,cc);
	
	scnr.close();
	}
}
