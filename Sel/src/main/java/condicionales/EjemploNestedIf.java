package condicionales;

public class EjemploNestedIf {

	public static void main(String[] args) {
		int temperatura = 14;
		
		if (temperatura > 15) {
			if(temperatura > 25) {
				System.out.println("A la playa!");
			}else {
				System.out.println("A la montana");
			}
		}else {
			System.out.println("A descansar...");
		}

	}

}
