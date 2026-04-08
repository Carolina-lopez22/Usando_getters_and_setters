package practicas.g.s;

public class Producto {
	private int codigo;
	private String nombre;
	private double precio;
	private int stock;
	
	public Producto(int codigo, String nombre, double precio, int stock) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		}
	public double aplicarDescuento(double porcentaje) {
		return precio= precio-(precio*porcentaje/100);
	}
	public void validaciones() {
		if(this.precio>=0 && this.stock>=0) {
			return;
		}
	}
	public void vender(int cantidad) {
		if(this.stock >= cantidad) {
		this.stock=(this.stock-cantidad);
		}else {
			System.out.println("No hay suficiente stock en la tienda");
		}
			
	}
	public String mostrar() {
		return "Producto: "+ this.codigo + " " + this.nombre+ " Precio: "+ this.precio +" Stock: "+this.stock;		
	}
}
