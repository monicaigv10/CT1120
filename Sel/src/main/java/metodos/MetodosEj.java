package metodos;

public class MetodosEj {

	public static void main(String[] args) {
		int resultado = suma(4,7);
		System.out.println(resultado);
		
		int resultado2 = suma(134,14,15);
		System.out.println(resultado2);
		
		String marca = carro(2);
		System.out.println(marca);

	}
	
	public static int suma(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static int suma(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}
	
	public static String carro(int a) {
		String[] cars = {"Volvo", "BMW", "Infiniti", "Mazda"};
		return cars[a];
	}

}
