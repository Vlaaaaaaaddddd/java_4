package Third;

import java.util.Objects;

public class Child extends Person {
    private int age;

    public Child(String name, double weight, double height, int age){
        super(name, weight, height);
        if (age <= 0 || age >= 18) {
            throw new IllegalArgumentException("Неверный возраст ребенка");
        }

        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public String getCategory() {
        double bmi = calculateBmi();
        double minNormal = 13.0 + 0.3 * this.age;
        double maxNormal = 17.0 + 0.4 * this.age;

        if (bmi < minNormal) {
            return "Недостаточная масса тела";
        } else if (bmi <= maxNormal) {
            return "Нормальная масса тела";
        } else {
            return "Избыточная масса тела";
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", возраст: " + this.age + " лет";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Child child = (Child) o;
        return this.age == child.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.age);
    }
}
