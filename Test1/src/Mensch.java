/*
 * mit extends sagt man dem Kompiler, dass die Klasse Mensch 
 * alle Eigenschaften der Klasse Lebewesen erben bzw. übernehmen soll.
 */

public class Mensch extends Lebewesen {
	int gross, iq;
	String name;

	/*
	 * static ist an der Klasse gebunden und ist für alle gleich. Private
	 * bewirkt, dass das Attribut anzahlMensch nur in der Klasse Mensch
	 * verändert werden kann oder außerhalb der Klasse nur mit der Hilfe einer
	 * Methode von der Klasse Mensch zugreifbar bzw. aufrubar wird.
	 */
	private static int anzahlMensch = 0;

	/**
	 * ist eine static Methode und deshalb an der Klasse gebunden
	 * 
	 * @return anzahlMensch
	 */
	static int getAnzahlMenschen() {
		return anzahlMensch;
	}

	/**
	 * ist der Konstruktor der Klasse Mensch. jedes mal wenn ein Objekt der
	 * Klasse Mensch erzeugt wird, wirden automatisch die Parametern diese
	 * Klasse an dem erzeugten Objekt übergeben.
	 * 
	 * @param Name
	 * @param Vorname
	 * @param wieAlt
	 * @param wieGross
	 * @param wieSchlau
	 */
	Mensch(String name, String vorname, int wieAlt, int wieGross, int wieSchlau) {

		this.name = name;
		this.vorname = vorname;
		this.alter = wieAlt;
		this.gross = wieGross;
		this.iq = wieSchlau;
		anzahlMensch++;

	}

	Mensch() {
		anzahlMensch++;
	}

	void wissen() {
		this.iq++;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString() die Methode toString wird überschrieben
	 */
	@Override // man kann damit überprüfen ob die Methode existiert.
	public String toString() {
		return String.format("Name: %s\nVorname: %s\nAlter: %s", name, vorname, alter);
	}

	@Override
	public boolean methode() {
		System.out.println("diese Methode ist abstaract und muss neue definiert werden");
		return true;

	}

}
