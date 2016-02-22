
public class TypTyp {

	public void typen() {

		/*
		 * zahl wird nur einmal einen Wert zugewisen und kann nicht mehr
		 * verändert werden. D.h., zahl = 6; ist nicht mehr zulaessig wegen der
		 * final.
		 */
		final int zahl = 4;
		System.out.println(zahl);
	}

	public void datenändern() {
		/*
		 * hiermit () kann man Datentyp ändern z.B., long in int. es nennt sich
		 * casten
		 */
		long y = 4;
		int x = (int)y;
		System.out.println(x);
	}

	public int bool(int val1, int val2) {

		/*
		 * wenn der fall zutreffen sollte wird in dem jeweiligen variablen tru
		 * gespeichert.
		 */
		boolean vergleich1 = val1 > val2;
		boolean vergleich2 = val1 == val2;
		boolean vergleich3 = val1 < val2;

		if (vergleich1)
			System.out.println("val1 ist groesser als val2.");
		else if (vergleich2)
			System.out.println("val1 ist gleich gross wie val2.");
		else if (vergleich3)
			System.out.println("val1 ist kleiner val2.");
		else {
			System.out.println("trifft nicht zu");
		}

		return val1 + val2;
	}

}
