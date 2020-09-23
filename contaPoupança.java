public class contaPoupança extends ContaBancaria{

    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public void novoSaldo(int dia){
        if(dia == this.diaRendimento){
            double novoSaldo = getSaldo()*1.05;
            setSaldo(novoSaldo);
        }
    }

}
