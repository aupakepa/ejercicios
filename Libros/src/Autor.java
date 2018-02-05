/**Autor
-nombre: String (no tiene valor por defecto)
-email:  String (no tiene valor por defecto)
-sexo: char (los posibles valores son ‘m’ o ‘f’)
-fechaNacimiento: Fecha
+Autor(nombre: String, email: String, genero: String)
+getNombre(): String
+getEmail: String
+setEmail(email: String): void
+getSexo(): char
+toString(): String*/
public class Autor {
	private String nombre;
	private String email;
	private char sexo;
	private Fecha fechaNacimiento;
	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", email=" + email + ", sexo=" + sexo + ", fechaNacimiento=" + fechaNacimiento
				+ "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Autor(String nombre, String email, char sexo, Fecha fechaNacimiento) {
		this.nombre = nombre;
		this.email = email;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
	}
}
