
import java.util.Arrays;

public class StringSorter
{
	public static String sortString(String string)
	{
		char[] stringAsCharArray = string.toCharArray();
		Arrays.sort(stringAsCharArray);
		return new String(stringAsCharArray);
	}
	
	public static void main(String[] args)
	{
		if(args.length != 1)
		{
			System.out.println("Incorrect number of params");
		}
		
		System.out.println(sortString(args[0]));
		
	}

}

