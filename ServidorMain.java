import java.rmi.Naming;

public class ServidorMain {
	public ServidorMain() {
		try {
			Servidor servidor = new ServidorImpl();
			Naming.rebind("//127.0.0.1:6666/todo", servidor);
		} catch (Exception e) {
			System.out.println(e);	
		}
	}

	public static void main(String[] args) {
		new ServidorMain();
	}
}
