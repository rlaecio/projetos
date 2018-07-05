class TestaConta {
    public static void main (String args []) {
        Conta c = new Conta();
        c.numero = 10;
        c.titular = "Jose";
        c.saldo = 50000;
        c.limite = 10000;
        
        c.mostra();
        c.sacar(75000);
        c.mostra();
    }
}