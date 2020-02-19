import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import java.awt.*;

public class Signup extends JFrame implements ActionListener {
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15;
    JTextField textField1,textField2,textField3,textField4,textField5,textField6,textField7;
    JRadioButton radioButton1,radioButton2,radioButton3,radioButton4,radioButton5;
    JButton button;
    JComboBox comboBox1,comboBox2,comboBox3;

    Random random = new Random();
    long first4 = (random.nextLong() % 9000L) + 1000L;
    long first = Math.abs(first4);

    Signup(){
        setFont(new Font("System", Font.BOLD, 22));
        Font font = getFont();
        FontMetrics fontMetrics = getFontMetrics(font);
        int x = fontMetrics.stringWidth("NEW ACCOUNT APPLICATION FORM");
        int y = fontMetrics.stringWidth(" ");
        int z = getWidth() - x;
        int w = z/y;
        String pad = "";
        pad = String.format("%"+w+"s", pad);
        setTitle(pad+"NEW ACCOUNT APPLICATION FORM");

        label1 = new JLabel("APPLICATION FORM NO. "+first);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));

        label2 = new JLabel("Page 1: Personal Details");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));

        label3 = new JLabel("Name:");
        label3.setFont(new Font("Raleway", Font.BOLD, 20));

        label4 = new JLabel("Father's Name:");
        label4.setFont(new Font("Raleway", Font.BOLD, 20));

        label5 = new JLabel("Date of Birth:");
        label5.setFont(new Font("Raleway", Font.BOLD, 20));

        label6 = new JLabel("Gender:");
        label6.setFont(new Font("Raleway", Font.BOLD, 20));

        label7 = new JLabel("Email Address:");
        label7.setFont(new Font("Raleway", Font.BOLD, 20));

        label8 = new JLabel("Marital Status:");
        label8.setFont(new Font("Raleway", Font.BOLD, 20));

        label9 = new JLabel("Address:");
        label9.setFont(new Font("Raleway", Font.BOLD, 20));

        label10 = new JLabel("City:");
        label10.setFont(new Font("Raleway", Font.BOLD, 20));

        label11 = new JLabel("Pin Code:");
        label11.setFont(new Font("Raleway", Font.BOLD, 20));

        label12 = new JLabel("State:");
        label12.setFont(new Font("Raleway", Font.BOLD, 20));

        label13 = new JLabel("Date:");
        label13.setFont(new Font("Raleway", Font.BOLD, 20));

        label14 = new JLabel("Month:");
        label14.setFont(new Font("Raleway", Font.BOLD, 20));

        label15 = new JLabel("Year:");
        label15.setFont(new Font("Raleway", Font.BOLD, 20));

        textField1 = new JTextField();
        textField1.setFont(new Font("Raleway", Font.BOLD, 14));

        textField2 = new JTextField();
        textField2.setFont(new Font("Raleway", Font.BOLD, 14));

        textField3 = new JTextField();
        textField3.setFont(new Font("Raleway", Font.BOLD, 14));

        textField4 = new JTextField();
        textField4.setFont(new Font("Raleway", Font.BOLD, 14));

        textField5 = new JTextField();
        textField5.setFont(new Font("Raleway", Font.BOLD, 14));

        textField6 = new JTextField();
        textField6.setFont(new Font("Raleway", Font.BOLD, 14));

        textField7 = new JTextField();
        textField7.setFont(new Font("Raleway", Font.BOLD, 14));

        button = new JButton("Next");
        button.setFont(new Font("Raleway", Font.BOLD, 14));
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);

        radioButton1 = new JRadioButton("Male");
        radioButton1.setFont(new Font("Raleway", Font.BOLD, 14));
        radioButton1.setBackground(Color.WHITE);

        radioButton2 = new JRadioButton("Female");
        radioButton2.setFont(new Font("Raleway", Font.BOLD, 14));
        radioButton2.setBackground(Color.WHITE);

        radioButton3 = new JRadioButton("Married");
        radioButton3.setFont(new Font("Raleway", Font.BOLD, 14));
        radioButton3.setBackground(Color.WHITE);

        radioButton4 = new JRadioButton("Unmarried");
        radioButton4.setFont(new Font("Raleway", Font.BOLD, 14));
        radioButton4.setBackground(Color.WHITE);

        radioButton5 = new JRadioButton("Other");
        radioButton5.setFont(new Font("Raleway", Font.BOLD, 14));
        radioButton5.setBackground(Color.WHITE);

        String date[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        comboBox1 = new JComboBox(date);
        comboBox1.setBackground(Color.WHITE);

        String month[] = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
        comboBox2 = new JComboBox(month);
        comboBox2.setBackground(Color.WHITE);

        String year[] = {"2000", "2001", "2002", "2003", "2004", "2005", "2006"};
        comboBox3 = new JComboBox(year);
        comboBox3.setBackground(Color.WHITE);

        setLayout(null);
        label1.setBounds(140,20,600,40);
        add(label1);
        label2.setBounds(290, 70,600,30);
        add(label2);
        label3.setBounds(100, 140, 100, 30);
        add(label3);

        textField1.setBounds(300,140,400,30);
        add(textField1);

        label4.setBounds(100,190,200,30);
        add(label4);

        textField2.setBounds(300,190,400,30);
        add(textField2);

        label5.setBounds(100, 240,200, 30);
        add(label5);

        label13.setBounds(300, 240, 40,30);
        add(label3);

        comboBox1.setBounds(340,240,60,30);
        add(comboBox1);

        label14.setBounds(410,240,50,30);
        add(label4);

        comboBox2.setBounds(460, 240, 100, 30);
        add(comboBox2);

        label15.setBounds(570, 240, 40,30);
        add(label15);

        comboBox3.setBounds(610, 240, 90, 30);
        add(comboBox3);

        label6.setBounds(100, 290, 200, 30);
        add(label6);

        radioButton1.setBounds(300, 290, 60,30);
        add(radioButton1);

        radioButton2.setBounds(450, 290, 90, 30);
        add(radioButton2);

        label7.setBounds(100,340,200,30);
        add(label7);

        textField3.setBounds(300, 340, 400, 30);
        add(textField3);

        label8.setBounds(100, 390, 200, 30);
        add(label8);

        radioButton3.setBounds(300, 390, 100, 30);
        add(radioButton3);


        radioButton4.setBounds(450, 390, 300, 30);
        add(radioButton4);

        radioButton5.setBounds(635, 390, 100, 30);
        add(radioButton5);

        label9.setBounds(100, 440, 200, 30);
        add(label9);

        textField4.setBounds(300,440, 400, 30);
        add(textField4);

        label10.setBounds(100, 490, 200, 30);
        add(label10);

        textField5.setBounds(300, 490, 400, 30);
        add(textField5);

        label11.setBounds(100, 540, 200,30);
        add(label11);

        textField6.setBounds(300,540,400,30);
        add(textField6);

        label12.setBounds(100, 590,200,30);
        add(label12);

        textField7.setBounds(300, 590, 400, 30);
        add(textField7);

        button.setBounds(620, 660, 80, 30);
        add(button);
        button.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 850);
        setLocation(500,90);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String a = textField1.getText();
        String b = textField2.getText();

        String ac = (String)comboBox1.getSelectedItem();
        String bc = (String)comboBox2.getSelectedItem();
        String cc = (String)comboBox3.getSelectedItem();

        String d = null;
        if(radioButton1.isSelected()){
            d = "Male";
        }
        else if(radioButton2.isSelected()){
            d = "Female";
        }

        String e = textField3.getText();
        String f = null;
        if(radioButton3.isSelected()){
            f = "Married";
        }
        else if(radioButton4.isSelected()){
            f = "Unmarried";
        }else if(radioButton5.isSelected()){
            f = "Other";
        }

        String g = textField4.getText();
        String h = textField5.getText();
        String i = textField6.getText();
        String j = textField7.getText();

        try{
            if(textField6.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required Fields");
            }else{
                conn connection = new conn();
                String q1 = "insert into signup values('"+a+"','"+b+"','"+ac+"','"+bc+"','"+cc+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"','"+first+"')";
                connection.statement.executeUpdate(q1);

                new Signup2().setVisible(true);
                setVisible(false);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup().setVisible(true);
    }
}
