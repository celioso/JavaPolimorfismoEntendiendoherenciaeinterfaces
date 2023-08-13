package co.com.bytebank.modelo;

public class CuentaAhorros extends Cuenta {
	
	private double saldo;
	
	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
