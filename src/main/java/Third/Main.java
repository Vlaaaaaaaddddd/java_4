package Third;

public class Main {
    public static void main(String[] args) {
        Person singlePerson = new Adult("Константин", 85.0, 1.82, "высокий");
        System.out.println(singlePerson);
        System.out.println("Категория: " + singlePerson.getCategory());
        System.out.println();

        Person[] people = new Person[] {
                new Child("Артем", 30.0, 1.35, 9),
                new Child("София", 52.0, 1.55, 14),
                new Adult("Михаил", 86.0, 1.78, "высокий"),
                new Adult("Елена", 60.0, 1.68, "средний"),
                new Person("Иван", 74.0, 1.80)
        };


        for (Person p : people) {
            System.out.println(p.toString());
            System.out.println("Категория: " + p.getCategory());
        }

        Child c1 = new Child("Артем", 30.0, 1.35, 9);
        Child c2 = new Child("Артем", 30.0, 1.35, 9);
        Child c3 = new Child("Денис", 32.0, 1.38, 10);

        System.out.println("c1 равен c2: " + c1.equals(c2)); // true
        System.out.println("c1 равен c3: " + c1.equals(c3)); // false
        System.out.println("Хэш-код c1: " + c1.hashCode());
        System.out.println("Хэш-код c2: " + c2.hashCode());
        System.out.println("Хэши c1 и c2 совпадают: " + (c1.hashCode() == c2.hashCode()));
    }

}
