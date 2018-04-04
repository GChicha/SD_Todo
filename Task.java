public class Task {
	public string description;
	public boolean done = false;

	public Task(String desc) {
		this.description = desc;	
	}

	public String getDesc() {
		return this.description;
	}

	public boolean isDone() {
		return this.done;
	}

	public void doTask() {
		this.done = true;
	}
}
