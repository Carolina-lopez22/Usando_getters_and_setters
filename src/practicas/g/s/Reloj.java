package practicas.g.s;

public class Reloj {
	private int hora;
	private int minuto;
	private int segundo;
	
	public Reloj(int hora, int minuto, int segundo) {
		setHora(hora);
		setMinuto(minuto);
		setSegundo(segundo);
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if(hora>0 && hora<24)
		this.hora = hora;
		else 
			System.out.println("La hora es invalida ");
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if(minuto>0 && minuto<60)
		this.minuto = minuto;
		else 
			System.out.println("Los minutos son invalidos ");
	}

	public int getSegundo() {
		return segundo;
		
	}

	public void setSegundo(int segundo) {
		if(segundo>0 && segundo<60)
		this.segundo = segundo;
		else 
			System.out.println("Los segundos son invalidos ");
	}
	public String mostrarHora() {
		return "La hora es: " + hora+":"+minuto+":"+segundo;
	}
	}
	
