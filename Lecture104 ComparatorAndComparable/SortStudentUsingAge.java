import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

}

public class SortStudentUsingAge {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 21));
        students.add(new Student("Alice", 19));
        students.add(new Student("Bob", 22));
        students.add(new Student("Mark", 21));

        Comparator<Student> com = new Comparator<Student>() {

            public int compare(Student i, Student j) {
                if (i.age > j.age) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(students, com);
        System.out.println(students);
    }
}
