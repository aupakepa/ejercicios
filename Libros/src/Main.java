import java.util.Arrays;

/**
 * 3) Crea el proyecto LibroUnAutor, que estará formado por las siguientes
 * clases: Autor -nombre: String (no tiene valor por defecto) -email: String (no
 * tiene valor por defecto) -sexo: char (los posibles valores son ‘m’ o ‘f’)
 * -fechaNacimiento: Fecha +Autor(nombre: String, email: String, genero: String)
 * +getNombre(): String +getEmail: String +setEmail(email: String): void
 * +getSexo(): char +toString(): String
 * 
 * El método toString devolverá la siguiente cadena de caracteres (por ejemplo):
 * "Autor[nombre = Arturo Perez Reverte, email = apreverte@correo.com, sexo = m,
 * fechaNacimiento = 16-03-1954]"
 * 
 * Libro -titulo: String (no tiene valor por defecto) -autor: Autor -precio:
 * Double -cantidad: Integer = 0 +Libro(String titulo, Autor autor, Double
 * precio) +Libro(String titulo, Autor autor, Double precio, Integer cantidad)
 * +getTitulo(): String +getAutor: Autor +getPrecio(): Double +setPrecio
 * (precio: double): void +getCantidad(): Integer +setCantidad(cantidad: int):
 * void +toString(): String
 * 
 * Supondremos que un libro sólo tiene un autor y que el método toString
 * devolverá una cadena de caracteres como la siguiente (por ejemplo): “Libro
 * [titulo = El asedio, Autor [nombre = Arturo Perez Reverte, email =
 * apreverte@correo.com, sexo = m, fechaNacimiento = 16-03-1954] precio = 18,90
 * cantidad = 3]” Escribe la clase TestLibroAutor, que además del método main
 * deberá tener otros métodos estáticos para que al ejecutar la aplicación
 * muestre un menú con las siguientes opciones: 1- Crear libros. (Esta opción
 * preguntará al usuario cuántos libros quiere crear y a continuación procederá
 * a instanciarlos) 2- Modificar autor. 3- Modificar libro. 4- Listado de
 * libros. 5- Listado de autores. 0- Salir.
 * 
 * 4) Crea un nuevo proyecto, al que llamarás LibroVariosAutores que utilice las
 * clases del ejercicio anterior y modifica la clase Libro para que un libro
 * pueda tener varios autores. El método toString debe devolver, por ejemplo:
 * “Libro [titulo = Cuentan que cuentan { Autor [nombre = Silvia Schujer, email
 * = schujer@correo.com, genero = f, fechaNacimiento = 16-03-1954 ], [Laura
 * Devetach, ldevet@edu.com, genero = f, fechaNacimiento = 16-03-1954], [Emma
 * Wolf, wolf@correo.com , genero = f, fechaNacimiento = 16-03-1954]} precio =
 * 14 cantidad = 6]”
 * 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libros[] = new Libro[10];
		Autor autor[] = new Autor[5];
		int menu = -1;
		do {
			System.out.println("1- Crear libros.");
			System.out.println("2- Modificar libro");
			System.out.println("3- Modificar autor");
			System.out.println("4- Listado de libros");
			System.out.println("5- Listado de autores");
			System.out.println("6- Crear Varios Libros");
			System.out.println("7- Crear Varios Autores");
			System.out.println("0- Salir");
			menu = Leer.pedirEntero("introduzca una opcion de menu");
			switch (menu) {
			case 1:
				int numero = Leer.pedirEntero("Cuantos libros quieres crear");
				for (int i = 0; i <= libros.length && numero != 0; i++) {
					if (libros[i] == null && i == libros.length - 1) {
						libros = Arrays.copyOf(libros, libros.length + 10);
					} else if (libros[i] == null) {
						libros[i] = introducirLibros();
						numero--;
					}
				}
				break;
			case 2:
				String cadena = Leer.pedirCadena("Busca un libro");
				for (int i = 0; (i < libros.length) && (libros[i] != null); i++) {
					if (libros[i].getTitulo().indexOf(cadena) != -1) {
					Leer.mensaje("hemos encontrado tu libro");
					Leer.mensaje(libros[i].toString());
					Leer.mensaje("modifica el libro");
					libros[i] = introducirLibros();
					Leer.mensaje(libros[i].toString());
					}
				}
				break;
			case 3:
				
				break;
			case 4:
					Leer.mensaje(Arrays.toString(libros));
				break;
			case 5:
				for (int j = 0; j < autor.length; j++) {
					Leer.mensaje(Arrays.toString(libros[j].getAutor()));	
				}
				break;
			case 6:
				libros = variosLibros();
				break;
			case 0:

				break;
			case 7:

				break;

			default:
				break;
			}
		} while (menu != 0);

	}

	/**
	 * @param autor
	 * @param libros
	 */
	public static Libro introducirLibros() {
		String titulo;
		double precio;
		Autor autor[] = new Autor[5];
		titulo = Leer.pedirCadena("introduce el titulo");
		precio = Leer.pedirDecimal("introduce el precio");
		autor = IntroducirAutores();
		Libro libro = new Libro(titulo, precio, autor);
		return libro;
	}

	/**
	 * @param autor
	 * @param numeroAutores
	 */
	public static Autor[] IntroducirAutores() {
		String nombre;
		String email;
		char sexo;
		Fecha fechaNacimiento;
		Autor autor[] = new Autor[5];
		int numeroAutores = Leer.pedirEntero("introduce numero de autores");
		for (int j = 0; j < numeroAutores; j++) {
			nombre = Leer.pedirCadena("Introduce el nombre del autor");
			email = Leer.pedirCadena("email");
			sexo = Leer.pedirCadena("introduce F o M").charAt(0);
			fechaNacimiento = IntroducirFecha();
			autor[j] = new Autor(nombre, email, sexo, fechaNacimiento);
		}
		return autor;
	}

	/**
	 * @return
	 */
	public static Fecha IntroducirFecha() {
		Fecha fechaNacimiento;
		int dia = Leer.pedirEntero("dia");
		int mes = Leer.pedirEntero("mes");
		int ano = Leer.pedirEntero("año");
		fechaNacimiento = new Fecha(dia, mes, ano);
		return fechaNacimiento;
	}

	public static Autor[] repetirAutores() {

		Fecha fecha = new Fecha(24, 7, 1977);
		Autor autor[] = new Autor[5];
		Arrays.fill(autor,new Autor("","",' ',fecha));
		autor[0] = new Autor("javier", "jmonforte@fontecabras.es", 'M', fecha);
		autor[1] = new Autor("estrada", "susana@fontecabras.es", 'F', fecha);
		return autor;
	}

	public static Libro[] variosLibros() {
		Libro libro[] = new Libro[10];
		libro[0] = new Libro("La insoportable levedad del ser", 20, repetirAutores());
		libro[1] = new Libro("El señor de los anillos", 20, repetirAutores());
		libro[2] = new Libro("El perfume", 20, repetirAutores());
		libro[3] = new Libro("Trainspotting", 20, repetirAutores());
		libro[4] = new Libro("Los Pilares de la tierra", 20, repetirAutores());
		return libro;
	}

}
