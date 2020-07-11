package Array;

import java.util.*;

public class staticArray{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the "+n+" value to store in array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The values stored in array are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		sc.close();
	}
}