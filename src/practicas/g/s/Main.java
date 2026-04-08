package practicas.g.s;

public class Main {

	public static void main(String[] args) {
		ejercicio1();

	}
public static void ejercicio1() {
	Persona per1 = new Persona("Carla","Campos", 0);
	Persona per2 = new Persona("Carla","Campos", 0);
	
	per1.setEdad(22);
	per2.setEdad(-12);
	System.out.println(per1.mostrar());
	System.out.println(per2.mostrar());
}
}
