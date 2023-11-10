public class Persona {
	protected String nombre;
	protected String rut;
	protected String direccion;

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

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Persona(String nombre, String rut, String direccion) {
		this.nombre = nombre;
		this.rut = rut;
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Rut: " + rut + ", Direccion: " + direccion;
	}
	public void cambiarDireccion(String nuevaDireccion) {
		this.direccion = nuevaDireccion;
	}
}