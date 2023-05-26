import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Group group = new Group("������ 1");
        Student student1 = new Student("���� ������", 1);
        student1.addSubject(new Subject("����������", 4));
        student1.addSubject(new Subject("����������", 5));
        student1.addSubject(new Subject("�������", 4));
        group.addStudent(student1);

        Student student2 = new Student("���� ������", 2);
        student2.addSubject(new Subject("����������", 3));
        student2.addSubject(new Subject("����������", 5));
        student2.addSubject(new Subject("�������", 5));
        group.addStudent(student2);

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1. �������� ������ ������");
            System.out.println("2. ������ ���������");
            System.out.println("3. ����������� ������ �������� �� ��������");
            System.out.println("4. �������� ��������� ������ �� ��������");
            System.out.println("5. �����");
            System.out.print("�������� �����: ");
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
                    System.out.println("�����...");
                    break;
                default:
                    System.out.println("������������ �����. ��������� �����.");
                    break;
            }
        } while (choice != 5);
    }
}
