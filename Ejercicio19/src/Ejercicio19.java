/**19.-Hacer un pseudocodigo que simule el funcionamiento de un reloj digital y que permita ponerlo en hora*/
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int hora, minutos, segundos;
		int ahora, aminutos, asegundos;
		ahora = aminutos = asegundos = 10;
		hora = minutos = segundos = -1;
		while(hora>=24 || hora<0){
			System.out.println("introducir horas");
			hora = teclado.nextInt();
		}
		while(minutos>=60 || minutos<0){
			System.out.println("introducir minutos");
			minutos = teclado.nextInt();
			}
		while(segundos>=60 || segundos<0){
			System.out.println("introducir segundos");
			segundos = teclado.nextInt();
			}
		while(segundos<=60) {
			if (segundos==60) {
				segundos = 0;
				minutos++;
			}
			if (minutos==60){
				minutos=0;
				hora++;
			}
			if (hora==24) {
				hora = 0;
			}
			if (hora==ahora && minutos == aminutos && segundos == asegundos) {
				System.out.println("ring ring ring");
				break;
			}
			System.out.printf("%02d:%02d:%02d\n",hora,minutos,segundos);
			Thread.sleep(1000);
			segundos++;
			teclado.close();
		}
	}
}

