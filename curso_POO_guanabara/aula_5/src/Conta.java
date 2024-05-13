public class Conta   {
    public Long numConta;
    private  Cliente cliente;
    private float saldo;
    private String statusConta;
    private boolean status;

    protected TipoConta tipoConta;
    private float setSaldo;

    public void abrirConta(TipoConta tipoConta){
        Conta conta = new Conta();
        if (tipoConta == TipoConta.CORRENTE){
            conta.setSaldo(50f);
        }
        conta.setSaldo(150f);

    }

    public void fecharConta(float saldo, Conta conta){
        if (saldo == 0){
            conta = null;
        } else if (saldo < 0) {
            System.out.println("A contam esta em debito!");
        }else {
            System.out.println("Ainda a saldo na conta!");
        }
    }

    public void depositar(float valorDeposito){
        if (!status){
            System.out.println("Conta não encontrada ou inexistente!");
        }
        this.setSaldo = saldo + valorDeposito;
    }

    public void pagarMensal(){
        this.setSaldo(-50f);
    }


    public void sacar(float valorSaque){
        if(!status) {
            System.out.println("Conta não encontrada ou não existente");
        }
        this.setSaldo = saldo + valorSaque;

    }


    public void mostrarSaldo(){
        System.out.println("Saldo disponivel é:" + this.saldo);
    }


    public Conta() {
    }

    public Conta(Long numConta, Cliente cliente, float saldo, String statusConta, boolean status, TipoConta tipoConta) {
        this.numConta = numConta;
        this.cliente = cliente;
        this.saldo = saldo;
        this.statusConta = statusConta;
        this.status = status;
        this.tipoConta = tipoConta;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Long getNumConta() {
        return numConta;
    }

    public void setNumConta(Long numConta) {
        this.numConta = numConta;
    }



    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(String statusConta) {
        this.statusConta = statusConta;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }
}
