import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that) {

        if (this.age > that.age) {
            return 1;
        } else {
            return -1;
        }
    }

}

public class SortStudentUsingComparable {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 21));
        students.add(new Student("Alice", 19));
        students.add(new Student("Bob", 22));
        students.add(new Student("Mark", 21));
        Collections.sort(students);
        System.out.println(students);
    }
}
