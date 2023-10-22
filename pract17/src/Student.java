public class Student{
    private String Name;
    private int mark;

    Student(String Name, int mark){
        this.Name = Name;
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public String getName() {
        return Name;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setName(String name) {
        Name = name;
    }
}


