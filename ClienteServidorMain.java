import java.util.Scanner;

public class ClienteServidorMain {
	public static void main(String[] args) {
		ServidorMain.main(null);

		Scanner scn = new Scanner(System.in);
		while(true) {
			String[] entrada = scn.nextLine().split(" ");
			ClienteMain.main(entrada);
		}
	}
}
