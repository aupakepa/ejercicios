import org.omg.Messaging.SyncScopeHelper;

public class CuentaCorriente {
	private String numCuenta;
	private double saldo;
	private String cliente;
	private boolean confirmacion;

	public CuentaCorriente (String cuenta, double cantidad, String cliente){
		numCuenta = cuenta;
		saldo = cantidad;
		this.cliente = cliente;
	}


	public String getNumCuenta() {
		return numCuenta;
	}


	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public void ingresaEfectivo (double cantidad) {
		this.saldo = this.saldo + cantidad;
	}
	public boolean retiraEfectivo (double cantidad) {
		if (cantidad <= this.saldo) {
			this.saldo = this.saldo - cantidad;
			return true;
		}
		else {
			return false;
		}	
	}
	public void visualiza() {
		System.out.println("numero de cuenta = "+this.numCuenta);
		System.out.printf(" saldo = %+7.2f\n", this.saldo);
		System.out.println();
	}

}

