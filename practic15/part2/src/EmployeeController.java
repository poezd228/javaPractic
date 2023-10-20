public class EmployeeController {

    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeWorkHours(int hours) {
        model.setWorkHours(hours);
    }

    public void setEmployeeMoneyPerHour(int money) {
        model.setMoneyPerHours(money);
    }

    public void setEmployeeEfficiency(float eff) {
        model.setEfficiency(eff);
    }

    public int GetEmployeeWorkHours() {
        return model.getWorkHours();
    }

    public int GetEmployeeMoneyPerHour() {
        return model.getMoneyPerHours();
    }

    public float GetEmployeeEfficiency() {
        return model.getEfficiency();
    }


    public void updateView() {
        view.PrintEmployeeView(model.getWorkHours(), model.getMoneyPerHours(), model.getEfficiency());

    }
}
