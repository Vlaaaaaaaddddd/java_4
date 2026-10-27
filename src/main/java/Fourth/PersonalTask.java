package Fourth;

import java.util.Objects;

public class PersonalTask extends Task {
    private String location;

    public PersonalTask(String title, String description,
                        int priority, String deadline,
                        String status, String location) {
        super(title, description, priority, deadline, status);
        this.location = location;
    }

    @Override
    public String getDescription() {
        return "[Личное | Место: " + location + "] " +
                getTitle() + " (статус: " + getStatus() + ")";
    }

    @Override
    public String toString() {
        return super.toString() + " [location=" + location + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        PersonalTask that = (PersonalTask) o;
        return Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), location);
    }
}