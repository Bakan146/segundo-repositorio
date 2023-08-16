import java.util.Scanner;

public class Primeracalculadora { //Encabezado de clase

	public static void main(String[] args) {

		int Num1;
		int Num2;
		int suma;
		int resta;
		int multiplicacion;
		int division;
		int modulo;

		Scanner lector = new Scanner (System.in);

		System.out.println("Hola, escribe tu primer numero numeros");

		Num1 = lector.nextInt();

		System.out.println("Hola, escribe tu primer numero numeros");

		Num2 = lector.nextInt();


		suma = Num1 + Num2;
		resta = Num1 - Num2;
		multiplicacion = Num1 * Num2;
		division = Num1 / Num2;
		modulo = Num1 % Num2;

		System.out.println(" El resultado de la suma fue:");
		System.out.println(suma);

		System.out.println(" El resultado de la resta fue:");
		System.out.println(resta);
		
		System.out.println(" El resultado de la multiplicacion fue:");
		System.out.println(multiplicacion);
		
		System.out.println(" El resultado de la division fue:");
		System.out.println(division);
		
		System.out.println(" El resultado de la moduloo fue:");
		System.out.println(modulo);
	}
}