class Caneta {
	String cor;
	boolean tampa;
	double volume;
	double bitola;
	String marca;

	double escrever(int letras) {
		System.out.println("Estou escrevendo!!");
		volume -= letras * 0.1;	
		return volume;
	}
}
