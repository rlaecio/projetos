public class Fibonacci {
	public static void main (String args[]) {
		for(int a=0, b=1, i=0; i<15; b+=a, a=b-a, i++) {
			System.out.print(a + " ");
		}  
		System.exit(0);
	}
}
