import java.util.Scanner;

public class Hora2principal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int horas, minutos, segundos , menu ,hhalarma , mmalarma, ssalarma ;
		horas  = minutos = segundos = mmalarma = ssalarma = hhalarma = 0;
		Scanner teclado = new Scanner(System.in);
		Reloj hora = new Reloj (horas,minutos,segundos);
		Reloj alarma = new Reloj (hhalarma, mmalarma, ssalarma);
		do {
			System.out.println("1. Poner el Reloj en Hora");
			System.out.println("2. Funcionamiento del Reloj");
			System.out.println("3. Fijar alarma");	
			System.out.println("4. Sumar horas al reloj");
			System.out.println("5. Salir del menu");
			menu = teclado.nextInt();
			switch (menu) {
			case 1:
				hora.introducirHora(teclado, hora);
				hora.imprimir();
				break;
			case 2:
					hora.funcionReloj(hora, alarma);
					break;
			case 3:
				alarma.introducirAlarma(teclado, alarma);

				break;
			case 4:
				hora.suma(teclado, hora);
				break;	
			default:
				System.out.println("Para todo lo demas Mastercard");
				break;
			}			
		} while (menu != 5);
	}	
}
