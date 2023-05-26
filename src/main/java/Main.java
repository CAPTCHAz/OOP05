import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Group group = new Group("Группа 1");
        Student student1 = new Student("Иван Иванов", 1);
        student1.addSubject(new Subject("Математика", 4));
        student1.addSubject(new Subject("Английский", 5));
        student1.addSubject(new Subject("История", 4));
        group.addStudent(student1);

        Student student2 = new Student("Петр Петров", 2);
        student2.addSubject(new Subject("Математика", 3));
        student2.addSubject(new Subject("Английский", 5));
        student2.addSubject(new Subject("История", 5));
        group.addStudent(student2);

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1. Показать список группы");
            System.out.println("2. Внести изменения");
            System.out.println("3. Просмотреть оценки студента по предмету");
            System.out.println("4. Получить Ведомость группы по предмету");
            System.out.println("5. Выход");
            System.out.print("Выберете ответ: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    group.showGroupList();
                    break;
                case 2:
                    group.makeChanges();
                    break;
                case 3:
                    group.viewStudentGradesBySubject();
                    break;
                case 4:
                    group.getGroupReportBySubject();
                    break;
                case 5:
                    System.out.println("Выход...");
                    break;
                default:
                    System.out.println("Неправильный выбор. Поробуйте снова.");
                    break;
            }
        } while (choice != 5);
    }
}
