package Fourth;

public class Main {
    public static void main(String[] args) {
        Task[] tasks = new Task[] {
                new StudyTask("Лабораторная №4", "Сдать код на проверку", 1, "2026-11-01", "В процессе", "Программирование"),
                new StudyTask("Курсовая работа", "Написать второй раздел", 2, "2026-12-10", "Новая", "Базы данных"),

                new WorkTask("Презентация", "Сделать слайды для спринта", 2, "2026-11-05", "В процессе", "Редизайн сайта"),
                new WorkTask("Баг-фикс", "Исправить авторизацию клиентов", 1, "2026-10-31", "Выполнена", "Мобильное приложение"),

                new PersonalTask("Тренировка", "Пробежка 5 км", 3, "2026-10-30", "Выполнена", "Парк"),
                new PersonalTask("Визит к врачу", "Плановый осмотр", 1, "2026-11-03", "В процессе", "Клиника")
        };

        int inProgressCount = 0;
        int completedCount = 0;

        for (Task task : tasks) {
            System.out.println("Информация: " + task.toString());

            System.out.println("Описание:  " + task.getDescription());

            if ("В процессе".equalsIgnoreCase(task.getStatus())) {
                inProgressCount++;
            } else if ("Выполнена".equalsIgnoreCase(task.getStatus())) {
                completedCount++;
            }
        }

        double inProgressRate = ((double) inProgressCount / tasks.length) * 100.0;
        double completionRate = ((double) completedCount / tasks.length) * 100.0;

        System.out.println("Результаты: ");
        System.out.printf("Всего задач: %d%n", tasks.length);
        System.out.printf("Задач в работе: %d (коэффициент активной загрузки: %.1f%%)%n",
                inProgressCount, inProgressRate);
        System.out.printf("Завершённых задач: %d (процент выполнения: %.1f%%)%n",
                completedCount, completionRate);
    }
}