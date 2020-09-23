public class contaEspecial extends ContaBancaria{

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void sacar(double saque){
        if(getSaldo() >= saque){
            setSaldo(getSaldo() - saque);
        }
        else if(getSaldo() < saque && getLimite() > (saque - getSaldo())){
            System.out.println("Você esta usando o cheque especial para realizar esta operação");
            double saqueLimite = saque - getSaldo();
            //retiro antes o dinheiro do saldo normal até que ele seja zero
            setSaldo(0);
            setLimite(getLimite() - saqueLimite);
        }
        else{
            throw new Error("Você não possui saldo e nem cheque especial para realizar esta operação");
        }
    }
}
