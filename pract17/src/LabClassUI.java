import javax.swing.*;

public class LabClassUI extends JFrame {

    JFrame labclass = new JFrame();

    JButton sortStudents = new JButton("Отсортировать студентов по баллу");
    public LabClassUI(){
        add(sortStudents);
        setSize(300,300);
        setVisible(true);
    }


}
