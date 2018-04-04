import java.rmi.RemoteException;

public interface Servidor {
	public void addTodo(Task task);
	public void doneTask(int id);
	public list<Task> listTask();
}
