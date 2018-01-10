import java.util.Scanner;

/**Escribe un programa que pida una cadena de caracteres por teclado y 
 * a continuacion muestre en la pantalla la suma de todos los digitos numerico que aparecen en la cadena*/

public class MonforteTaboadaEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("introducir una frase con caracteres y numeros");//No pide limitar la entrada de datos
		String frase = teclado.nextLine(); //creamos la variable frase para almacenar la cadena
		String numeros ="";// creo una variable para almacenar solo los numeros
		int suma = 0;
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) >= '0' && frase.charAt(i) <= '9') {
				numeros = numeros + frase.charAt(i);
			}	
		}
		for (int i = 0; i < numeros.length(); i++) {
			suma = suma + Integer.parseInt(numeros.substring(i, i+1));//convierto el caracter a entero para poderlo sumar al entero suma
		}
		System.out.println("los numeros de la cadena son :"+numeros);
		System.out.println("y su suma es = "+suma);
		teclado.close();
	}

}
