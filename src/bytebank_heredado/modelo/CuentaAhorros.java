package bytebank_heredado.modelo;

public class CuentaAhorros extends Cuenta {
	
	private double saldo;
	
	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
		
	}
	
}
