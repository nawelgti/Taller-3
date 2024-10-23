import java.util.ArrayList;

public class Registro {
	private ArrayList<Jugador> listaJugadores;
	private ArrayList<Entrenador> listaEntrenadores;
	private ArrayList<Partido> listaPartidos;

	public ArrayList<Jugador> getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

	public ArrayList<Entrenador> getListaEntrenadores() {
		return listaEntrenadores;
	}

	public void setListaEntrenadores(ArrayList<Entrenador> listaEntrenadores) {
		this.listaEntrenadores = listaEntrenadores;
	}

	public ArrayList<Partido> getListaPartidos() {
		return listaPartidos;
	}

	public void setListaPartidos(ArrayList<Partido> listaPartidos) {
		this.listaPartidos = listaPartidos;
	}

	public Registro(ArrayList<Jugador> listaJugadores, ArrayList<Entrenador> listaEntrenadores, ArrayList<Partido> listaPartidos) {
		this.listaJugadores = listaJugadores;
		this.listaEntrenadores = listaEntrenadores;
		this.listaPartidos = listaPartidos;
	}

	public void añadirJugador(Jugador jugador) {
		if getListaJugadores().contains(jugador) {
			System.out.println("Este jugador ya está registrado");
		}
		else{
			getListaJugadores().add(jugador);
		}
	}
	}

	public void añadirEntrenador(Entrenador entrenador) {
		if getListaEntrenadores().contains(entrenador) {
			System.out.println("Este entrenador ya está registrado");
		}
		else{
			getListaEntrenadores().add(entrenador);
		}
	}
}