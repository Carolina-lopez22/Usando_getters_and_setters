package practicas.g.s;

public class Main {

	public static void main(String[] args) {
		ejercicio1();
		ejercicio2();
		ejercicio3();
	}
public static void ejercicio1() {
	Persona per1 = new Persona("Carla","Campos", 0);
	Persona per2 = new Persona("Carla","Campos", 0);
	
	per1.setEdad(22);
	per2.setEdad(-12);
	System.out.println(per1.mostrar());
	System.out.println(per2.mostrar());
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
}
public static void ejercicio3() {
	CuentaBancaria cuenta = new CuentaBancaria("Carolina.Lopez",1000,305);
	
	cuenta.depositar(200);
	cuenta.retirar(300, 305);
	cuenta.retirar(400, 204);
	
	System.out.println(cuenta.mostrar());
}
}