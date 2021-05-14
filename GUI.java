import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener {
    //Declaring everything over here so that it can be used by ever class
    private JFrame frame = new JFrame();
    JLabel averageLabel = new JLabel("");//This is set to nothing in order to be invisible
    private static JLabel subject1Label;
    private static JLabel subject2Label;
    private static JLabel subject3Label;
    private static JLabel subject4Label;
    private static JLabel instructions;
    private static JLabel emptylabel;
    private static JTextField subject1Box;
    private static JTextField subject2Box;
    private static JTextField subject3Box;
    private static JTextField subject4Box;
    private static JButton button;

    public GUI() {


        //Textboxes to input average
        subject1Box = new JTextField(20);
        subject1Box.setBounds(100, 20, 165, 25);
        subject2Box = new JTextField(20);
        subject2Box.setBounds(100, 55, 165, 25);
        subject3Box = new JTextField(20);
        subject3Box.setBounds(100, 80, 165, 25);
        subject4Box = new JTextField(20);
        subject4Box.setBounds(100, 105, 165, 25);

        // Button which Calculates the average when pressed
        button = new JButton("Calculate");
        button.setBounds(100, 145, 165, 25);
        button.addActionListener(this);

        //Labels specifying what each text box should contain
        subject1Label = new JLabel("                            Subject 1");
        subject1Label.setBounds(50, 20, 80, 25);
        subject2Label = new JLabel("                            Subject 2");
        subject2Label.setBounds(50, 20, 80, 25);
        subject3Label = new JLabel("                            Subject 3");
        subject3Label.setBounds(50, 20, 80, 25);
        subject4Label = new JLabel("                            Subject 4");
        subject4Label.setBounds(50, 20, 80, 25);
        instructions = new JLabel("                 Enter you marks");
        instructions.setBounds(50, 20, 80, 25);
        emptylabel = new JLabel("");

        // The main user window is created (adds button, lables, textboxes)
        JPanel window = new JPanel();
        window.setBackground(Color.decode("9226229"));  //Specified the color decimal
        window.setBorder(BorderFactory.createEmptyBorder(70, 0, 100, 55));
        window.setLayout(new GridLayout(0, 2));
        window.add(emptylabel);
        window.add(instructions);
        window.add(subject1Label); 
        window.add(subject1Box);
        window.add(subject2Label);
        window.add(subject2Box);
        window.add(subject3Label);
        window.add(subject3Box);
        window.add(subject4Label);
        window.add(subject4Box);
        window.add(averageLabel);
        window.add(button);

        // Assembles, adjusts and packs the main window and displays it
        frame.add(window, BorderLayout.CENTER);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Average calculator");
        frame.pack();
        frame.setVisible(true);
    }

    // Action for when the button is clicked (Calculate the average and display it)
    public void actionPerformed(ActionEvent e) {
        float num1 = Float.parseFloat(subject1Box.getText());  //Converts strings in the boxes to floats
        float num2 = Float.parseFloat(subject2Box.getText());
        float num3 = Float.parseFloat(subject3Box.getText());
        float num4 = Float.parseFloat(subject4Box.getText());
        float average = (num1 + num2 + num3 + num4)/4;         //Converts float to strng vvvv
        averageLabel.setText("                Your average is:  " + String.valueOf(average));
    }

    // Makes the Frame (Window)
    public static void main(String[] args) {
        new GUI();
    }
}

