public class Cliente extends Persona {
	private String edad;

	public Cliente(String nombre, String rut, String direccion, String edad) {
		super(nombre, rut, direccion);
		this.edad = edad;
	}

	public String getEdad() {
		return this.edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Rut: " + rut + ", Direccion: " + direccion + ", Edad: " + edad;
	}
	public void cambiarDireccion(String nuevaDireccion) {
		this.direccion = nuevaDireccion;
	}
}