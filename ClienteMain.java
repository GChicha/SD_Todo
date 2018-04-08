import java.rmi.Naming;
import java.util.*;

public class ClienteMain {
	public static void main(String args[]) {
		try {
			Servidor s = (Servidor) Naming.lookup("//localhost:1099/Todo");

			if (args.length < 1 || args[0].equals("list")) {
				System.out.println(s.listTask());
			} else if (args.length > 1){
				if (args[0].equals("add")) {
					String taskDesc = "";
					for (int i = 1; i < args.length; i++) {
						taskDesc += args[i];
					}

					Task task = new Task(taskDesc);
					s.addTask(task);
				} else if (args[0].equals("do")) {
					s.doneTask(Integer.parseInt(args[1]));
				} else {
					throw new Exception("Errado");
				}
			} else {
				throw new Exception("Errado");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
