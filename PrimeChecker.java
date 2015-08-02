import java.util.Random;
class PrimeChecker{
	private static boolean isPrime(int n){
		boolean isprime = true;
		for(int i=2;i<=n/2;i++){
			if(n%i == 0){
				isprime = false;
				break;
			}
		}
		return isprime;
	}
	public static void main(String[] args){
		Random random = new Random();
		for(int i=0; i<10;i++){
			int n = random.nextInt(1000);
			System.out.print(n+" is ");
			if(! isPrime(n)){
				System.out.print("not ");
			}
			System.out.print("prime\n");
		}
	}
}
