/*
* Surya Dantuluri
* February 8,2017
*  Masterpiece.java
* Simple program that finds out slope and y-intercept depending on inputted equation
* Uses printf() and format, if and else, do while loops
* Uses double, integer, character, and float.
* Uses Scanner class
*
* initializes all needed variables
* input equation
* output trimmed equation, and form of line
* output slope and y-intercept
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

    public class MasterHome extends JFrame
    {

        public static void main (String[]args)
        {
            MasterHome mp = new MasterHome();
        }

        public MasterHome()
        {
        super("MasterHome");
        setSize(900,900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(0,0);
        setResizable(true);

        Panel pan = new Panel();
        setContentPane(pan);
        setVisible(true);
        }


    class Panel extends JPanel
    {

        public Panel()
        {
            setBackground(Color.BLUE);
        }

        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);

            g.setColor(Color.RED);
            g.fillRect(120,120,160,160);
            g.setColor(Color.ORANGE);
            //SHUITASDAOSDJAOSDJAOSDIJSADSJDOASJDOASJDOSAIJDOIASJDOSAIDJOSAIDJOSAIDJSAO
            g.fillOval (120, 100, 50, 50);
            g.drawLine (30, 160, 130, 170);
            g.drawArc (30, 180, 50, 50, 60, 40);
            g.fillArc (120, 180, 50, 50, 60, 40);

    //COLOR purplo = new Color(255,0,255);




        }



    }
}
