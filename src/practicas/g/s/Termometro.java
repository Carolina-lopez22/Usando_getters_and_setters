package practicas.g.s;

public class Termometro {
private double celsius;

public Termometro(double celsius) {
	setCelsius(celsius);
}

public void setCelsius(double temperatura) {
	if (temperatura >= -273.15)
		this.celsius = temperatura;
	else 
		System.out.println("Menor al cero absoluto");
}
public double getFahrenheit() {
	return (celsius*9/5)+32;
}
}
