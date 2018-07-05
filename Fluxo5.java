class Fluxo5 {
	public static void main (String args []) {
		int n = 0;
		while(n<100) {
			n++;
			if(n% 2 ==1) continue;
			System.out.println(n);
			if(n>50) break;
			
		}
	}
}
