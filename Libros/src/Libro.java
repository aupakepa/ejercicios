import java.util.Arrays;

/**Libro
-titulo: String (no tiene valor por defecto)
-autor:  Autor
-precio: Double
-cantidad: Integer = 0
+Libro(String titulo, Autor autor, Double precio)
+Libro(String titulo, Autor autor, Double precio,
             Integer cantidad)
+getTitulo(): String
+getAutor: Autor
+getPrecio(): Double
+setPrecio (precio: double): void
+getCantidad(): Integer
+setCantidad(cantidad: int): void
+toString(): String*/
public class Libro {
private String titulo;
private double precio;
private Integer cantidad = 0;
private Autor autor [] = new Autor[5];
@Override
public String toString() {
	return "Libro [titulo=" + titulo + ", precio=" + precio + ", cantidad=" + cantidad + ", autor=" + Arrays.toString(autor) + "]"+"\n";
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public Integer getCantidad() {
	return cantidad;
}
public void setCantidad(Integer cantidad) {
	this.cantidad = cantidad;
}
public Autor [] getAutor() {
	return autor;
}
public void setAutor(Autor autor[]) {
		this.autor = autor;
	
}

public Libro(String titulo, double precio, Autor autor[]) {
	this.titulo = titulo;
	this.precio = precio;
	this.autor = autor;
	}
public Libro(String titulo, double precio, Integer cantidad, Autor autor[]) {
	this.titulo = titulo;
	this.precio = precio;
	this.cantidad = cantidad;
	this.autor = autor;
}
}
