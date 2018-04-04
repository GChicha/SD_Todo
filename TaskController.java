import java.util.ArrayList;
import java.util.List;

public class TaskController {
	public List<Task> taskList = new ArrayList<Task>();

	public TaskController() {}

	public void addTask(Task task) {
		this.taskList.add(task);
	}

	public List<Task> getTaskList() {
		return this.taskList;
	}

	public void removeTask(int id) {
		this.taskList.remove(id);
	}

	public void doTask(int id) {
		this.taskList.get(id).doTask();
	}
}
