// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static Employee retriveEmployeeFromDataBase() {
        Employee employee = new Employee();
        employee.setWorkHours(30);
        employee.setEfficiency(0.85F);
        employee.setMoneyPerHours(2000);
        return employee;

    }

    public static void main(String[] args) {
        Employee model = retriveEmployeeFromDataBase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();


    }
}