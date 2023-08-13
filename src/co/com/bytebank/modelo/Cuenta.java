package co.com.bytebank.modelo;

/**
 * account will create new instances of CuentaCorriente
 * @version 1.0
 * @author Celis
 * 
 */

import co.com.bytebank.cliente.Cliente;

//entidad cuenta:

public abstract class Cuenta {
	
	// public   Accesible desde cualquier parte
	// --default  Accesible dentro del paquete
	// --protected  default + hijas
	// ---private  solo desde la clases misma
	
	protected double saldo;
	private int agencia = 1;
	private int numero;
	private Cliente titular = new Cliente();
	
	private static int total;
	
	/**
	 * Instance an new account without parameters
	 */
	
	public Cuenta() {
		
	}
	/**
	 * Instance an  account wearing agencia and numero
	 * @param agencia
	 * @param numero
	 */
	public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.agencia = numero;
		System.out.println("Estoy en la cuenta " + this.numero);
		
		Cuenta.total ++;	
	}
	
	public abstract void depositar(double valor);
	/**
	 * this method withdraws money from the account 
	 * and if an error occurs returns an exception
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	
	//Retorna valor
	public void retirar(double valor) throws SaldoInsuficienteException{
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("No tiene saldo");
		}
		this.saldo -= valor;
		
	}
	
	public boolean transferir(double valor, 
							Cuenta destino){
		if (this.saldo >= valor){
			try {
				this.retirar(valor);
			}
			catch (SaldoInsuficienteException e) {
				e.printStackTrace();
			}
			destino.depositar(valor);
			return true;	
		}
		else {
			return false;
		}
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	
	public int getAgencia(){
		return agencia;
	}
	
	 public void setAgencia(int agencia) {
	        if (agencia > 0) {
	            this.agencia = agencia;
	        }
	    }
	
	public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }
	
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Cuenta.total;
	}
	
}