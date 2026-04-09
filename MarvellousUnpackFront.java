import javax.swing.*;
import java.awt.event.*;

class MarvellousUnpackFront extends JFrame implements ActionListener
{
    JTextField file;

    MarvellousUnpackFront()
    {
        setTitle("Unpack");
        setSize(400,200);
        setLayout(null);

        JLabel l = new JLabel("Packed File:");
        l.setBounds(50,50,100,30);
        add(l);

        file = new JTextField();
        file.setBounds(150,50,150,30);
        add(file);

        JButton btn = new JButton("Unpack");
        btn.setBounds(120,100,100,30);
        add(btn);

        btn.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        try
        {
            new MarvellousUnpack(file.getText());
            JOptionPane.showMessageDialog(this, "Unpacked Successfully");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
}