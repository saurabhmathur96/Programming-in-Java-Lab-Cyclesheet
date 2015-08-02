class SubstringCounter{
	private static int count(String bigString, String smallString){
		int total = 0;
		for(int i=0; i< bigString.length() - smallString.length() + 1 ; i++)
		{
			String subString = bigString.substring(i, i+smallString.length());
			if(subString.equals(smallString))
			{
				total++;
			}
		}
		return total;
	}
	public static void main(String[] args){
		if(args.length != 2){
			System.out.println("Incorrect number of params");
		}
		else{
			System.out.println(count(args[0], args[1]));
		}
	}
}
