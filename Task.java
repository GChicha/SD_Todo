import java.io.Serializable;

public class Task implements Serializable {
	public String description;
	public boolean done;

	public Task(String desc) {
		super();
		this.description = desc;	
		this.done = false;
	}

	public Task(String desc, boolean done) {
		super();
		this.description = desc;
		this.done = done;
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

	public String toString() {
		return this.description + " " + ((this.done == true) ? "X" : "--");
	}
}
