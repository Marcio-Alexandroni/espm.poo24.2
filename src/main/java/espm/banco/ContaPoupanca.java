package espm.banco;

public class ContaPoupanca extends Conta implements Rendimento {

    private double taxa = 0.005;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
        
    @Override
    public void sacar(double valor) {
        if (valor <= saldo){
            this.saldo -= valor;
        }
    }

    @Override
    public void aplicar() {
        this.saldo += saldo * getTaxa();
    }

    @Override
    public double getTaxa() {
        return taxa;
    }


}
