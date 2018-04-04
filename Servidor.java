import java.rmi.RemoteException;
import java.util.List;

public interface Servidor extends java.rmi.Remote {
	public void addTask(Task task) throws RemoteException;
	public void doneTask(int id) throws RemoteException;
	public List<Task> listTask() throws RemoteException;
}
