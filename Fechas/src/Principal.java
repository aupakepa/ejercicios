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
		Scanner teclado = new Scanner(System.in);
		int opcion =-1;
		int dia = 0;
		int mes = 0;
		int ano = 0;
		Fecha fechas[] = new Fecha [10];
		do {

			System.out.println(" 1. Crear un objeto fecha                        ");
			System.out.println(" 2. Comprobar que una fecha es correcta          ");
			System.out.println(" 3. Comprobar que un año es                      ");
			System.out.println(" 4. Visualizar Fechas                            ");
			System.out.println(" 5. diferencia Fechas                            ");
			System.out.println(" 0. SALIR DEL PROGRAMA                           ");
			System.out.print("               ");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
			
				if (Fecha.getCont() == 11) {
					System.out.println("limite de cuentas alcanzado");	
				}
				else {
					dia = Leer.pedirEntero("dia");
					mes = Leer.pedirEntero("mes");
					ano = Leer.pedirEntero("año");
					fechas [Fecha.getCont()] = new Fecha(dia,mes,ano);
				}
				break;
			case 2:
				dia = Leer.pedirEntero("dia");
				mes = Leer.pedirEntero("mes"); 
				ano = Leer.pedirEntero("año");
				System.out.println(Fecha.esCorrecta(dia, mes, ano));
				break;
			case 3:
				ano = Leer.pedirEntero("introduce un año");
				if (Fecha.esBisiesto(ano)) {
				System.out.println("el año es bisiesto");	
				}
				else {
					System.out.println("el año no es bisiesto");
				}
				break;
			case 4:
				for (int i = 0; i < fechas.length-1; i++) {
					if (fechas[i]!=null) {
					Leer.mensaje(fechas[i].getCadenaFecha1());
				}
				}
				break;
			case 5:
				/*dia = Leer.pedirEntero("dia");
				mes = Leer.pedirEntero("mes"); 
				ano = Leer.pedirEntero("año");
				int dias = Fecha.dias(dia, mes, ano);
				System.out.println(dias);*/
				System.out.println(fechas[0].difDia());
				break;
			case 0:
				teclado.close();
				break;
			default:
				break;
			}
		} while (opcion != 0);
	}
}


