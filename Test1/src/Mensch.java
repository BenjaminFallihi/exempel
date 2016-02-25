
public class Mensch {
	int alter, gross, iq;
	String name, vorname;

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
	Mensch(String Name, String Vorname, int wieAlt, int wieGross, int wieSchlau) {

		this.name = Name;
		this.vorname = Vorname;
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

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

}
