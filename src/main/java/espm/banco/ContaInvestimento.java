package espm.banco;

/*
 *  Regra de Negócio: A conta investimento só pode sacar depois de 3 depósitos
 */

public class ContaInvestimento extends Conta implements Rendimento {

    private int qtDepositos = 0;
    private double taxa = 0.02;

    public ContaInvestimento(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void depositar(double valor){
        super.depositar(valor);
        this.qtDepositos += 1;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo && (qtDepositos % 3) == 0){
            this.saldo -= valor;
        }
    }

    public int getQtDepositos() {
        return qtDepositos;
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
