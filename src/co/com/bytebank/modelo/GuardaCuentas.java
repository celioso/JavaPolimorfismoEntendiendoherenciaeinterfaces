package co.com.bytebank.modelo;

public class GuardaCuentas {
	
	// Crear un objeto para guardar muchas cuentas
	// Permitirnos agregar cuentas con un metodo
	// GuardaCuentas.adiciona(cuenta);
	// obtener, remover, etc.
	
	Cuenta[] cuenta = new Cuenta[10]; 
	int indice = 0;
	
	//     [ x |  |  |  |...|  ]
	public void adicionar(Cuenta cc) {
		
		cuenta[indice] = cc;
		indice++;
	}
	
	public Cuenta obtener(int indice) {
		return cuenta[indice];
	}
}
