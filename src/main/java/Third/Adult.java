package Third;

import java.util.Objects;

public class Adult extends Person{
    private String activityLevel;

    public Adult(String name, double weight, double height, String activityLevel){
        super(name, weight, height);

        boolean isValid = "низкий".equalsIgnoreCase(activityLevel)
                || "средний".equalsIgnoreCase(activityLevel)
                || "высокий".equalsIgnoreCase(activityLevel);

        if (!isValid) {
            throw new IllegalArgumentException("Уровень активности должен быть: 'низкий', 'средний' или 'высокий'");
        }
        this.activityLevel = activityLevel.toLowerCase();
    }

    public String getActivityLevel() {
        return this.activityLevel;
    }

    @Override
    public String getCategory() {
        String baseCategory = super.getCategory();

        if ("Избыточная масса тела".equals(baseCategory) && "высокий".equals(this.activityLevel)) {
            return "Развитая мышечная масса";
        }
        return baseCategory;
    }

    @Override
    public String toString() {
        return super.toString() + ", активность: " + this.activityLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Adult adult = (Adult) o;
        return Objects.equals(this.activityLevel, adult.activityLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.activityLevel);
    }
}
