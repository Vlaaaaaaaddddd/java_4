package Second;

public class Main {
    public static void main(String[] args) {
        Task t1 = new StudyTask("Лабораторная №2",
                "Сдать код", 1,
                "2026-11-01", "В процессе",
                "Программирование");
        Task t2 = new WorkTask("Презентация",
                "Сделать слайды", 2,
                "2026-11-05", "Новая",
                "Редизайн сайта");
        Task t3 = new PersonalTask("Тренировка",
                "Пробежка 5 км", 3,
                "2026-10-30", "Запланировано",
                "Парк");

        System.out.println(t1.getDescription());
        System.out.println(t2.getDescription());
        System.out.println(t3.getDescription());
    }
}