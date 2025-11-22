import java.util.ArrayList;

public class StudentService {
    private ArrayList<Student> list = new ArrayList<>();

    public void addStudent(Student s) {
        list.add(s);
        System.out.println("Student Added Successfully!");
    }

    public void viewStudents() {
        if (list.isEmpty()) {
            System.out.println("No Students Found!");
            return;
        }
        for (Student s : list) {
            System.out.println(s);
        }
    }

    public Student searchStudent(int id) {
        for (Student s : list) {
            if (s.getId() == id)
                return s;
        }
        return null;
    }

    public void updateStudent(int id, String newName, String newCourse) {
        Student s = searchStudent(id);
        if (s != null) {
            s.setName(newName);
            s.setCourse(newCourse);
            System.out.println("Student Updated Successfully!");
        } else {
            System.out.println("Student Not Found!");
        }
    }

    public void deleteStudent(int id) {
        Student s = searchStudent(id);
        if (s != null) {
            list.remove(s);
            System.out.println("Student Deleted Successfully!");
        } else {
            System.out.println("Student Not Found!");
        }
    }
}
