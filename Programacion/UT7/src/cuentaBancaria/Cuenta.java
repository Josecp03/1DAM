package cuentaBancaria;

public class Cuenta {
	private String IBAN;
	private String cuenta;
	private String codigoTitular;
	private String codigoAutorizado;
	private double saldo;
	
	
	public Cuenta(String iBAN, String cuenta, String codigoTitular, String codigoAutorizado, double saldo) {
		super();
		IBAN = iBAN;
		this.cuenta = cuenta;
		this.codigoTitular = codigoTitular;
		this.codigoAutorizado = codigoAutorizado;
		this.saldo = saldo;
	}


	public String getIBAN() {
		return IBAN;
	}


	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}


	public String getCuenta() {
		return cuenta;
	}


	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}


	public String getCodigoTitular() {
		return codigoTitular;
	}


	public void setCodigoTitular(String codigoTitular) {
		this.codigoTitular = codigoTitular;
	}


	public String getCodigoAutorizado() {
		return codigoAutorizado;
	}


	public void setCodigoAutorizado(String codigoAutorizado) {
		this.codigoAutorizado = codigoAutorizado;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	@Override
	public String toString() {
		return "Cuenta: "+"\n"+"\t"+"IBAN: "+IBAN+"\n"+"\t"+"cuenta: "+cuenta+"\n"+"\t"+"codigoTitular: "+codigoTitular+"\n"+"\t"+"codigoAutorizado: "+codigoAutorizado+"\n"+"\t"+"saldo: "+saldo;
	}
	
	public double retirarSaldo(double cantidad) {
		if(cantidad>saldo) {
			System.out.println("No dispone de saldo suficiente");
		}else {
			double nuevoSaldo=0;
			nuevoSaldo=this.getSaldo()-cantidad;
			this.setSaldo(nuevoSaldo);
		}
		
		return saldo;
		
	}
	
	public void ingresar(double cantidad) {
		double nuevoSaldo=0;
		nuevoSaldo=this.getSaldo()+cantidad;
		this.setSaldo(nuevoSaldo);
	}
	
	public static void main(String[] args) {
		Cuenta c=new Cuenta("ES234211", "Nomina", "B123", "A123", 1000);
		System.out.println(c);
		c.ingresar(200);
		System.out.println("Ingreso: "+c.getSaldo()+"€");
		c.retirarSaldo(1300);
		c.retirarSaldo(300);
		System.out.println("Retirada: "+c.getSaldo()+"€");
	}
}