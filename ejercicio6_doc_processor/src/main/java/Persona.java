
public class Persona {
	String personaId;
	String nombre;
	String apellido;
	String valor;
	public Persona(String personaId, String nombre, String apellido, String valor) {
		this.personaId = personaId;
		this.nombre = nombre;
		this.apellido = apellido;
		this.valor = valor;
	}
	
	public String getPersonaId() {
		return personaId;
	}
	public void setPersonaId(String personaId) {
		this.personaId = personaId;
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
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Persona [personaId=" + personaId + ", nombre=" + nombre + ", apellido=" + apellido + ", valor=" + valor
				+ "]";
	}
	
	
}
