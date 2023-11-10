public class Vendedor extends Persona {
	private String idVendedor;

	public Vendedor (String nombre, String rut, String correoElectronico, String idVendedor){
		super(nombre, rut, correoElectronico);
		this.idVendedor = idVendedor;
	}
	public String getIdVendedor() {
		return this.idVendedor = idVendedor;
	}
	public void setIdVendedor(String idVendedor) {
		this.idVendedor = idVendedor;
	}



}