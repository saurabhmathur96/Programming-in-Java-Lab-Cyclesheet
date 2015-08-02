class LoongNumber{
	public static void main(String[] args){
			if(args.length != 1){
				System.out.println("Incorrect number of parameters (1expected)");
			}
			long number = Long.parseLong(args[0]);
			
			String output = "";
			
			while(number > 0)
			{
				output = (number%10) + "\t"  +  output  ;
				number = number / 10;
			}
			System.out.println(output);
	}
}
