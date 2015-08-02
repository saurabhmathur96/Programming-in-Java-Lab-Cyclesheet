class NumberOfDays{
	public static void main(String[] args){
		if(args.length < 1){
			System.out.println("Incorrect number of params");
		}
		else{
			switch(args[0].toLowerCase()){
				case "january":
				case "march":
				case "may":
				case "july":
				case "august":
				case "october":
				case "december":
					System.out.println("31");
					break;
				case "february":
					System.out.println("28");
					break;
				default:
					System.out.println("30");
					break;
			}
		}
	}
}