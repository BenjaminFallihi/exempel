
public class TryCatch {
	
	/*
	 * 
	 */
	public int trycatch(int zahl1, int zahl2) {
		int zahl3 = 0;
		try {
			zahl3 = zahl1 / zahl2;
		} catch (Exception e) {
			System.out.println("ist ein Fehler aufgetreten" + e.toString());
			zahl3 = 0;
		}

		return zahl3;
	}

}
