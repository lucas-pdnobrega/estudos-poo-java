package cap3;

public class Conta {
	private String numero;
	private String cpf;
	private double saldo;
	
	public Conta(String numero, String cpf, double saldo) {
		this.numero = numero;
		this.cpf = cpf;
		this.saldo = saldo;
	}
	
	public Conta(String numero, String cpf) {
		this.numero = numero;
		this.cpf = cpf;
		this.saldo = 0;
	}
	
	@Override
	public String toString() {
		return String.format("- Conta %s -%ncpf = %s%nsaldo = %s", numero, cpf, saldo);
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void creditar(double valor) {
		saldo += valor;
	}
	
	public void debitar(double valor) {
		saldo -= valor;
	}
	
	public void transferir(double valor, Conta destino) {
		this.debitar(valor);
		destino.creditar(valor);
	}
	
	public boolean vazia() {
		if (saldo == 0) return true; 
		else return false;
	}
	
	public Conta clonar() {
		return new Conta(this.numero, this.cpf, this.saldo);
	}
}
