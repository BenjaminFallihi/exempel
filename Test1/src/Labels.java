
public class Labels {

	public static void main(String[] args) {
		long beiZahl = 0;
		int zeilenumbruch = 0;
		final int MAXIMALZEILEN = 100;

		whileSchleife: while (true) {

			beiZahl++;
			
			for (int i = 2; i < beiZahl; i++) {
				if (beiZahl % i == 0) {
					continue whileSchleife;//springt zu der Zeile 8 whileSchleife
				}
			}

			System.out.print(beiZahl + " ; ");
			zeilenumbruch++;

			if (zeilenumbruch >= MAXIMALZEILEN) {
				zeilenumbruch = 0;
				System.out.println();
			}
			
			if (beiZahl >= 10) {
				break;
			}

		}
	}

}
