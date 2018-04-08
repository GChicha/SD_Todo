import java.rmi.RemoteException;
import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;

public class ServidorMain {
	public static void main(String[] args) {
		try {
			Naming.rebind("//localhost:1099/Todo", new ServidorImpl());
		} catch (Exception e) {
			System.out.println(e);	
			System.exit(-1);
		}
	}
}
