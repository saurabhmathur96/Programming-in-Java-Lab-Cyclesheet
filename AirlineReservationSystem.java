import java.util.Scanner;

class AirlineReservationSystem
{
	private static final CAPACITY = 10;
	private static final ECONOMY_START = 5;
	private static final ECONOMY_START = 5;
	public static void main(String[] args)
	{
		boolean[] isSeatAvailable = new seats[CAPACITY];
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		do
		{
			System.out.print("Type 1 for First Class and 2 for Economy: ");
			choice = scanner.nextInt();
		}while(choice != 1 || choice != 2);
		
		switch(choice)
		{
			case 1:
				System.out.printf("Seat Number [%d, %d]: ", ECONOMY_START, ECONOMY_START + );
				break;
		}
		
}
