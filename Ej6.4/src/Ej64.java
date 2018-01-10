import java.util.Scanner;

public class Ej64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	CuentaCorriente cuenta1 = new CuentaCorriente("001",0,"javier");
	CuentaCorriente cuenta2 = new CuentaCorriente("002",0,"juan");
	int menu = -1;
	double cantidad = 0;
	boolean confirmacion = false; 
	Scanner teclado = new Scanner(System.in);
	do {
	System.out.println("1: Ingresar en la cuenta 001");
	System.out.println("2: Ingresar en la cuenta 002");
	System.out.println("3: Retirar de la cuenta 001");
	System.out.println("4: Retirar de la cuenta 002");
	System.out.println("5: Visualiza ambas cuentas");
	System.out.println("0. Fin");
	menu = teclado.nextInt();
	switch (menu) {
	
	case 1: 
		System.out.println("Introduzca cantidad");
		cantidad = teclado.nextDouble();
		cuenta1.ingresaEfectivo(cantidad);
		
		break;
	case 2:
		System.out.println("Introduzca cantidad");
		cantidad = teclado.nextDouble();
		cuenta2.ingresaEfectivo(cantidad);
		break;
	case 3:
		System.out.println("Introduzca cantidad");
		cantidad = teclado.nextDouble();
		confirmacion = cuenta1.retiraEfectivo(cantidad);
		System.out.println(confirmacion);
		break;
	case 4:
		System.out.println("Introduzca cantidad");
		cantidad = teclado.nextDouble();
		confirmacion = cuenta2.retiraEfectivo(cantidad);
		System.out.println(confirmacion);
		break;
	case 5:
		cuenta1.visualiza();
		cuenta2.visualiza();
		break;
	default:
		break;
	}
	} while (menu != 0);
	teclado.close();
	}

}
