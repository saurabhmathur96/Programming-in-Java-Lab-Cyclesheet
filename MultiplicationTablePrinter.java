class MultiplicationTablePrinter{
		public static void main(String[] args){
			if(args.length != 1){
				System.out.println("Incorrect number of parameters (1expected)");
			} 
			int n = Integer.parseInt(args[0]);
			System.out.print("(*)\t");
			
			for(int i=1; i<=n; i++){
				System.out.print(i+"\t");
			}
			System.out.print("\n");
			
			for(int i=1; i<=n; i++){
				System.out.print(i+"\t");
				for(int j=1;j<=n; j++){
					System.out.print(i*j+"\t");
				}
				System.out.print("\n");
			}
		}
}
