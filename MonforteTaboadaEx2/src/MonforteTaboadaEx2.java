//*introducir una frase y duplicar las letras*/
import java.util.Scanner;

public class MonforteTaboadaEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado =  new Scanner(System.in);
	System.out.println("introduce una cadena de texto");//no ponemos ninguna restriccion si no deberia ir dentro de un do while
	String cadena = teclado.nextLine();
	String cadena2 = "";
	for (int i = 0; i < cadena.length(); i++) {//recorremos la cadena y en cada paso añadimos la letra por duplicado
		cadena2= cadena2 + cadena.charAt(i)+cadena.charAt(i);
	}
	System.out.println(cadena2);
	teclado.close();
	}

}
