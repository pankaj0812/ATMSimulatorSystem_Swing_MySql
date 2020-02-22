import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Signup2 extends JFrame implements ActionListener {
    JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12;
    JButton button;
    JRadioButton radioButton1, radioButton2, radioButton3, radioButton4;
    JTextField textField1, textField2, textField3;
    JComboBox comboBox1, comboBox2, comboBox3, comboBox4, comboBox5;

    Signup2(){
        setFont(new Font("System", Font.BOLD, 22));
        Font font = getFont();
        FontMetrics fontMetrics = getFontMetrics(font);
        int x = fontMetrics.stringWidth("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        int y = fontMetrics.stringWidth(" ");
        int z = getWidth()/2 - (x/2);
        int w = z/y;
        String pad = "";
        pad = String.format("%"+w+"s",pad);
        setTitle(pad+"NEW ACCOUNT APPLICATION FORM - PAGE 2");

        label1 = new JLabel("Page 2: Additional Details");
        label1.setFont(new Font("Raleway", Font.BOLD, 22));

        label2 = new JLabel("Religion:");
        label2.setFont(new Font("Raleway", Font.BOLD, 18));

        label3 = new JLabel("Category:");
        label3.setFont(new Font("Raleway", Font.BOLD, 18));

        label4 = new JLabel("Income:");
        label4.setFont(new Font("Raleway", Font.BOLD, 18));

        label5 = new JLabel("Educational");
        label5.setFont(new Font("Raleway", Font.BOLD, 18));

        label11 = new JLabel("Qualification:");
        label11.setFont(new Font("Raleway", Font.BOLD, 18));

        label6 = new JLabel("Occupation:");
        label6.setFont(new Font("Raleway", Font.BOLD, 18));

        label7 = new JLabel("PAN Number:");
        label7.setFont(new Font("Raleway", Font.BOLD, 18));

        label8 = new JLabel("Aadhar Number:");
        label8.setFont(new Font("Raleway", Font.BOLD, 18));

        label9 = new JLabel("Senior Citizen:");
        label9.setFont(new Font("Raleway", Font.BOLD, 18));

        label10 = new JLabel("Existing Account:");
        label10.setFont(new Font("Raleway", Font.BOLD, 18));

        label12 = new JLabel("Form No:");
        label12.setFont(new Font("Raleway", Font.BOLD, 13));


        button = new JButton("Next");
        button.setFont(new Font("Raleway", Font.BOLD, 14));
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);

        textField1 = new JTextField();
        textField1.setFont(new Font("Raleway", Font.BOLD, 14));

        textField2 = new JTextField();
        textField2.setFont(new Font("Raleway", Font.BOLD, 14));

        textField3 = new JTextField();
        textField3.setFont(new Font("Raleway", Font.BOLD, 14));

        radioButton1 = new JRadioButton("Yes");
        radioButton1.setFont(new Font("Raleway", Font.BOLD, 14));
        radioButton1.setBackground(Color.WHITE);

        radioButton2 = new JRadioButton("No");
        radioButton2.setFont(new Font("Raleway", Font.BOLD, 14));
        radioButton2.setBackground(Color.WHITE);

        radioButton3 = new JRadioButton("Yes");
        radioButton3.setFont(new Font("Raleway", Font.BOLD, 14));
        radioButton3.setBackground(Color.WHITE);

        radioButton4 = new JRadioButton("No");
        radioButton4.setFont(new Font("Raleway", Font.BOLD, 14));
        radioButton4.setBackground(Color.WHITE);

        String religion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        comboBox1 = new JComboBox(religion);
        comboBox1.setBackground(Color.WHITE);
        comboBox1.setFont(new Font("Raleway", Font.BOLD, 14));

        String category[] = {"General", "OBC", "SC", "ST", "Other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(Color.WHITE);
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));

        String income[] = {"Null", "<1,50,000", "<2,50,000", "<5,00,000", "Above 5,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(Color.WHITE);
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));

        String education[] = {"Non-Graduate", "Graduate", "Post graduate", "Doctorate", "Others"};
        comboBox4 = new JComboBox(education);
        comboBox4.setBackground(Color.WHITE);
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));

        String occupation[] = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Others"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(Color.WHITE);
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));

        setLayout(null);

        label12.setBounds(700, 10, 60, 30);
        add(label12);

        textField3.setBounds(760, 10, 60, 30);
        add(textField3);

        label1.setBounds(280, 30, 600, 40);
        add(label1);

        label2.setBounds(100, 120, 100, 30);
        add(label2);

        comboBox1.setBounds(350, 120, 320, 30);
        add(comboBox1);

        label3.setBounds(100, 170, 100, 30);
        add(label3);

        comboBox2.setBounds(350, 170, 320, 30);
        add(comboBox2);

        label4.setBounds(100, 220, 100, 30);
        add(label4);

        comboBox3.setBounds(350, 220, 320, 30);
        add(comboBox3);

        label5.setBounds(100, 270, 150, 30);
        add(label5);

        comboBox4.setBounds(350, 270, 320, 30);
        add(comboBox4);

        label11.setBounds(100, 290, 150, 30);
        add(label11);

        label6.setBounds(100, 340, 150, 30);
        add(label6);

        comboBox5.setBounds(350, 340, 320, 30);
        add(comboBox5);

        label7.setBounds(100, 390, 150, 30);
        add(label7);

        textField1.setBounds(350, 390, 320, 30);
        add(textField1);

        label8.setBounds(100, 440, 180, 30);
        add(label8);

        textField2.setBounds(350, 440, 320, 30);
        add(textField2);

        label9.setBounds(100, 490, 150, 30);
        add(label9);

        radioButton1.setBounds(350, 490, 100, 30);
        add(radioButton1);

        radioButton2.setBounds(460, 490, 100, 30);
        add(radioButton2);

        label10.setBounds(100, 540, 180, 30);
        add(label10);

        radioButton3.setBounds(350, 540, 100, 30);
        add(radioButton3);

        radioButton4.setBounds(460, 540, 100, 30);
        add(radioButton4);

        button.setBounds(570, 600, 100, 30);
        add(button);

        button.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 850);
        setLocation(500, 90);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String a = (String)comboBox1.getSelectedItem();
        String b = (String)comboBox2.getSelectedItem();
        String c = (String)comboBox3.getSelectedItem();
        String d = (String)comboBox4.getSelectedItem();
        String e = (String)comboBox5.getSelectedItem();

        String f = textField1.getText();
        String g = textField2.getText();

        String h ="";
        if(radioButton1.isSelected()){
            h ="Yes";
        }else if(radioButton2.isSelected()){
            h ="No";
        }

        String i = "";
        if(radioButton3.isSelected()){
            i ="Yes";
        }else if(radioButton4.isSelected()){
            i ="No";
        }

        String j = textField3.getText();

        try{
            if(textField2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required Fields");
            }else {
                conn connection = new conn();
                String query = "insert into signup2 values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"')";
                connection.statement.executeUpdate(query);

                new Signup3().setVisible(true);
                setVisible(false);
            }
        }catch (Exception e1){
            e1.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup2().setVisible(true);
    }
}
