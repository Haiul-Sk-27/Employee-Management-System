import javax.swing.*;
import java.awt.*;
import java.awt.*;

public class Login extends JFrame {

    Login(){

        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel lblUserName = new JLabel("UserName");
        lblUserName.setBounds(40,20,100,30);
        add(lblUserName);

        JTextField tfuserName = new JTextField();
        tfuserName.setBounds(150,20,150,30);
        add(tfuserName);

        JLabel lnlPassword = new JLabel("password");
        lnlPassword.setBounds(40,70,100,30);
        add(lnlPassword);

        JTextField tfpassword = new JTextField();
        tfpassword.setBounds(150,70,150,30);
        add(tfpassword);

        JButton login = new JButton("LOGIN");
        login.setBounds(150,140,150,30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        add(login);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);

        setSize(600,300);
        setLocation(450,200);
        setVisible(true);
    }

    public static void main (String[] args){
        new Login();
    }
}
