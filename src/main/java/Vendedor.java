public class Vendedor extends Persona {
	private String ID;

	public Vendedor (String nombre, String rut, String direccion, String idVendedor){
		super(nombre, rut, direccion);
		this.ID = idVendedor;
	}
	public String getID() {
		return this.ID = ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Rut: " + rut + ", Direccion: " + direccion + ", ID: " + ID;
	}
	public void cambiarDireccion(String nuevaDireccion) {
		this.direccion = nuevaDireccion;
	}

}