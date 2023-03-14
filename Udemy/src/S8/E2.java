package S8;

public class E2 {
	
	private double grosssalary;
	private double tax;
	
	public E2(double grosssalary, double tax) {
		this.grosssalary = grosssalary;
		this.tax = tax;
	}
	
	public double netSalary() {
		return grosssalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grosssalary += grosssalary * (percentage/100);
	}

	public static void main(String[] args) {
		E2 jo = new E2(6000, 1000);
		System.out.println(jo.netSalary());
		jo.increaseSalary(10);
		System.out.println(jo.netSalary());
	}

}
