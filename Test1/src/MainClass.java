import java.util.Scanner;

public class MainClass {
	static BreCon fakultet = new BreCon();
	static TypTyp vergleich = new TypTyp();
	static Scanner scan = new Scanner(System.in);
	static SwitchFall typsuchen = new SwitchFall();

	public static void main(String[] args) {
		int erg1;
		erg1 = fakultet.fakul(4);
		System.out.println(erg1);

		System.out.println(vergleich.bool(11, 13));

		int[] arry = new int[5];
		System.out.println(arry.length);

		String name;
		System.out.println("Geben Sie einen Typ ein:");
		name = scan.next();
		System.out.println(typsuchen.faelle(name));

	}

}
