package condicionales;

public class EjemploSwitchCase {

	public static void main(String[] args) {
		int i = 9;
		
		switch (i) {
		case 0:
			System.out.println("i es cero");
			break;
		case 1:
			System.out.println("i es uno");
		case 2:
			System.out.println("i es dos");
		case 4:
			System.out.println("i es cuatro");
			break;
		default:
			System.out.println("i es mayor que 2");
		}

	}

}
