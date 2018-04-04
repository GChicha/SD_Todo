import java.rmi.RemoteException;
import java.util.List;

public interface Servidor {
	public void addTask(Task task);
	public void doneTask(int id);
	public List<Task> listTask();
}
