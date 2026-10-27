package Second;

import java.util.Objects;

public class Task {
    private String title;
    private String description;
    private int priority;
    private String deadline;
    private String status;

    public Task(String title, String description,
                int priority, String deadline, String status) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.deadline = deadline;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return "Задача: " + title + " (" + description + "), статус: " + status;
    }

    @Override
    public String toString() {
        return "Task{title='" + title + "', priority=" +
                priority + ", deadline='" + deadline + "', status='" +
                status + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return priority == task.priority &&
                Objects.equals(title, task.title) &&
                Objects.equals(description, task.description) &&
                Objects.equals(deadline, task.deadline) &&
                Objects.equals(status, task.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, priority, deadline, status);
    }
}
