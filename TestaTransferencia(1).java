class TestaTransferencia {
    public static void main (String args[]) {        
        Conta origem = new Conta();
        Conta destino = new Conta();
        origem.deposita(1000);
        destino.deposita(500);
        origem.transferenciaPara(destino, 200);
        origem.mostra();
        destino.mostra();
    }    
}