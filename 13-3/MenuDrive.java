import java.util.Scanner;
class MenuDrive
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int opt;
		System.out.print("Enter The size of an Array: ");
		int size=sc.nextInt();
		int ar[]=new int[size];
		int even=0;
		int odd=0;
		System.out.println("THE OPTIONS ARE :");
		System.out.println("1.Insert elements");
		System.out.println("2.Display elements");
		System.out.println("3.Count Even numbers");
		System.out.println("4.Count Odd numbers");
		System.out.println("5.Exit");
		do
		{
			System.out.print("Enter your Option :");
			opt=sc.nextInt();
			switch(opt)
			{
				case 1:
				{
					System.out.println("1.ENTER TO INSERT ELEMENTS IN AN ARRAY");
					for(int i=0;i<ar.length;i++)
					{
						ar[i]=sc.nextInt();
					}
					break;
				}
				case 2:
				{
					System.out.println("2.TO DISPLAY ELEMENTS IN AN ARRAY");
					for(int i=0;i<ar.length;i++)
					{
						System.out.println(ar[i]);
					}
					break;
				}
				case 3:
				{
					for(int i=0;i<ar.length;i++)
					{
						if(ar[i]%2==0)
						{
							even++;
						}
					}
					System.out.println("The count are even numbers are "+even);
					break;
				}
				case 4:
				{
					for(int i=0;i<ar.length;i++)
					{
						if(ar[i]%2!=0)
						{
							odd++;
						}
					}
					System.out.println("The count are odd numbers are "+odd);
					break;
				}
				case 5:
				{
					System.out.println("END OF THE EXECUTION: EXIT ");
					break;
				}
			}
		}while(opt<5);
	}
}