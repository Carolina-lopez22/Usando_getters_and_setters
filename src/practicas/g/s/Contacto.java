package practicas.g.s;

public class Contacto {
	private String nombre;
	private String telefono;
	private String email;
	
	public Contacto(String nombre, String telefono, String email) {
		this.nombre = nombre;
		setTelefono(telefono);
		setEmail(email);
	}
	
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		if(telefono.matches("\\d{8}"))
		this.telefono = telefono;
		else
			System.out.println(" Ingrese 8 digitos ");
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(email.contains("@"))
		this.email = email;
		else
			System.out.println("El correo debe contener @");
	}
		
	public void mostrarContacto() {
		System.out.println("Nombre: "+nombre+" Telefono: "+telefono+" Email: "+email);
	}
	

}
