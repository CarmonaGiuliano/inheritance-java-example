
class Main {

    public static void main(String[] args) {


       contaEspecial contaEsp = new contaEspecial();
       contaPoupança contaPoup = new contaPoupança();

       contaEsp.setLimite(1000);
       contaEsp.setSaldo(1000);
       contaEsp.sacar(2500);
       System.out.println(contaEsp.getSaldo());
       System.out.println(contaEsp.getLimite());
        }
    }

