import java.util.ArrayList;

public class Equipo {
	private String nombre;
	private String deporte;
	private ArrayList<Jugador> jugadores;
	private Entrenador entrenador;

	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public String getDeporte() {return deporte;}
	public void setDeporte(String deporte) {this.deporte = deporte;}
	public ArrayList<Jugador> getJugadores() {return jugadores;}
	public void setJugadores(ArrayList<Jugador> jugadores) {this.jugadores = jugadores;}
	public Entrenador getEntrenador() {return entrenador;}
	public void setEntrenador(Entrenador entrenador) {this.entrenador = entrenador;}

	public Equipo(String nombre, String deporte, ArrayList<Jugador> jugadores, Entrenador entrenador) {
		this.nombre = nombre;
		this.deporte = deporte;
		this.jugadores = jugadores;
		this.entrenador = entrenador;
	}

	public void añadirJugador(Jugador jugador) {
		if getJugadores().contains(jugador) {
			System.out.println("Este jugador ya está en el equipo");
		}
		else{
			getJugadores().add(jugador);
		}
	}

	public void definirEntrenador(Entrenador entrenador) {
		setEntrenador(entrenador);
	}
}