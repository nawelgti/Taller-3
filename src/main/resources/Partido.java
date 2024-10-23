public class Partido {
	private String fecha;
	private String hora;
	private Cancha cancha;
	private Equipo teamLocal;
	private Equipo teamVisita;
	private String resultado;

	public Partido(String fecha, String hora, Cancha cancha, Equipo teamLocal, Equipo teamVisita, String resultado) {
		this.fecha = fecha;
		this.hora = hora;
		this.cancha = cancha;
		this.teamLocal = teamLocal;
		this.teamVisita = teamVisita;
		this.resultado = resultado;
	}

	public void registrarPartido(Registro registro) {
		Registro.listaPartidos.add(this);
	}
}