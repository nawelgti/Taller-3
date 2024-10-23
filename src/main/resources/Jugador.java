public class Jugador {
	private String nombre;
	private String contacto;
	private String deporte;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	public Jugador(String nombre, String contacto, String deporte) {
		this.nombre = nombre;
		this.contacto = contacto;
		this.deporte = deporte;
	}
}