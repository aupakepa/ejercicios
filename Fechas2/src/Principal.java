import java.util.Scanner;

/**Fecha
- dia: Integer. Número entero que guarda el día del mes.
- mes: Integer. Número entero que guarda el mes.
- año: Integer. Número entero que guarda el año.
Constructor con tres parámetros uno para el día, otro para el mes y otro para el año, que inicializa los tres atributos del objeto con los parámetros pasados. La fecha debe ser legal.
Desarrolla los getters y setters para todos los atributos.
+ esBisiesto():  Boolean. Sin parámetros. Devuelve true si el año es bisiesto y false si no lo es.
+ esCorrecta(): Boolean. Comprueba si la fecha es correcta. Devuelve un valor de tipo boolean indicando si la fecha es correcta o no. Este método a su vez utilizará el método anterior esBisiesto, cuando sea necesario, que calcula si el año es o no bisiesto.
+ getCadenaMes(): String. Sin parámetros. Devuelve una cadena que contiene el  mes con letras: enero, febrero, marzo, etc.
+ getDiasMes(): Integer. Devuelve el número de días que tiene el mes. Teniendo en cuenta que si el año es bisiesto el mes de febrero tendrá 29 días. 
+ getCadenaFecha1(): String. Sin parámetros. Devuelve una cadena con la fecha en formato 'dd-mm-yyyy'.
+ getCadenaFecha2(): String. Sin parámetros. Devuelve una cadena con la fecha en formato ‘5 de Mayo de 2016’.
+ diferenciaFecha(Fecha fecha2): Integer. Devuelve un Integer con la diferencia de días entre la fecha del objeto que invoque el método y fecha2.
+ sumaDias(Integer num): Fecha. Devuelve una Fecha a partir del objeto con el que se invoca el método y el número de días que se pasan como parámetro.
Puedes añadir más métodos si lo consideras necesario.
Crea la clase Principal en la que: 
Haya un menú para usar las opciones que se plantean con los métodos indicados.
Sobre todo, que el constructor solo cree una fecha si los valores de día, mes y año se corresponden con una fecha posible, si no, no se debe crear el objeto hasta que los valores sean correctos. 
 */
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion =-1;
		Fecha fecha = null;
		Fecha fecha2= null;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println(" 1. Crear un objeto fecha                        ");
			System.out.println(" 2. Comprobar que una fecha es correcta          ");
			System.out.println(" 3. Comprobar que un año es bisiesto             ");
			System.out.println(" 4. diferencia Fechas                            ");
			System.out.println(" 5. Suma dias a una fecha                        ");
			System.out.println(" 6. Visualizar Fechas dd-mm-aa                   ");
			System.out.println(" 7. Visualizar Fechas  d de mes de año           ");
			System.out.println(" 0. SALIR DEL PROGRAMA                           ");
			System.out.print("               ");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				fecha = introducirFecha();
				break;
			case 2:
				fecha = introducirFecha();
				if (fecha.esCorrecta()) {
					System.out.println("La fecha es correcta");
				}
				else {
					System.out.println("La fecha no es correcta");
				}
				break;
			case 3:
				fecha = introducirFecha();
				if (fecha.esBisiesto()) {
					System.out.println("El año es bisiesto");
					
				} else {
					System.out.println("El año no es bisiesto");
				}

				break;
			case 4:
				System.out.println("introduce una fecha");
				fecha = introducirFecha();
				System.out.println("introduce la fecha y calcuaremos los dias de diferencia");
				fecha2 = introducirFecha();
				System.out.println(fecha.diferenciaDias(fecha2));
				break;
			case 5:
				fecha = introducirFecha();
				System.out.println("introduce los dias a sumar");
				Integer dias = teclado.nextInt();
				Leer.mensaje(fecha.sumaDias(dias).getCadenaFecha2());
				break;	
			case 6:
				fecha = introducirFecha();
				Leer.mensaje(fecha.getCadenaFecha1());
				break;
			case 7:
				fecha = introducirFecha();
				Leer.mensaje(fecha.getCadenaFecha2());
				break;
			case 0:
				teclado.close();
				break;
			default:
				break;
			}
		} while (opcion != 0);
	}

	/**private static void comprobarFecha(Fecha fecha) {//metodo para comprobar la fecha si solo usaba parametro fecha
		if (fecha.esCorrecta()) {
			Leer.mensaje(fecha.getCadenaFecha1());
		}
		else {
			fecha = null;
			System.out.println("la fecha no es correcta");
		}
	}*/

	private static Fecha introducirFecha() {
		int dia;
		int mes;
		int ano;
		Fecha fecha;
		dia = Leer.pedirEntero("dia");
		mes = Leer.pedirEntero("mes");
		ano = Leer.pedirEntero("año");
		fecha = new Fecha(dia,mes,ano);
		return fecha;
	}


}
