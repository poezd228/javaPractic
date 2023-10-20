public class Employee {

    private int WorkHours;

    private float efficiency;

    private int MoneyPerHours;

    public void setWorkHours(int hours){
        WorkHours = hours;
    }

    public void setEfficiency(float efficiency1){
        efficiency = efficiency1;
    }

    public void setMoneyPerHours(int money){
        MoneyPerHours = money;
    }

    public int getWorkHours(){
        return WorkHours;
    }

    public int getMoneyPerHours(){
        return MoneyPerHours;
    }

    public float getEfficiency(){
        return  efficiency;
    }


}
