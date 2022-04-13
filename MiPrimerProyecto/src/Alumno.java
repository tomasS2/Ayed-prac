
public class Alumno {

	private int nroLegajo;
	private String nombre;
	private String apellido;
	private  String email;
	
	public int getLegajo() {
		return nroLegajo;
	}
	public void setLegajo(int legajo) {
		this.nroLegajo = legajo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Alumno [legajo=" + nroLegajo + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + "]";
	}
	
	
	
}

