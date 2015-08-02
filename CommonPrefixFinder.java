
public class CommonPrefixFinder
{
	public static String prefix(String s1, String s2)
	{
		String commonPrefix = "";
		for(int i=0; s1.charAt(i) == s2.charAt(i); i++)
		{
			commonPrefix += s1.charAt(i);
		}
		return commonPrefix;
	}
	public static void main(String[] args)
	{
		if(args.length != 2)
		{
			System.out.println("incorrect number of parameters");
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println(prefix(args[0], args[1]));
	}
}
