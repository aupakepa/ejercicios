
public class Fecha {
	private Integer dia;
	private Integer mes;
	private Integer ano;
	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", ano=" + ano + "]";
	}
	public Integer getDia() {
		return dia;
	}
	public Integer getMes() {
		return mes;
	}
	public Integer getAno() {
		return ano;
	}
	public void setFecha(Integer dia, Integer mes, Integer ano) {
		if (esCorrecta(dia,mes,ano)) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
	}
	public boolean esBisiesto() {
		boolean correcto = false;
		if ((ano%4==0 && ano%100!=0) || ano%400==0) {
			correcto=true;
		}
		return correcto;
	}
	private static boolean esBisiesto (Integer ano) {
		boolean correcto = false;
		if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
			correcto=true;
		}
		return correcto;
	}
	public boolean esCorrecta() {
		boolean correcto = true;
		Integer meses[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		if (this.esBisiesto()) {
			meses[1] = 29;
		} 
		else {
			meses[1] = 28;
		}
		if (mes>0 && mes<=12) {

		} 
		else { 
			correcto = false;
		}
		if (ano>=10000) {
			correcto = false;
		} 

		if (dia>0 && dia<=meses[mes-1]) {

		}
		else {
			correcto = false;
		}
		return correcto;
	}
	public boolean esCorrecta(Integer dia,Integer mes, Integer ano) {
		boolean correcto = true;
		Integer meses[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		if (esBisiesto(ano)) {
			meses[1] = 29;
		} 
		else {
			meses[1] = 28;
		}
		if (mes>0 && mes<=12) {

		} 
		else { 
			correcto = false;
		}
		if (ano>=10000) {
			correcto = false;
		} 

		if (dia>0 && dia<=meses[mes-1]) {

		}
		else {
			correcto = false;
		}
		return correcto;
	}
	/**constructor*/
	public Fecha(Integer dia, Integer mes, Integer ano) {	
		if (esCorrecta(dia,mes,ano)) {	
		this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
	}
	/** Calcula los dias transcurridos desde la fecha de referencia el nacimiento de cristo y el objeto*/
	private Integer diasReferencia() {
		Integer meses[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		Integer	dias = 0;
		if (this.esBisiesto()) {
			meses[1] = 29;
		}
		else {
			meses[1] = 28;
		}
		for (int i = 1; i < ano; i++) {
			if (esBisiesto(i)) {
				dias = dias + 366;	
			}
			else {
				dias = dias + 365;
			}
		}
		
		for (int i = 0; i < this.mes-1; i++) {
			dias = dias + meses[i];
		}
		dias = dias + this.dia;
		return dias;
	}
	/** calcula los dias entre fechas*/
	public Integer diferenciaDias(Fecha fecha2) {
		Integer dias = 0;
		dias = this.diasReferencia() - fecha2.diasReferencia();
		return dias;
	}
	/*  devuelve el mes en texto*/
	public String getCadenaMes() {
		String meses [] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		String mes ="";
		mes = meses[this.mes-1];
		return mes;
	}
	/** calcula los dias que tiene el mes en vigor*/
	public Integer getDiasmes() {
		Integer meses[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		Integer	dias = 0;
		dias = meses[mes-1];
		return dias;
	}
	/**formato dd-mm-aaaa*/
	
	public String getCadenaFecha1() {
		String mensaje ="";
		String dias;
		String mes;
		String ano;
		if (dia<10) {
			dias="0"+ String.valueOf(this.dia);
		} 
		else {
			dias= String.valueOf(this.dia);
		}
		if (this.mes<10) {
			mes="0"+ String.valueOf(this.mes);
		} 
		else {
			mes=String.valueOf(this.mes);
		}
		if (this.ano<10) {
			ano="000"+ String.valueOf(this.ano);
		} 
		else if (this.ano<100) {
			ano="00"+ String.valueOf(this.ano);	
		}
		else if (this.ano<1000) {
			ano="0"+ String.valueOf(this.ano);
		}
		else {
			ano=String.valueOf(this.ano);
		}
		mensaje = dias+"-"+mes+"-"+ano;
		return mensaje;
	}
	/** formato dia de mes de año*/
	public String getCadenaFecha2() {
		String mensaje="";
		mensaje = String.valueOf(this.dia) +" de " + this.getCadenaMes()+" de "+String.valueOf(this.ano);
		return mensaje;
	}
	/** Suma dias a una fecha y devuelve la fecha resutante*/
	public Fecha sumaDias(Integer dias) {
	Integer suma =0;
	Integer dia = 0;
	Integer mes= 1;
	Integer ano= 1;
	Integer meses[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	suma = this.diasReferencia()+dias;
	while ((suma>365 && !Fecha.esBisiesto(ano)) || (suma>366 && Fecha.esBisiesto(ano))) {
		if (Fecha.esBisiesto(ano)) {
			suma = suma - 366;
			ano++;
		}
		else { 
			suma = suma - 365;
			ano++;
		}
	}
	while (suma > meses[mes-1]) {
		suma = suma - meses[mes-1];
		mes++;	
	}
	dia=suma;		
	Fecha fecha2 = new Fecha(dia,mes,ano);
	return fecha2;
	}
	}
