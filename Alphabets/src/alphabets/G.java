package alphabets;

import java.util.*;
public class G 
{
	public static void main(String[] args) 
	{
		int i,j;
		System.out.println("Enter the number of rows");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (i=0; i < n; i++)
		{
			for (j=0; j < n; j++)
			{
				if ((i == 0 && (j > 0 && j <= 3*(n/4)) || i == n-1 && (j > 0 && j < n/2) || 
					j == 0 && (i > 0 && i < n-1) || (j == n/2 || j == 3*(n/4)) &&
					i > 3*(n/4)) || i == 3*(n/4) && (j >= n/2 && j <= 3*(n/4)))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
}