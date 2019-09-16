package diana_p3;

import java.util.Scanner;

public class survey 
{
	public static void main(String[] args) 
	{	
		//*/
		int i, j, k = 0, high, highLoc, low, lowLoc;
		int[] total = new int[5];
		Scanner scnr = new Scanner(System.in); 
		char c = 'a';
		int[] avg = new int[5];
		int[][] intArr = new int[5][10];
		String[] strArr = new String[5];
		
		
		strArr[0] = "How important are the mangroves to Florida?";
		strArr[1] = "How important is it to pay attention to the presidential "
				+ "canidates and their policies for the upcoming 2020 election?";
		strArr[2] = "How important are pets to you?";
		strArr[3] = "As we progress as a species is it important that we put a larger"
				+ " emphasis on off world colonization?";
		strArr[4] = "How important is it to keep private information off of the internet?";
		
		System.out.println("On a scale of 1 to 10 please rate the following topics in importance");
		for(j = 0; j < 10; j++)
		{
			for(i = 0; i < 5; i++)
			{
				System.out.printf("%s\n", strArr[i]);
				intArr[i][j] = scnr.nextInt();
				
				while(intArr[i][j] < 1 || intArr[i][j] > 10)
				{
					System.out.printf("Please answer the following question with 1 through 10\n");
					System.out.printf("%s\n", strArr[i]);
					intArr[i][j] = scnr.nextInt();
				}
			}
			
			k = j + 1;
			
			if(j < 9)
			{
				System.out.println("Would another user like to answer the polls (y or n)?");
				c = scnr.next().charAt(0);
				if(c == 'n' || c == 'N')
				{
					break;
				}
			}
		}
		
		for(i = 0; i < 5; i++)
		{
			for(j = 0; j < k; j++)
			{
				avg[i] += intArr[i][j];
				total[i] += intArr[i][j];
			}
			avg[i] = avg[i] / (k);
		}
		
		low = total[0];
		lowLoc = 1;
		high = total[0];
		highLoc = 1;
		
		for(i = 0; i < 5; i++)
		{			
			if(high < total[i])
			{
				high = total[i];
				highLoc = i + 1;
			}
			if(low > total[i])
			{
				low = total[i];
				lowLoc = i + 1;		
			}
		}
		
		//*/
		//yes I am aware of how awfully this was coded but I made it look nice then thought about functionality and could not be bothered to redo it
		System.out.println("-----------------------------------------------Report------------------------------------------------------");
		System.out.printf("How important are the mangroves to Florida?   |  %d  |  %d  |  %d  |  %d  |  %d  |  %d  |  %d  |  %d   | %d  |  %d   |  %d\n", 
				intArr[0][0], intArr[0][1], intArr[0][2], intArr[0][3], intArr[0][4],  intArr[0][5],  intArr[0][6],  intArr[0][7],  intArr[0][8],  intArr[0][9], avg[0]);
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.printf("How important is it to pay attention to the   |     |     |     |     |     |     |     |     |     |      |"
				+ "\npresidential canidates and their policies for |  %d  |  %d  |  %d  |  %d  |  %d  |  %d  |  %d  |  %d  |  %d  |  %d   |"
				+ "\nthe upcoming 2020 election?                   |     |     |     |     |     |     |     |     |     |      |  %d\n",
				intArr[1][0], intArr[1][1], intArr[1][2], intArr[1][3], intArr[1][4],  intArr[1][5],  intArr[1][6],  intArr[1][7],  intArr[1][8],  intArr[1][9], avg[1]);
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.printf("How important are pets to you?                |  %d  |  %d  |  %d  |  %d  |  %d  |  %d  |  %d  |  %d  |  %d  |  %d   |  %d\n",
				intArr[2][0], intArr[2][1], intArr[2][2], intArr[2][3], intArr[2][4],  intArr[2][5],  intArr[2][6],  intArr[2][7],  intArr[2][8],  intArr[2][9], avg[2]);
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.printf("As we progress as a species is it important   |     |     |     |     |     |     |     |     |     |      |"
				+ "\nthat we put a larger emphasis on off world    |  %d  |  %d  |  %d  |  %d  |  %d  |  %d  |  %d  |  %d  |  %d  |  %d   |"
				+ "\ncolonization?                                 |     |     |     |     |     |     |     |     |     |      |  %d\n",
				intArr[3][0], intArr[3][1], intArr[3][2], intArr[3][3], intArr[3][4],  intArr[3][5],  intArr[3][6],  intArr[3][7],  intArr[3][8],  intArr[3][9], avg[3]);
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.printf("How important is it to keep private           |  %d  |  %d  |  %d  |  %d  |  %d  |  %d  |  %d  |  %d  |  %d  |  %d   |"
				+ "\ninformation off of the internet?              |     |     |     |     |     |     |     |     |     |      |  %d\n",
				intArr[4][0], intArr[4][1], intArr[4][2], intArr[4][3], intArr[4][4],  intArr[4][5],  intArr[4][6],  intArr[4][7],  intArr[4][8],  intArr[4][9], avg[4]);
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		
		if(highLoc == 1)
		{
			System.out.printf("The issue with the highest total points is : \"%s\" with a total of %d points.\n", strArr[0], total[0]);
		}
		else if(highLoc == 2)
		{
			System.out.printf("The issue with the highest total points is : \"%s\" with a total of %d points.\n", strArr[1], total[1]);
		}
		else if(highLoc == 3)
		{
			System.out.printf("The issue with the highest total points is : \"%s\" with a total of %d points.\n", strArr[2], total[2]);
		}
		else if(highLoc == 4)
		{
			System.out.printf("The issue with the highest total points is : \"%s\" with a total of %d points.\n", strArr[3], total[3]);
		}
		else if(highLoc == 5)
		{
			System.out.printf("The issue with the highest total points is : \"%s\" with a total of %d points.\n", strArr[4], total[4]);
		}
		
		if(lowLoc == 1)
		{
			System.out.printf("The issue with the lowest total points is : \"%s\" with a total of %d points.\n", strArr[0], total[0]);
		}
		else if(lowLoc == 2)
		{
			System.out.printf("The issue with the lowest total points is : \"%s\" with a total of %d points.\n", strArr[1], total[1]);
		}
		else if(lowLoc == 3)
		{
			System.out.printf("The issue with the lowest total points is : \"%s\" with a total of %d points.\n", strArr[2], total[2]);
		}
		else if(lowLoc == 4)
		{
			System.out.printf("The issue with the lowest total points is : \"%s\" with a total of %d points.\n", strArr[3], total[3]);
		}
		else if(lowLoc == 5)
		{
			System.out.printf("The issue with the lowest total points is : \"%s\" with a total of %d points.\n", strArr[4], total[4]);
		}
		
		scnr.close();
	}

}
