package practicas.g.s;

public class Estudiante {
	private int carnet;
	private String nombre;
	private double promedio;
	
	public Estudiante(int carnet, String nombre, double promedio) {
		this.carnet = carnet;
		this.nombre = nombre;
		setPromedio(promedio);
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		if (promedio>=0 && promedio<=100)
		this.promedio = promedio;
		else 
			System.out.println("Promedio Invalido ");
	}
	public boolean esBecado() {
		return promedio >= 85;	
	}

	public String mostrar() {
		return " Carnet: "+carnet+ " Nombre: "+nombre+" Promedio: "+ esBecado();
}
}