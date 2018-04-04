public class TaskController {
	public List<Task> taskList = new ArrayList<Task>();

	public TaskController() {}

	public addTask(Task task) {
		this.taskList.add(task);
	}

	public List<Task> getTaskList() {
		return this.taskList;
	}

	public void removeTask(int id) {
		this.taskList.remove(id);
	}
}
