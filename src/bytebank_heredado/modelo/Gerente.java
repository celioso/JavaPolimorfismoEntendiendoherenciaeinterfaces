package bytebank_heredado.modelo;

public class Gerente extends Funcionario implements  Autenticable {
	
	// Sobreescritura de metodo
	public double getBonificacion() {
		System.out.println("EJECUTANDO DESDE GERENTE");
		//return super.getSalario()+ (this.getSalario()*0.05);
		return 2000;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
}
