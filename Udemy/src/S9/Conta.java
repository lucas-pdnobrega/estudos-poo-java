package S9;

public class Conta {
	
	private final int num;
	private String titular;
	private double saldo;

	public Conta(int num, String titular, double valor) {
		this.num = num;
		this.titular = titular;
		this.deposito(valor);
	}
	
	public Conta(int num, String titular) {
		this.num = num;
		this.titular = titular;
		this.saldo = 0;
	}

	@Override
	public String toString() {
		return "Conta [num=" + num + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public void saque(double valor) {
		this.saldo -= valor + 5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c1 = new Conta(1, "Rn");
		c1.deposito(50);
		System.out.println(c1);
		c1.saque(50);
		System.out.println(c1);
	}

}
