package Third;

import java.util.Objects;

public class Person {
    private String name;
    private double weight;
    private double height;

    public Person (String name, double weight, double height){
        this.name = name;
        if (weight <= 0 || height <= 0) {
            throw new IllegalArgumentException("Вес и рост должны быть положительными числами");
        }
        this.weight = weight;
        this.height = height;
    }
    public double calculateBmi(){
        return this.weight / (this.height * this.height);
    }

    public String getCategory(){
        double bmi = calculateBmi();

        if (bmi < 18.5) {
            return "Недостаточная масса тела";
        } else if (bmi < 25.0) {
            return "Нормальная масса тела";
        } else if (bmi < 30.0) {
            return "Избыточная масса тела";
        } else {
            return "Ожирение";
        }
    }

    public String getName(){
        return this.name;
    }
    public double getWeight(){
        return this.weight;
    }
    public double getHeight(){
        return this.height;
    }

    @Override
    public String toString() {
        return "Имя: " + this.name +
                ", вес: " + this.weight + " кг" +
                ", рост: " + this.height + " м" +
                ", ИМТ: " + calculateBmi();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person that = (Person) o;

        return Objects.equals(name, that.name) &&
                Double.compare(weight, that.weight) == 0 &&
                Double.compare(height, that.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, height);
    }
}
