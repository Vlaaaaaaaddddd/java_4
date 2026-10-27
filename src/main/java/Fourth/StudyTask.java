package Fourth;

import java.util.Objects;

public class StudyTask extends Task {
    private String subject;

    public StudyTask(String title, String description,
                     int priority, String deadline,
                     String status, String subject) {
        super(title, description, priority, deadline, status);
        this.subject = subject;
    }

    @Override
    public String getDescription() {
        return "[Учеба | " + subject + "] " + getTitle() + " (статус: " + getStatus() + ")";
    }

    @Override
    public String toString() {
        return super.toString() + " [subject=" + subject + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        StudyTask studyTask = (StudyTask) o;
        return Objects.equals(subject, studyTask.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subject);
    }
}
