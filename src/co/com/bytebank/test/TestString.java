package co.com.bytebank.test;

import java.lang.String;

public class TestString {
	public static void main(String[] args) {
		String nombre = "Alura";
		// No utilizada en el mundo real
		//String nombre2 = new String("Alura");
		
		System.out.println("Antes de replace: " + nombre);
		nombre = nombre.replace("A", "a");
		nombre = nombre.concat(" curso online");
		System.out.println("Despues de replace: " + nombre);
	}
}
