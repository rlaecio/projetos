package br.com.caelum.banco.util;

public class TestaThread {
	public static void main(String[] args) {
		Processo p1 = new Processo(1);
		Processo p2 = new Processo(2);
		Processo p3 = new Processo(3);
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(p3);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
