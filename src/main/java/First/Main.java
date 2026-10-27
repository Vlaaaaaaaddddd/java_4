package First;

public class Main {
    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(1, 2, 4,6);
        Vector2D v2 = new Vector2D(5, 1, 7,4);

        // Сложение
        Vector2D sum = v1.add(v2);
        System.out.println(sum);

        // Скалярное произведение
        System.out.println(v1.scalar(v2));

        // Умножение на константу
        System.out.println(v1.multiply(2));

        // Длина
        System.out.println(v1.len());
    }
}
