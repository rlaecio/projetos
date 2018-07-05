package br.com.caelum.banco.util;

public class Processo implements Runnable {
	private int id;
	public Processo(int id) {
		this.id = id;
	}
	
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("id : " + id + " iteração : " + i);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}
		
	

}
