package co.com.bytebank.test;

public class TestMain {
	public static void main(String[] args) {
		
		int edad = 20;
		int edad2 = 15;
		int edad3 = 67;
		
		//Quieo agruparlas en una sola referencia
		// Indices		 0   1   2  3   4
		//             [ 0 | 0 |30| 0 | 0 ]
		int[] edades = new int[5];
		edades[2] = 30;
		System.out.println(edades[2]);
		System.out.println(edades[0]);
	}
}
