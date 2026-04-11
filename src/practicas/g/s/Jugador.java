package practicas.g.s;

public class Jugador {
	    private String nombre;
	    private int puntajeActual;
	    private int puntajeMaximo;

	    public Jugador(String nombre) {
	        this.nombre = nombre;
	        this.puntajeActual = 0;
	        this.puntajeMaximo = 0;
	    }

	    public void actualizarPuntaje(int nuevoPuntaje) {
	        if (nuevoPuntaje >= 0) {
	            puntajeActual = nuevoPuntaje;

	            if (nuevoPuntaje > puntajeMaximo) {
	                puntajeMaximo = nuevoPuntaje;
	            }

	        } else {
	            System.out.println("Puntaje inválido");
	        }
	    }

	    public void mostrar() {
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Puntaje actual: " + puntajeActual);
	        System.out.println("Puntaje máximo: " + puntajeMaximo);
	    }
	}


