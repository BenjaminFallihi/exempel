import java.util.Random;

public class ZufallZahl {

	public int zufall() {
		Random wurfel = new Random();

		int zahl = 0;

		zahl = wurfel.nextInt(5) + 1;

		return zahl;

	}

}
