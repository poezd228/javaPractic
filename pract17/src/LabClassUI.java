import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabClassUI extends JFrame {

    JTextField searchStudent = new JTextField(30);
    JTextField searchedStudent = new JTextField(30);


    JTextArea textField = new JTextArea("Не отсортированные студенты \n");

    JTextArea sortedTextfield = new JTextArea(" Отсортированный массив");

    JButton sortStudents = new JButton("Отсортировать студентов по баллу");

    public LabClassUI() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        //super("Программа");

        panel.add(sortedTextfield, BorderLayout.EAST);
        panel.add(sortStudents, BorderLayout.SOUTH);
        panel.add(textField, BorderLayout.EAST);
        panel.add(searchedStudent, BorderLayout.NORTH);
        panel.add(searchStudent, BorderLayout.SOUTH);
        setContentPane(panel);
        setSize(600,400);
        setVisible(true);
        LabClass labClass = new LabClass();
        labClass.labClass();
        //sortStudents.setSize(100, 100);
        //textField.setText(labClass.toString(labClass.getStudent()));
        for (Student student : labClass.getStudents()) {
            textField.append(labClass.StudentToString(student));
        }
        textField.setEditable(false);
        sortedTextfield.setEditable(false);
        searchedStudent.setEditable(false);
        searchStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Student student;
                try {
                    student = labClass.searchStudentByName(searchStudent.getText());
                    searchedStudent.setText("Найденный студент "+labClass.StudentToString(student));

                } catch (StudentNotFoundException exception) {
                    System.out.println(exception.getMessage());


                }
            }
        });


        sortStudents.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labClass.sortStudent();
                sortedTextfield.setText("Отсортированный массив" + "\n");
                for (Student student : labClass.getStudents()) {
                    sortedTextfield.append(labClass.StudentToString(student));
                }

                //sortedTextfield.setText(labClass.toString(labClass.getStudent()));


            }
        });


    }


}
