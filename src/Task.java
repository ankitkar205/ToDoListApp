public class Task {
    private final String description; // Made 'description' final
    private boolean isDone;

    // Constructor to create a new task with a description
    public Task(String description) {
        this.description = description;
        this.isDone = false; // By default, the task is not done
    }

    // Getter for the task description
    public String getDescription() {
        return description;
    }

    // Check if the task is done
    @SuppressWarnings("unused") // Suppress warning if 'isDone()' is not used yet
    public boolean isDone() {
        return isDone;
    }

    // Mark the task as done
    public void markAsDone() {
        isDone = true;
    }

    // Display the task with its status (done or not done)
    @Override
    public String toString() {
        String status = (isDone) ? "[✔️]" : "[ ]";
        return status + " " + description;
    }
}
