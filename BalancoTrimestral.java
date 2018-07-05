class BalancoTrimestral {
	
	public static void main (String args[]){
		int gastosJaneiro =15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;

		// soma dos gastos deo trimestre
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		System.out.println(gastosTrimestre);

		// media dos gastos do trimestre float
		float mediaMensal = gastosTrimestre / 3.0f;
		System.out.println("Valor da média mensal, com float: "+mediaMensal);

		// media dos gastos do trimestre double
		double mediaMensal2 = gastosTrimestre / 3.0;
		System.out.println("Valor da média mensal, com double: "+mediaMensal2);

		// media dos gastos do trimestre inteiro
		int mediaMensal3 = gastosTrimestre / 3;
		System.out.println("Valor da média mensal, com inteiro: "+mediaMensal3);
		
	}

}
