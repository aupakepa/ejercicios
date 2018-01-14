
public class Fecha {
	private Integer dia;
	private Integer mes;
	private Integer ano;
	static Integer cont = 0 ;

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
		if (mes > 12 || mes < 0) {
			System.out.println("El mes debe estar entre 1 y 12");
			error = -1;
		}
		else {
			if ((dia <= meses[mes-1]) && dia > 0) {
			}
			else {
				System.out.println("Esta fecha no es correcta");
				error = -1;
			}

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
	public void getCadenaFecha1 (){
		System.out.printf("%02d-%02d-%04d\n\n",this.dia,this.mes,this.ano);
	}
	public String getCadenaFecha2 (){
		String meses [] = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
		return "Fecha "+this.dia+" de "+ meses[this.mes-1]+" de "+this.ano;
	}
	public int diferenciaDias (Fecha fecha2) {
		int dias = 0;
		Fecha fecha1 = new Fecha (this.dia,this.mes,this.ano);
		dias = fecha2.difDia() - fecha1.difDia();
		return dias;
	}
	public Integer difDia () {
		Integer dias = 0;
		Integer meses [] = {31,28,31,30,31,30,31,31,30,31,30,31};
		dias = dias + this.dia;
		for (int i = 0; i < this.mes - 1; i++) {
			dias = dias + meses[i];
			if (esBisiesto(this.ano) && this.mes >2) {
				dias++;
			}
		}
		for (int i = 1; i < this.ano; i++) {
			if	(esBisiesto(i)) {
				dias= dias+366;
			}
			else {
				dias = dias + 365;
			}
		}
		return dias;
	}
	public Fecha sumaDias(int num) {
		int dia = 0;
		int mes = 1;
		int ano = 1;
		int meses [] = {31,28,31,30,31,30,31,31,30,31,30,31};
		Fecha fecha = new Fecha(this.dia, this.mes, this.ano);
		int dias = fecha.difDia() + num;
		while (dias >= 365) {
			if (esBisiesto(ano)) {
				dias = dias -366;
				ano++;
			}
			else {
				dias = dias -365;
				ano++;
			}
		}	
		if (esBisiesto(ano)) {
			meses[1] = 29;
		}
		else {
			meses[1] = 28;
		}
		for (int i = 0; dias > meses[i]; i++) {
			dias = dias - meses[i];
			mes++;
		}
		dia = dias;
		fecha.setFecha(dia, mes, ano);
		return fecha;
	}
}


