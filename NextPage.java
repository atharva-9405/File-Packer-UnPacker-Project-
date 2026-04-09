import javax.swing.*;
import java.awt.event.*;

class NextPage extends JFrame implements ActionListener
{
    JButton pack, unpack;

    NextPage(String user)
    {
        setTitle("Dashboard");
        setSize(400,300);
        setLayout(null);

        JLabel label = new JLabel("Welcome " + user);
        label.setBounds(120,30,200,30);
        add(label);

        pack = new JButton("Pack");
        pack.setBounds(80,100,100,30);
        add(pack);

        unpack = new JButton("Unpack");
        unpack.setBounds(200,100,100,30);
        add(unpack);

        pack.addActionListener(this);
        unpack.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == pack)
        {
            new MarvellousPackFront();
        }
        if(e.getSource() == unpack)
        {
            new MarvellousUnpackFront();
        }
    }
}