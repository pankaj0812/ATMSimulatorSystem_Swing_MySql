import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {
    JLabel label1, label2, label3;
    JTextField jTextField;
    JPasswordField jPasswordField;
    JButton jButton1, jButton2, jButton3;

    Login(){
        //Moves the title text to the center
        setFont(new Font("System", Font.BOLD, 22));
        Font font = getFont();
        FontMetrics fontMetrics = getFontMetrics(font);
        int x = fontMetrics.stringWidth("AUTOMATED TELLER MACHINE");
        int y = fontMetrics.stringWidth(" ");
        int z = getWidth() - x;
        int w = z/y;
        String pad = "";
        pad = String.format("%"+w+"s", pad);
        setTitle(pad+"AUTOMATED TELLER MACHINE");

        //Setting labels
        label1 = new JLabel("WELCOME TO ATM");
        label1.setFont(new Font("Osward", Font.BOLD, 38));

        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Raleway", Font.BOLD, 28));

        label3 = new JLabel("PIN:");
        label3.setFont(new Font("Raleway", Font.BOLD, 28));

        jTextField = new JTextField(15);
        jPasswordField = new JPasswordField(15);

        jButton1 = new JButton("SIGN IN");
        jButton1.setBackground(Color.BLACK);
        jButton1.setForeground(Color.WHITE);

        jButton2 = new JButton("CLEAR");
        jButton2.setBackground(Color.BLACK);
        jButton2.setForeground(Color.WHITE);

        jButton3 = new JButton("SIGN UP");
        jButton3.setBackground(Color.BLACK);
        jButton3.setForeground(Color.WHITE);

        //making the default layout to be null, hence
        // we can define our own custom layouts
        setLayout(null);

        label1.setBounds(175,50, 450, 200);
        add(label1);

        label2.setBounds(125, 150, 375, 200);
        add(label2);

        label3.setBounds(125, 225, 375, 200);
        add(label3);

        jTextField.setFont(new Font("Arial", Font.BOLD, 14));
        jTextField.setBounds(300, 235, 230, 30);
        add(jTextField);

        jPasswordField.setFont(new Font("Arial", Font.BOLD, 14));
        jPasswordField.setBounds(300, 310, 230, 30);
        add(jPasswordField);

        jButton1.setFont(new Font("Arial", Font.BOLD, 14));
        jButton1.setBounds(300, 400, 100, 30);
        add(jButton1);

        jButton2.setFont(new Font("Arial", Font.BOLD, 14));
        jButton2.setBounds(430, 400, 100, 30);
        add(jButton2);

        jButton3.setFont(new Font("Arial", Font.BOLD, 14));
        jButton3.setBounds(300, 450, 230, 30);
        add(jButton3);

        //Adds action listeners on the buttons
        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        jButton3.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(750, 750);
        setLocation(500, 200);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try{
            conn connection = new conn();
            String cardNo = jTextField.getText();
            String pinNo = jPasswordField.getText();

            String loginQuery = "select * from login where cardno = '"+ cardNo + "' and pin ='"+pinNo+"'";
            ResultSet resultSet = connection.statement.executeQuery(loginQuery);

            if(actionEvent.getSource() == jButton1){
                if(resultSet.next()){
                    new Transactions().setVisible(true);
                    setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Password");
                }
            } else if(actionEvent.getSource() == jButton2){
                    jTextField.setText("");
                    jPasswordField.setText("");
            }else if(actionEvent.getSource() == jButton3){
                    new Signup().setVisible(true);
                    setVisible(false);
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("error: "+e);
        }
    }

    public static void main(String[] args) {
        new Login().setVisible(true);
    }
}
