import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int id;
    private List<Subject> subjects;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public void printTranscript() {
        System.out.println("Информация для " + name + " (ID: " + id + ")");
        for (Subject subject : subjects) {
            System.out.println(subject.getName() + ": " + subject.getGrade());
        }
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}