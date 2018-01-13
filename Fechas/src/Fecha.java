
public class Fecha {
	private Integer dia;
	private Integer mes;
	private Integer ano;
	static Integer cont = 1 ;

	public static Integer getCont() {
		return cont;
	}
	public static void setCont(Integer cont) {
		Fecha.cont = cont;
	}
	public Fecha (int dia, int mes, int ano) {
		if (esCorrecta (dia, mes, ano)) {
			this.dia = dia;
			this.mes = mes;	
			this.ano = ano;
			cont++;
		}
		else {
		}	
	}
	public Integer getDia() {
		return dia;
	}

	public void setFecha(Integer dia, Integer mes, Integer ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public Integer getMes() {
		return mes;
	}

	public Integer getAno() {
		return ano;
	}

	public static boolean esCorrecta (int dia, int mes, int ano) {
		int meses [] = {31,28,31,30,31,30,31,31,30,31,30,31};
		if (esBisiesto(ano)) {
			meses[1] = 29;
		}
		else {
			meses[1] = 28;
		}
		int error = 0;
		if ((dia <= meses[mes-1]) && dia > 0) {
		}
		else {
			System.out.println("Esta fecha no es legal");
			error = -1;
		}
		if (mes > 0 && mes <= 12) {
		}	
		else {
			System.out.println("el mes debe ser entre 1 y 12");
			error = -1;
		}
		if (ano < 10000) {
		}
		else {
			System.out.println("el año tiene que tener como maximo cuatro cifras");
			error = -1;
		}
		if (error != -1 ) {
			return true;
		}
		else {
			return false;	
		}
	}
	public  static boolean esBisiesto(int ano) {
		boolean correcto = false;
		if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
			correcto = true;
		}
		else {
			correcto = false;
		}
		return correcto;
	}
	public String getCadenaFecha1 (){
		return "Fecha "+dia+"-"+mes+"-"+ano;
	}
	public String getCadenaFecha2 (){
		String meses [] = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
		return "Fecha "+this.dia+" de "+ meses[this.mes-1]+" de "+this.ano;
	}
public static int dias (int dia, int mes, int ano) {
		int dias = 0;
		int meses [] = {31,28,31,30,31,30,31,31,30,31,30,31};
		dias = dias + dia;
		for (int i = 0; i < mes - 2; i++) {
			dias = dias + meses[i];
			if (esBisiesto(ano) && mes>2) {
				dias++;
			}
		}
		for (int i = 1; i < ano; i++) {
		if	(esBisiesto(i)) {
			dias= dias+366;
		}
		else {
			dias = dias + 365;
		}
		}
		return dias;
	}
public static Integer difDia (Fecha fecha) {
	int dias = 0;
	int dia = fecha.getDia();
	int mes = fecha.getMes();
	int ano = fecha.getAno();
	int meses [] = {31,28,31,30,31,30,31,31,30,31,30,31};
	dias = dias + dia;
	for (int i = 0; i < mes - 2; i++) {
		dias = dias + meses[i];
		if (esBisiesto(ano) && mes >2) {
			dias++;
		}
	}
	for (int i = 1; i < ano; i++) {
	if	(esBisiesto(i)) {
		dias= dias+366;
	}
	else {
		dias = dias + 365;
	}
	}
	return dias;
}
}


