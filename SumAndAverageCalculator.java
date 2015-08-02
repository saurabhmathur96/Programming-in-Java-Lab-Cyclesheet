class SumAndAverageCalculator{
	public static void main(String[] args){
		if(args.length < 1){
			System.out.println("Incorrect number of params");
		}
		else{
			int sum = 0;
			for(int i=0;i<args.length; i++){
				sum += Integer.parseInt(args[i]);
			}
			System.out.println("Sum: "+sum);
			System.out.println("Average: "+ (double)sum /args.length);
		}
	}
}