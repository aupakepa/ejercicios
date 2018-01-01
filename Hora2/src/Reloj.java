import java.util.Scanner;

public class Reloj {
	private int horas;
	private int minutos;
	private int segundos;
	/**constructor*/
	public Reloj (int hh, int mm, int ss) {
		if (hh >= 0 && hh < 24){
			this.horas = hh;
		}
		else{
			this.horas = 0;
		}
		if (mm >= 0 && mm < 60){
			this.minutos = mm;
		}
		else{
			this.minutos = 0;
		}
		if (ss >= 0 && ss < 60){
			this.segundos = ss;
		}
		else{
			this.segundos = 0;
		}
	}
	/** get horas*/
	public int getHoras() {
		return horas;
	}
	/** set horas*/
	public void setHoras(int hh) {
		if (hh < 60 && hh >= 0){
			this.horas = hh;
		}
		else{
			System.out.println("las horas introducidos no son correctas");
			hh = 0;
		}
	}
	/** get minutos */
	public int getMinutos() {
		return minutos;
	}
	/** set minutos */
	public void setMinutos(int mm) {
		if (mm < 60 && mm >= 0){
			this.minutos = mm;
		}
		else{
			System.out.println("los minutos introducidos no son correctos");
			mm = 0;
		}
	}
	/** get segundos*/
	public int getSegundos() {
		return segundos;
	}
	/** set segundos*/
	public void setSegundos(int ss) {
		if (ss < 60 && ss >= 0){
			this.segundos = ss;
		}
		else{
			System.out.println("los segundos introducidos no son correctos");
			ss = 0;
		}
	}
	/**introducir hora por teclado*/
	public void introducirHora (Scanner teclado, Reloj hora) {
		System.out.println("introduzca horas");
		hora.setHoras(teclado.nextInt());
		System.out.println("introduzca minutos");
		hora.setMinutos(teclado.nextInt());
		System.out.println("introduzca segundos");
		hora.setSegundos(teclado.nextInt());
	}
	/**introducir alarma por teclado*/
	public void introducirAlarma (Scanner teclado, Reloj alarma) {
		System.out.println("introduzca horas");
		alarma.setHoras(teclado.nextInt());
		System.out.println("introduzca minutos");
		alarma.setMinutos(teclado.nextInt());
		System.out.println("introduzca segundos");
		alarma.setSegundos(teclado.nextInt());
	}
	//*funcionamiento reloj*/
	public void funcionReloj (Reloj hora, Reloj alarma) throws InterruptedException {
		int hh = this.horas;
		int mm = this.minutos;
		int ss = this.segundos;
		int hhalarma = alarma.getHoras();
		int mmalarma = alarma.getMinutos();
		int ssalarma = alarma.getSegundos();
		while(ss <= 60) {
			if (ss == 60) {
				ss = 0;
				mm++;
			}
			if (mm == 60){
				mm = 0;
				hh++;
			}
			if (hh == 24) {
				hh = 0;
			}
			if (hh == hhalarma && mm == mmalarma && ss == ssalarma) {
				System.out.println("alarma sonando");
				System.out.println("alarma sonando");
				System.out.println("alarma sonando");
				ss++;
			}
			
			else {
			System.out.printf("%02d:%02d:%02d\n",hh,mm,ss);
			ss++;
			Thread.sleep(1000);
			}
		}
	}
	public void imprimir () {
		System.out.printf("%02d:%02d:%02d\n",this.getHoras(),this.getMinutos(),this.getSegundos());
	}
	/**suma horas*/
	public void suma (Scanner teclado, Reloj hora) {
		System.out.println("introducir horas");
		hora.setHoras(this.horas + teclado.nextInt());
		System.out.println("introducir minutos");
		hora.setMinutos(this.minutos + teclado.nextInt());
		System.out.println("introducir horas");
		hora.setSegundos(this.segundos + teclado.nextInt());	}
}
