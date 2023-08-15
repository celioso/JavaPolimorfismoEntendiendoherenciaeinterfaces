package co.com.bytebank.test;

/*import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;*/
import java.util.*;

import co.com.bytebank.cliente.Cliente;
import co.com.bytebank.modelo.Cuenta;
import co.com.bytebank.modelo.CuentaCorriente;

public class TestArrayList {
	
	public static void main(String[] args) {
		
		// <> Forzando a que acepte solo un tipo de objeto
		//List<Cuenta> listaClientes = new LinkedList<>();
		
		// OPbligatorio especificar			No es obligatorio
		//List<Cuenta> lista = new Vector<Cuenta>();
		List<Cuenta> lista = new ArrayList<Cuenta>();
		
		// referencia  Objeto -> HEAP
		Cuenta cc = new CuentaCorriente(11, 22);
		Cuenta cc2 = new CuentaCorriente(13, 42);
		Cuenta cc3 = new CuentaCorriente(11, 22);
		
		// [cc, cc2]
		lista.add(cc);
		lista.add(cc2);
		
		/*Cliente Cliente = new Cliente();
		lista.add(Cliente);*/
		
		Cuenta obtenerCuenta = lista.get(0);
		System.out.println(obtenerCuenta);
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		// Por cada cuenta : lista
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
			
		}
		
		boolean contiene = lista.contains(cc3);
		// Por referencia
		if (contiene) {
			System.out.println("Si, es igual (equals)");
		}
	}
}
