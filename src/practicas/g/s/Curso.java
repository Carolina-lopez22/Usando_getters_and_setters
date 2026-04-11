package practicas.g.s;

public class Curso {
	private String nombreCurso;
	private int nota1;
	private int nota2;
	private int nota3;
	
	public Curso(String nombreCurso, int nota1, int nota2, int nota3) {
		this.nombreCurso = nombreCurso;
		setNota1(nota1); 
		setNota2(nota2); 
		setNota3(nota3); 
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public int getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {
		if (nota1>=0 && nota1<=100)
		this.nota1 = nota1;
		else
			System.out.print("Nota1 invalida ");
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		if (nota2>=0 && nota2<=100) 
		this.nota2 = nota2;
		else
			System.out.print("Nota2 invalida ");
	}

	public int getNota3() {
		return nota3;
	}

	public void setNota3(int nota3) {
		if (nota3>=0 && nota3<=100) 
		this.nota3 = nota3;
		else
			System.out.println("Nota3 invalida ");
	}

	public double promedio() {
		return (nota1+nota2+nota3)/3;
	}
	public  String estado() {
		if (promedio()>=61)
			return "Aprobado";
		else 
			return "Reprobado";	
	}

	public String mostrar() {
		return " Curso: "+nombreCurso+ " Promedio: "+promedio()+" "+ estado();
	}
}


	

