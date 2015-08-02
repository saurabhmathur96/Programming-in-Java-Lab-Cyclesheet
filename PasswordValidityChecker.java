public class PasswordValidityChecker
{
	private static int countNumberOfDigits(String string)
	{
		int nDigits = 0;
		for(int i=0;i<string.length();i++)
		{
			if(Character.isDigit(string.charAt(i)))
			{
				nDigits++;
			}
		}
		return nDigits;
	}
	
	public static boolean isPasswordValid(String password)
	{
		if(password.length() < 8)
		{
			return false;
		}
		if(!password.matches("[A-Za-z0-9]+"))
		{
			return false;
		}
		if(countNumberOfDigits(password) < 2)
		{
			return false;
		}
		
		return true;
		
	}
	
	public static void main(String[] args)
	{
		if(args.length != 1)
		{
			System.out.println("incorrect number of parameters");
		}
		
		String password = args[0];
		
		if(isPasswordValid(password))
		{
			System.out.println("Valid");
		}
		
		else
		{
			System.out.println("Invalid");
		}
		
	}
}
