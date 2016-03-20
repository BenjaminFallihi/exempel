import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class DateiWrite {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);//ein Objekt der Klasse Scanner erzeugt
		System.out.println("Welche Datei soll gelesen werden?");
		String dateiname = s.next();//die Methode next() wird an dateiname zugewissen
		String dateiInhalt = "";
		Formatter x = null;
		File f = new File("f://Test//"+dateiname+".txt");//erzeugt ein Objekt mit dem Pfad
		if(f.exists()){//wird überprüft ob die Datei existiert
			try {
				Scanner leser = new Scanner(f);//erzeugen ein Oblekt und übergeben wir ihm den File f
				while(leser.hasNext()){//liest den Ihnhalt des Files bis es fertig ist
					dateiInhalt += leser.next()+" ";// der Inhalt des Files wird gelesen und gespeichert				
				}
				x = new Formatter(f);//erzeugt eine Datei mit der f File
				x.format("%s", dateiInhalt);// der Inhalt wird in der Datei geschrieben
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
		}else{
			try {
				x = new Formatter(f);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("Was soll rein geschrieben werden?");
		String neueEingabe = s.next();
		x.format("%s", neueEingabe);
		x.close();

	}

}
