public class Circle {
	
	private String num;
	private double r;
	private double c;
	private double a;
	private double pi = Math.PI;
	String cir;
	String area;
	
	public void circle(double rad) {
		r = rad;
	}
	
	public double getCircumference() {
		c = pi * (r + r);
		return c;
	}
	
	public String getForCir() {
		cir = formatNumber(getCircumference());
		return cir;
	}
	
	public double getArea() {
		a = pi * (r * r);
		return a;
	}
	public String getForArea() {
		area = formatNumber(getArea());
		return area;
	}

	private String formatNumber(double d) {
		num = String.format("%.2f", d);
		return num;
	}
	
}
