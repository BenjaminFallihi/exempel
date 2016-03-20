import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DateiHandler {
	Scanner scann;

	DateiHandler(File f) {
		try {
			scann = new Scanner(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Mensch lesen() {
		if (scann.hasNext()) {
			String name = scann.next();
			String vorname = scann.next();
			int alter = scann.nextInt();
			int gross = scann.nextInt();
			int iq = scann.nextInt();
			return new Mensch(name, vorname, alter, gross, iq);
		}
		return null;
	}
	
	public void schliessen(){
		scann.close();
	}

}
