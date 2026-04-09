import javax.swing.*;

class MarvellousMain
{
    public static void main(String arg[])
    {
        try
        {
            MarvellousLogin frame = new MarvellousLogin();
            frame.setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}