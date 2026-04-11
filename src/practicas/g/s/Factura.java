package practicas.g.s;

public class Factura {
	    private String codigoFactura;
	    private String descripcion;
	    private int cantidad;
	    private double precioUnitario;

	    public Factura(String codigoFactura, String descripcion, int cantidad, double precioUnitario) {
	        this.codigoFactura = codigoFactura;
	        this.descripcion = descripcion;
	        setCantidad(cantidad);
	        setPrecioUnitario(precioUnitario);
	    }

	    public void setCantidad(int cantidad) {
	        if (cantidad > 0) {
	            this.cantidad = cantidad;
	        } else {
	            System.out.println("Cantidad inválida");
	        }
	    }

	    public void setPrecioUnitario(double precioUnitario) {
	        if (precioUnitario > 0) {
	            this.precioUnitario = precioUnitario;
	        } else {
	            System.out.println("Precio inválido");
	        }
	    }

	    public double calcularTotal() {
	        return cantidad * precioUnitario;
	    }

	    public void mostrarFactura() {
	        System.out.println("Código: " + codigoFactura);
	        System.out.println("Descripción: " + descripcion);
	        System.out.println("Cantidad: " + cantidad);
	        System.out.println("Precio Unitario: " + precioUnitario);
	        System.out.println("Total: " + calcularTotal());
	    }
	}

