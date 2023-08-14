package co.com.bytebank.modelo;

public class GuardaReferencias {
	
	// Crear un objeto para guardar muchas cuentas
	// Permitirnos agregar cuentas con un metodo
	// GuardaCuentas.adiciona(cuenta);
	// obtener, remover, etc.
	
	Object[] referencia = new Object[10];
	int indice = 0;
	
	//         [ x | x | x | x |...|   ]
	
	public void adicionar(Object cc) {
		referencia[indice] = cc;
		indice++;
	}
	
	public Object obtener(int indice) {
		return referencia[indice];
	}
}
