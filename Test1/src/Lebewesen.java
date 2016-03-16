
public abstract class Lebewesen {
	int alter;
	String vorname, input;

	/*
	 * diese Methode muss nicht definiert werden. alle klassen, die diese klasse
	 * erben, müssen die Methode neue definieren.
	 */
	public abstract boolean methode();

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
