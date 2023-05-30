
public class Cerchio {
	private double raggio;
	private double area;
	private double diametro;
	private double perimetro;
	public Cerchio(double raggio) {
		this.raggio= 0;
	}
	public void cDiam(double raggio) {
		System.out.println(raggio*2); 
	}
	public void cPerim(double raggio) {
		System.out.println((2*Math.PI)*raggio);
	}
	public void cArea(double raggio) {
		System.out.println(Math.PI*raggio*raggio); 
	}
	public double getArea() {
		return area;
	}
	public double getDiametro() {
		return diametro;
	}
	public double getPerimetro() {
		return diametro;
	}
}
