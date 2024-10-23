public class Entrenador {
	private String nombre;
	private String experiencia;
	private String deporte;

	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public String getExperiencia() {return experiencia;}
	public void setExperiencia(String experiencia) {this.experiencia = experiencia;}
	public String getDeporte() {return deporte;}
	public void setDeporte(String deporte) {this.deporte = deporte;}

	public Entrenador(String nombre, String experiencia, String deporte) {
		this.nombre = nombre;
		this.experiencia = experiencia;
		this.deporte = deporte;
	}
}