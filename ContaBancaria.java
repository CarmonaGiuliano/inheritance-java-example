public abstract class ContaBancaria {

 private String nomeCliente;
 private double numConta;
 private double saldo;

 public void sacar(double saque){
     if(getSaldo() >= saque){
          setSaldo(getSaldo() - saque);
     }
     else{
         throw new Error("Você não possui saldo para este saque");
     }
 }

 public void depositar(double deposito){
     setSaldo(getSaldo() + deposito);
 }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getNumConta() {
        return numConta;
    }

    public void setNumConta(double numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
