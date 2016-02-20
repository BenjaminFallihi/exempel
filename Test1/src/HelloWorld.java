
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
		int result;
		result = left + right;
		return result;

	}

	public static void main(String[] args) {

		int zahl1 = 3;
		int zahl2 = 2;
		int erg;
		String text;
		/*
		 * der Inhalt in der Klammern wird ausgegeben
		 */
		System.out.println("Hello World");

		/*
		 * die Methode plus(zahl1, zahl2) wird aufgerufen und der Inhalt wird an
		 * die Methode weiter gegeben. Das Ergebnis wird zu ausgabe zugewiesen.
		 * 
		 */
		erg = plus(zahl1, zahl2);

		System.out.println(erg);

	}

}
