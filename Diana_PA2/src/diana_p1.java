import java.util.Scanner;

public class diana_p1 
{
	public static void main(String[] args) 
		{
		int input, a, b, c, d;
		int aa, bb, cc, dd;
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a number for encryption.");
		input = scnr.nextInt();
		
		a = input % 10;
		b = (input % 100 - a) / 10;
		c = (input % 1000 - b - a) / 100;
		d = (input % 10000 -c - b - a) / 1000;
				
		aa = (a + 7) / 2;
		bb = (b + 7) / 2;
		cc = (c + 7) / 2;
		dd = (d + 7) / 2;
		
		System.out.printf("%d %d %d %d\n", bb,aa,dd,cc);
		}
}
