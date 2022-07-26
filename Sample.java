import java.awt.*;
import java.awt.event.*;
import java.util.*;


class MyFrame extends Frame implements ActionListener
{
    public MyFrame()
    {
        super("Compiler");
        Button b = new Button("change color");
        this.add(b,BorderLayout.SOUTH);
        b.addActionListener(this);
        this.setSize(500,500)  ;
        this.setVisible(true);
    }
    public void actionPerformed(ActiveEvent e )
    {
        Random x = new Random();
        float r = x.nextFloat();
        float g = x.nextFloat();
        float b = x.nextFloat();
        Color c = new Color( r,g,b);
        this.setBackground();


    }
}
class Sample
{
    public static void main(String args[])
    {
        new MyFrame();
    }