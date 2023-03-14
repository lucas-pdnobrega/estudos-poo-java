package S8;

public class E1 {
	private double width;
	private double height;
	
	public E1(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double area() {
		return width*height;
	}
	
	public double perimeter() {
		return (2*width) + (2*height);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(2, width) + Math.pow(2, height));
	}
	
	public static void main(String[] args) {
		E1 rectangle = new E1(3, 4);
		System.out.println(rectangle.area());
		System.out.println(rectangle.perimeter());
		System.out.println(rectangle.diagonal());
	}
}
