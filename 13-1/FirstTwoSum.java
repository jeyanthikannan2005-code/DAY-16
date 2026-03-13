import java.util.Scanner;
class FirstTwoSum
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
		int sum=ar[0]+ar[1];
		System.out.println("The sum of first two Elements is "+sum);
	}
}