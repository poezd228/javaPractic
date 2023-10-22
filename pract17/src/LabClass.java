import java.util.Objects;
import java.util.random.RandomGenerator;

public class LabClass {
    public Student[] students = new Student[5];

    public void addStudent(Student[] students1, Student student) {
        Student[] newStudents = new Student[students1.length + 1];
        System.arraycopy(students1, 0, newStudents, 0, students1.length);
        newStudents[newStudents.length - 1] = student;

        students = newStudents;
    }

    public void sortStudent() {
        int n = students.length;
        for (int i = 1; i < n; ++i) {
            Student key = students[i];
            int j = i - 1;


            while (j >= 0 && students[j].getMark() > key.getMark()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }

    public Student[] getStudents() {
        return students;
    }

    public Student getStudent(int index) {
        return students[index];
    }

    public String StudentToString(Student student) {
        String allStudents = "";

        allStudents = allStudents + student.getName() + " ";
        allStudents = allStudents + student.getMark() + "\n";


        return allStudents;
    }

    public void labClass() {
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }

        for (Student student : students) {
            student.setMark(RandomGenerator.getDefault().nextInt(100));
            student.setName("Влад");
        }
    }

    public Student searchStudentByName(String name) throws StudentNotFoundException {
        for (Student students1 : students) {
            if (Objects.equals(students1.getName(), name)) {
                return students1;

            }
        }
        throw new StudentNotFoundException("Студент не найден");
        //засунь в ui try catch

    }



}
