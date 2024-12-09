import java.util.ArrayList;

public class ToDoList {
    private final ArrayList<Task> tasks; // Made 'tasks' final

    // Constructor to initialize the task list
    public ToDoList() {
        tasks = new ArrayList<>(); // The reference is set once and cannot be changed
    }

    // Add a new task to the list
    public void addTask(String description) {
        Task newTask = new Task(description);
        tasks.add(newTask);
        System.out.println("Added: " + description);
    }

    // View all tasks in the list
    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Here are your tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    // Mark a task as done based on its position (index)
    public void markTaskAsDone(int taskIndex) {
        if (taskIndex < 0 || taskIndex >= tasks.size()) {
            System.out.println("Invalid task number.");
        } else {
            tasks.get(taskIndex).markAsDone();
            System.out.println("Marked task " + (taskIndex + 1) + " as done.");
        }
    }

    // Delete a task from the list
    public void deleteTask(int taskIndex) {
        if (taskIndex < 0 || taskIndex >= tasks.size()) {
            System.out.println("Invalid task number.");
        } else {
            System.out.println("Deleted task: " + tasks.get(taskIndex).getDescription());
            tasks.remove(taskIndex);
        }
    }
}
