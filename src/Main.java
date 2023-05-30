import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		double n = 0;
		Scanner scanner = new Scanner(System.in);
		
		Cerchio cerchio = new Cerchio(n);
		System.out.println("Inserire il raggio: ");
		n = scanner.nextInt();
		
		System.out.println("Area: ");
		cerchio.cArea(n);
		System.out.println("Diametro: ");
		cerchio.cDiam(n);
		System.out.println("Perimetro: ");
		cerchio.cPerim(n);
		
	

	}

}
