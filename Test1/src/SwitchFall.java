
public class SwitchFall {

	public boolean faelle(String name) {
		switch (name) {
		case "Hund":
			System.out.println("Murat ist gemeint.");
			break;
		case "Lauch":
			System.out.println("Nahro ist gemeint.");
			break;
		case "Funktion0":
			System.out.println("Khaled ist gemeint.");
			break;
		default:
			System.out.println("Falscher Typ.");
			break;
		}
		return true;
	}

}
