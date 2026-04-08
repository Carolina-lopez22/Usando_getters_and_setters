package practicas.g.s;

public class CuentaBancaria {
	private String titular;
	private double saldo;
	private int pin;
	
	public CuentaBancaria(String titular, int saldo, int pin) {
		this.titular = titular;
		this.saldo = saldo;
		this.pin = pin;
	}
	public double depositar(double monto) {
		if (monto < 0) {
			System.out.println("No se permite saldo negativo");			
}	else {
	return saldo=saldo+monto;
}
		return monto;
}	
	public void retirar(double monto, int pinIngresado) {
			if (pinIngresado!=this.pin) {
				System.out.print("El pin ingresado no es valido ");
				return;
			}
			if (monto < 0) {
				System.out.println("No se permite monto negativo");	
				return;
			}
		  this.saldo-=monto; 	
	}
	public double getSaldo() {
		return saldo;
	}
	public String mostrar() {
		return "Titular: " + titular +" "+"Saldo: "+ saldo;
	}

}
