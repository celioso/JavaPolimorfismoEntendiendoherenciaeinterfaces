package bytebank_heredado.modelo;

public class SaldoInsuficienteException extends Exception {
	
	public SaldoInsuficienteException(String mensaje) {
		super(mensaje);
	}
}
