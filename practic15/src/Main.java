// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private static Student retrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Влад");
        student.setRollNo("337");
        return student;
    }
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        }
    }
