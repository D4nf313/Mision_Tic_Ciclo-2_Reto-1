import java.util.Scanner;

public class Reto1 {

	private int  A, B, C;

	Scanner entrada = new Scanner(System.in);
	public String Compresion(int a) {
		if (a < 20) {
			return "uno";

		}
		if (a >= 21 && a <= 30) {
			return "dos";
		}
		if (a >= 31 && a <= 50) {
			return" tres";

		}
		if (a > 50) {
			return "cuatro";
		}
		return null;
	
	}

	public void espacioDisp() {

		System.out.println("Introduce el espacio libre que hay en el disco A");

		A = entrada.nextInt();
		B = (A +2) * 2;
		C = (A + B) / 5;
		String resp=Compresion(C);
		
		System.out.println(A+" "+B+" "+" "+C);
		System.out.println(resp);
	}

	
public static void main(String[] args) {
	
Reto1 r= new Reto1();
r.espacioDisp();
}
	
	
	
}
