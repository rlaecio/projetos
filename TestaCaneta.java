class TestaCaneta {
	public static void main(String args[])	{
		Caneta c = new Caneta();
		c.cor = "Azul";
		c.tampa = true;
		c.volume = 100.0;
		c.bitola = 0.7;
		c.marca	= "PILOT";
		System.out.println(c.marca +" - " + c.volume);
		c.escrever(20);	
		double sobrou = c.escrever(42);
		System.out.println("Sobrou " + sobrou);	
	}
}

