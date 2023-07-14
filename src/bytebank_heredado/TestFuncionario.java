package bytebank_heredado;

public class TestFuncionario {
	
	public static void main(String[] args) {
		Funcionario diego = new Contador();
		diego.setDocumento("Diego");
		diego.setDocumento("487954231");
		diego.setSalario(2000);
		diego.setTipo(0);
		
		
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
		//System.out.println(diego.getSalario()+ diego.getBonificacion());
	}
}
