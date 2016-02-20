import java.util.Scanner;

public class Calculator {

	/**
	 * schaut nach welche Operation gewünscht ist, führt sie durch und gibt als
	 * double wieder zurück
	 * 
	 * @param zahl3
	 * @param zahl4
	 * @param operator
	 *            string zum Vergleich
	 * @return result
	 */
	public static double calcu(double zahl3, double zahl4, String operator) {
		double result;
		if (operator.equals("+")) {
			result = zahl3 + zahl4;

		} else if (operator.equals("-")) {
			result = zahl3 - zahl4;

		} else if (operator.equals("*")) {
			result = zahl3 * zahl4;

		} else if (operator.equals("/")) {
			result = zahl3 / zahl4;

		} else {
			System.out.println("Bitte nur +, -, * oder / eingeben!");
			return -1;
		}
		return result;

	}

	public static void main(String[] args) {

		double zahl1, zahl2, erg1;
		String operator;

		/*
		 * erzeugt ein Objekt von der Klasse Scanner
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("Geben Sie eine Zahl ein.");
		zahl1 = scan.nextDouble(); // das Objekt scan ruft die Methode nextDoule
		System.out.println("Geben Sie dem Operator (+, -, * oder /) ein.");
		operator = scan.next();
		System.out.println("Geben Sie eine 2. Zahl ein.");
		zahl2 = scan.nextDouble();
		scan.close(); //wichtig muss abgeschlossen werden
		erg1 = calcu(zahl1, zahl2, operator);
		System.out.println(erg1);

	}

}
