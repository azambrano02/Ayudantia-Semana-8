public class Cliente extends Persona {
	private String idCliente;

	public Cliente(String nombre, String rut, String correoElectronico, String idCliente) {
		super(nombre, rut, correoElectronico);
		this.idCliente = idCliente;
	}

	public String getIdCliente() {
		return this.idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Rut: " + rut + ", Correo Electronico: " + correoElectronico + ", ID Cliente: " + idCliente;
	}
	public void actualizarCorreoElectronico(String nuevoCorreoElectronico) {
		this.correoElectronico = nuevoCorreoElectronico;
	}
}