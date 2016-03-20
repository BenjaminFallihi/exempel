import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class MainClass {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * 
		 */

		// BreCon fakultet = new BreCon();
		// int erg1;
		// erg1 = fakultet.fakul(4);
		// System.out.println(erg1);

		/*
		 * 
		 */
		// TypTyp vergleich = new TypTyp();
		// System.out.println(vergleich.bool(11, 13));

		/*
		 * 
		 */
		// int[] arry = { 4, 5, 6, 9, 10 };
		// System.out.println(arry.length);
		// for (int item : arry) {
		// item++;
		// System.out.println(item);
		// }

		/*
		 * 
		 */
		// int zahl1, zahl2;
		// System.out.println("Geben Sie eine Zahl ein:");
		// zahl1 = scan.nextInt();
		// System.out.println("Geben Sie eine Zahl ein:");
		// zahl2 =scan.nextInt();
		// String text = zahl1 < zahl2 ? "true" : "false";
		// System.out.println(text);

		/*
		 * 
		 */
		// SwitchFall typsuchen = new SwitchFall();
		// String typ;
		// System.out.println("Geben Sie einen Typ ein:");
		// typ = scan.next();
		// System.out.println(typsuchen.faelle(typ));

		/*
		 * 
		 */
		// ZufallZahl wurfel = new ZufallZahl();
		// System.out.println(wurfel.zufall());

		/*
		 * 
		 */
		// BreCon rekFakultet = new BreCon();
		// System.out.println(rekFakultet.rekFakul(4));

		/*
		 * 
		 */
		// System.out.println("Anzahl der Menschen: " +
		// Mensch.getAnzahlMenschen());
		// Mensch murat = new Mensch();
		// Mensch farshid = new Mensch("Fallihi", "Farshid", 27, 178, 124);
		// Mensch khaled = new Mensch("Shakib", "Khaled", 30, 170, 1);
		// System.out.println(farshid.name + " " + farshid.vorname);
		// System.out.println("Khaled sein IQ ist: " + khaled.iq);
		// System.out.println("Murat sein IQ ist: " + murat.iq);
		// khaled.wissen();
		// System.out.println("Khaled sein IQ ist: " + khaled.iq);
		// System.out.println("Anzahl der Menschen: " +
		// Mensch.getAnzahlMenschen());
		// System.out.println(farshid.toString());

		/*
		 * die Methode getAnzahlMenschen(); kann aufgerufen werden ohne, dass
		 * man ein Objekt erzeugt, weil es eine static Metode ist und an der
		 * Klasse Menschen gebunden ist.
		 */
		// System.out.println(Mensch.getAnzahlMenschen());

		/*
		 * 
		 */
		// FinalClass message = new FinalClass();
		// System.out.println(message.ausgabe());

		/*
		 * 
		 */
		// Mensch ausgabe = new Mensch();
		// System.out.println(ausgabe.methode());

		/*
		 * 
		 */
		// TryCatch ausgabe = new TryCatch();
		// int zahl1, zahl2, zahl3;
		// System.out.println("Geben Sie eine Zahl ein:");
		// zahl1 = scan.nextInt();
		// System.out.println("Geben Sie noch eine Zahl ein:");
		// zahl2 = scan.nextInt();
		// zahl3 = ausgabe.trycatch(zahl1, zahl2);
		// System.out.println(zahl3);

		/*
		 * 
		 */
		// File datei1 = new File("f://Test//java_test.txt");
		// if (!datei1.exists()) {
		// try {
		// Formatter datei = new Formatter("f://Test//java_test.txt");
		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// }
		// }
		
		/*
		 * 
		 */
		// File datei = new File("f://Test//Mensch.txt");
		// DateiHandler dh = new DateiHandler(datei);
		// Mensch p1 = dh.lesen();
		// System.out.println(p1.toString());
		// dh.schliessen();

	}

}
