import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MarvellousLogin extends JFrame implements ActionListener
{
    JButton SUBMIT;
    JTextField text1, text2;

    MarvellousLogin()
    {
        setTitle("Login");
        setSize(400,300);
        setLayout(null);

        JLabel l1 = new JLabel("Username:");
        l1.setBounds(50,50,100,30);
        add(l1);

        text1 = new JTextField();
        text1.setBounds(150,50,150,30);
        add(text1);

        JLabel l2 = new JLabel("Password:");
        l2.setBounds(50,100,100,30);
        add(l2);

        text2 = new JPasswordField();
        text2.setBounds(150,100,150,30);
        add(text2);

        SUBMIT = new JButton("Login");
        SUBMIT.setBounds(120,160,100,30);
        add(SUBMIT);

        SUBMIT.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        String user = text1.getText();
        String pass = text2.getText();

        if(user.equals("MarvellousAdmin") && pass.equals("MarvellousAdmin"))
        {
            new NextPage(user);
            this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Invalid Login");
        }
    }
}