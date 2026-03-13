
import java.util.Scanner;
class StorePrint
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of an Array :");
		int size=sc.nextInt();
		int ar[]=new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int j=0;j<ar.length;j++)
		{
			System.out.print(ar[j]+" ");
		}	
	}
}