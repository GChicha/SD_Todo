import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.List;

public class ServidorImpl
	extends java.rmi.server.UnicastRemoteObject
	implements Servidor {
	private TaskController taskController = new TaskController(); 

	public ServidorImpl() throws java.rmi.RemoteException {
		super();
	}

	public List<Task> listTask() {
		return this.taskController.getTaskList();
	}

	public void doneTask(int id) {
		this.taskController.doTask(id);
	}

	public void addTask(Task task) {
		this.taskController.addTask(task);
	}
}
