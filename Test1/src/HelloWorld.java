
public class HelloWorld {

	/**
	 * liefert das Ergebnis der Addition von zahl1 und zahl2 zurück. Hinweis:
	 * int weist darufhin, dass es einen Rückgabewert hat
	 * 
	 * @param left
	 * @param right
	 * @return result
	 */
	public static int plus(int left, int right) {
		int result = 0;
		result = left + right;
		return result;

	}

	/**
	 * 
	 * @param parameter
	 * @return
	 */
	public static int rechnen(int... parameter) {
		int erg = 0;
		for (int i = 0; i < parameter.length; i++) {
			erg += parameter[i];
		}
		return erg;
	}

	public static void main(String[] args) {

		int zahl1, zahl2, zahl3;
		zahl1 = 3;
		zahl2 = 2;
		zahl3 = 5;
		int erg1, erg2;

		/*
		 * der Inhalt in der Klammern wird ausgegeben
		 */
		System.out.println("Hello World");

		/*
		 * die Methode plus(zahl1, zahl2) wird aufgerufen und der Inhalt wird an
		 * die Methode weiter gegeben. Das Ergebnis wird zu ausgabe zugewiesen.
		 * 
		 */
		erg1 = plus(zahl1, zahl2);
		System.out.println(erg1);

		/*
		 * 
		 */
		erg2 = rechnen(zahl1, zahl2, zahl3);
		System.out.println(erg2);

	}

}
