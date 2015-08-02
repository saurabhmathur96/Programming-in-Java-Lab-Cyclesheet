class FibonacciSeriesGenerator{
	static long getFibonacci(long n){
		if(n == 0){
			return 0; 
		}
		else if(n == 1){
			return 1;
		}
		else{
			return getFibonacci(n-1) + getFibonacci(n-2);
		}
	}
	public static void main(String[] args){
		 long n = Long.parseLong(args[0]);
		 for(int i=0; i<n;i++){
			 System.out.print(getFibonacci(i)+" ");
		 }
		 System.out.print("\n");
	}
}
