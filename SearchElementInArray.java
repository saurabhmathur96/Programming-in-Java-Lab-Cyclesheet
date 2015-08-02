import java.util.Scanner;

public class SearchElementInArray
{	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Number of integers ? ");
		int sizeOfArray = scanner.nextInt();
		
		
		
		int array[] = new int[sizeOfArray];
		System.out.println("Note: Integers must be in ascending order.");
		for(int i=0; i<sizeOfArray; i++)
		{
			System.out.printf("array[%d] = ", i);
			array[i] = scanner.nextInt();
		}
		
		System.out.print("Integer to be searched ? ");
		int elementToBeSearched = scanner.nextInt();
		
		int positionByLinearSearch = linearSearchIntArray(array, elementToBeSearched);
		if(positionByLinearSearch == -1)
		{
			System.out.println("Not found.");
		}
		else
		{
			System.out.printf("Found at array[%d]\n", positionByLinearSearch);
		}
		
		int positionByBinarySearch = binarySearchIntArray(array, elementToBeSearched);
		if(positionByBinarySearch == -1)
		{
			System.out.println("Not found.");
		}
		else
		{
			System.out.printf("Found at array[%d]\n", positionByBinarySearch);
		}
	}
	
	private static int linearSearchIntArray(int array[], int elementToBeSearched)
	{
		for(int i=0; i<elementToBeSearched; i++)
		{
			if(array[i] == elementToBeSearched)
			{
				return i;
			}
		}
		return -1;
	}
	
	private static int binarySearchIntArray(int array[], int elementToBeSearched)
	{
		int lowerBound = 0;
		int upperBound = array.length - 1;
		while(lowerBound <= upperBound)
		{
			int middle = (lowerBound + upperBound)/2;
			 
			if(elementToBeSearched == array[middle])
			{
				return middle;
			}
			else if(elementToBeSearched > array[middle])
			{
				lowerBound = middle + 1;
			}
			else
			{
				upperBound = middle - 1;
			}
		}
		return -1;
	}
}
		
