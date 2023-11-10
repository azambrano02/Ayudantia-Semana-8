public class Persona {
	protected String nombre;
	protected String rut;
	protected String correoElectronico;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public Persona(String nombre, String rut, String correoElectronico) {
		this.nombre = nombre;
		this.rut = rut;
		this.correoElectronico = correoElectronico;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Rut: " + rut + ", Correo Electronico: " + correoElectronico;

	}
	public void actualizarCorreoElectronico(String nuevoCorreoElectronico) {
		this.correoElectronico = nuevoCorreoElectronico;
	}
}