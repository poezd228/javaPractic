public class LabClass {
    Student[] students = new Student[5];

    public void addStudent(Student[] students1, Student student) {
        Student[] newStudents = new Student[students1.length + 1];
        System.arraycopy(students1, 0, newStudents, 0, students1.length);
        newStudents[newStudents.length-1] = student;

        students = newStudents;
    }



    public static void labClass() {

        Student student = new Student("Влад", 20);
    }
}
