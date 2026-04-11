package practicas.g.s;

public class Main {

	public static void main(String[] args) {
		ejercicio1();
		ejercicio2();
		ejercicio3();
		ejercicio4();
		ejercicio5();
		ejercicio6();
		ejercicio7();
		ejercicio8();
		ejercicio9();
		ejercicio10();
	}
public static void ejercicio1() {
	Persona per1 = new Persona("Carla","Campos", 0);
	Persona per2 = new Persona("Carla","Campos", 0);
	
	per1.setEdad(22);
	per2.setEdad(-12);
	System.out.println(per1.mostrar());
	System.out.println(per2.mostrar());
	System.out.println("____________________________________________________________");
}
public static void ejercicio2() {
	Producto pro1 = new Producto(01,"Refrigerador", 4500, 10);
	Producto pro2 = new Producto(02,"Televisor", 4000, 15);
	
	pro1.aplicarDescuento(20);
	pro2.aplicarDescuento(5);
	pro1.validaciones();
	pro2.validaciones();
	pro1.vender(5);
	pro2.vender(20);
	
	System.out.println(pro1.mostrar());
	System.out.println(pro2.mostrar());
	System.out.println("____________________________________________________________");
}
public static void ejercicio3() {
	CuentaBancaria cuenta = new CuentaBancaria("Carolina.Lopez",1000,305);
	
	cuenta.depositar(200);
	cuenta.retirar(300, 305);
	cuenta.retirar(400, 204);
	
	System.out.println(cuenta.mostrar());
	System.out.println("____________________________________________________________");
}
public static void ejercicio4() {
	Curso cur1 = new Curso("Matematicas", 80,93,55);
	Curso cur2 = new Curso("Ingles", 111,125,135);
	cur1.promedio();
	cur2.promedio();
	cur1.estado();
	cur2.estado();
	
	System.out.println(cur1.mostrar());
	System.out.println(cur2.mostrar());
	System.out.println("____________________________________________________________");
}
public static void ejercicio5() {
	Estudiante estu1 = new Estudiante(25083,"Merlyn",93);
	Estudiante estu2 = new Estudiante(25058,"Alex",103);

	estu1.esBecado();
	estu2.esBecado();
	
	System.out.println(estu1.mostrar());
	System.out.println(estu2.mostrar());
	System.out.println("____________________________________________________________");
}
public static void ejercicio6() {
	Termometro temp = new Termometro(0);
	Termometro temp2 = new Termometro(0);
	temp.setCelsius(20);
	temp2.setCelsius(-300);
	System.out.println("Conversión a Fahrenheit: "+ temp.getFahrenheit());
	System.out.println("Conversión a Fahrenheit: "+ temp2.getFahrenheit());
	System.out.println("____________________________________________________________");
}
public static void ejercicio7() {
	Reloj hora1 = new Reloj(5,25,36);
	Reloj hora2 = new Reloj(51,85,66);
	
	System.out.println(hora1.mostrarHora());
	System.out.println(hora2.mostrarHora());
	System.out.println("____________________________________________________________");
}
public static void ejercicio8() {
	Contacto contac1 = new Contacto("Ana","25814585", "ana12@mail");
	Contacto contac2 = new Contacto("Diana","23648", "diana8mail");
	
	contac1.mostrarContacto();
	contac2.mostrarContacto();
	System.out.println("____________________________________________________________");
}
public static void ejercicio9() {
	Jugador jugador = new Jugador("Angel");

	jugador.actualizarPuntaje(60);
	jugador.actualizarPuntaje(90);
	jugador.actualizarPuntaje(20);

	jugador.mostrar();
	System.out.println("____________________________________________________________");
}
	public static void ejercicio10() {
		Factura fac = new Factura("A10", "Bocina", 3, 3550.00);
		fac.mostrarFactura();
		System.out.println("____________________________________________________________");
}
}










