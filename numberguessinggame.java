import java.util.Scanner;
class game
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args) throws Exception
	{
		System.out.println("\t\t\tWelcome to the Guessing Game");
		System.out.print("\t\t\tPlease enter your Mobile Number: ");
		long a=sc.nextLong();
		System.out.println("Processing......");
		Thread.sleep(1000);
		System.out.println("Select the input");
		System.out.println("------------------\n1.Start\n2.exit");
		int b=sc.nextInt();
		System.out.println("Processing......");
		Thread.sleep(1000);
		switch (b)
		{
		case 1:{
				boolean f=false;
				int otp=(int) (Math.random()*100);
				boolean flag=true; 
				do
				{
				System.out.print("Enter the Number which you have guessed:");
				int c=sc.nextInt();
				System.out.println("Checking......");
				Thread.sleep(1000);
				if (c>otp)
				{
					do
						{
			
						System.out.println("\t\t\tThe Number you have guessed is\n\t\t\tmore than the actual number");
						f=false;
						} while (f);
				}
				else if (c<otp)
				{
					do
						{
						System.out.println("\t\t\tThe Number you have guessed is\n\t\t\tless than the actual number");
						f=false;
						} while (f);
				}
				else
				{
					do
						{
						System.out.println("Congratulations! You have guessed the right Number  :)");
						f=false;
						} while (f);
				System.out.println("Do you want to play the game again?");
				System.out.println("-------------------------------------\n1.Yes\n2.No");
				int z=sc.nextInt();
				System.out.println("Processing......");
				Thread.sleep(1000);
				switch (z)
				{
				case 1:{break;}
				case 2:{
				System.out.print("Thank you exititng.......");
				Thread.sleep(1000);
				flag=false;
				break;}
				default:{
				System.out.println("Invalid Input");
				break;}	
			
				}
				}
		}
		while (flag);
			break;
			}
		case 2:{ System.out.println("Exiting");
		Thread.sleep(1000);
			break; }
		default:{
			System.out.println("Invalid Input");
			break;}
		
		}
	}
}
