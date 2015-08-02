class StringRep{
	public static void main(String[] args){
		if(args.length != 1){
			System.out.println("Incorrect number of parameters (1expected)");
		} 
		int num = Integer.parseInt(args[0]);
		String[] singleDigitWords = {
									"",
									"one",
									"two",
									"three",	
									"four",
									"five",
									"six",
									"seven",
									"eight",
									"nine"};
		String[] tensPlaceWords = { "",
									"",
									"twenty",
									"thirty",
									"fourty",
									"fifty",
									"sixty",
									"seventy",
									"eighty",
									"ninety"};
									
		String[] onesAndTensTogetherWords = {
									"ten",
									"eleven",
									"twelve",
									"thirteen",
									"fourteen",
									"fifteen",
									"sixteen",
									"seventeen",
									"eighteen",
									"nineteen"};

		int ones = num%10;
		num /= 10;
		int tens = num%10;
		num /= 10;
		int hundreds = num%10;
		num /= 10;
		int thousands = num%10;
		if(thousands>0)
			System.out.print(singleDigitWords[thousands]+" thousand ");
		if(hundreds>0)
		System.out.print(singleDigitWords[hundreds]+" hundred ");
		if(tens == 1 && ones>1){
			if(thousands>0 || hundreds>0)
				System.out.print(" and ");
			System.out.print(onesAndTensTogetherWords[ones]+" ");
		}
		else{
			System.out.print(tensPlaceWords[tens]+" ");
			if(ones > 1){
				if(thousands>0 || hundreds>0 )
					System.out.print(" and ");
				System.out.print(singleDigitWords[ones]);
			}
		}
		System.out.print("\n");
	}

}
