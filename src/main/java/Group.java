import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Group {
    private String name;
    private ArrayList<Student> students;
    private HashMap<String, ArrayList<Integer>> grades;

    public Group(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.grades = new HashMap<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addGrade(String subject, int grade) {
        if (!this.grades.containsKey(subject)) {
            this.grades.put(subject, new ArrayList<>());
        }
        this.grades.get(subject).add(grade);
    }

    public void showGroupList() {
        System.out.println(this.name+":");
        for (Student student : this.students) {
            System.out.println(student.getName());
        }
        System.out.println(" ");
    }

    public void makeChanges() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ��� ��������: ");
        String name = scanner.nextLine();
        System.out.print("������� ����� ��� ��������: ");
        String newName = scanner.nextLine();
        for (Student student : this.students) {
            if (student.getName().equals(name)) {
                student.setName(newName);
                System.out.println("��� �������� ���������.\n");
                return;
            }
        }
        System.out.println("������� �� ������.\n");
    }

    public void viewStudentGradesBySubject() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ��� ��������: ");
        String name = scanner.nextLine();
        System.out.print("������� �������: ");
        String subject = scanner.nextLine();
        for (Student student : this.students) {
            if (student.getName().equals(name)) {
                if (this.grades.containsKey(subject)) {
                    ArrayList<Integer> grades = this.grades.get(subject);
                    System.out.println("������ �������� " + name + " �� ������� " + subject + ":");
                    for (int grade : grades) {
                        System.out.println(grade);
                    }
                } else {
                    System.out.println("������ �������� " + name + " �� ������� " + subject + " �����������.");
                }
                return;
            }
        }
        System.out.println("������� �� ������.");
    }

    public void getGroupReportBySubject() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� �������: ");
        String subject = scanner.nextLine();
        if (this.grades.containsKey(subject)) {
            ArrayList<Integer> grades = this.grades.get(subject);
            System.out.println("��������� �� ������� " + subject + ":");
            for (int i = 0; i < this.students.size(); i++) {
                Student student = this.students.get(i);
                int grade = grades.get(i);
                System.out.println(student.getName() + ": " + grade);
            }
        } else {
            System.out.println("������ �� ������� " + subject + " �����������.");
        }
    }
}