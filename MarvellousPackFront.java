import javax.swing.*;
import java.awt.event.*;

class MarvellousPackFront extends JFrame implements ActionListener
{
    JTextField dir, dest;

    MarvellousPackFront()
    {
        setTitle("Pack Files");
        setSize(400,300);
        setLayout(null);

        JLabel l1 = new JLabel("Directory:");
        l1.setBounds(50,50,100,30);
        add(l1);

        dir = new JTextField();
        dir.setBounds(150,50,150,30);
        add(dir);

        JLabel l2 = new JLabel("Output File:");
        l2.setBounds(50,100,100,30);
        add(l2);

        dest = new JTextField();
        dest.setBounds(150,100,150,30);
        add(dest);

        JButton btn = new JButton("Pack");
        btn.setBounds(120,160,100,30);
        add(btn);

        btn.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        try
        {
            new MarvellousPacker(dir.getText(), dest.getText());
            JOptionPane.showMessageDialog(this, "Packing Done");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
}