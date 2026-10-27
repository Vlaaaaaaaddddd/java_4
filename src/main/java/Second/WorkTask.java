package Second;

import java.util.Objects;

public class WorkTask extends Task {
    private String project;

    public WorkTask(String title, String description,
                    int priority, String deadline,
                    String status, String project) {
        super(title, description, priority, deadline, status);
        this.project = project;
    }

    @Override
    public String getDescription() {
        return "[Работа | Проект: " + project + "] " +
                getTitle() + " (статус: " + getStatus() + ")";
    }

    @Override
    public String toString() {
        return super.toString() + " [project=" + project + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        WorkTask workTask = (WorkTask) o;
        return Objects.equals(project, workTask.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), project);
    }
}
