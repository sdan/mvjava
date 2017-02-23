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

    public class GraphicsQuiz1 extends JFrame
    {

        public static void main (String[]args)
        {
            GraphicsQuiz1 gq1 = new GraphicsQuiz1();
        }

        public GraphicsQuiz1()
        {
        super("GraphicsQuiz1");
        setSize(700,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(0,20);
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

            for (int y=0; y<=650; y+=10){
            for (int x = 0; x <=650; x+=10){
            g.drawOval( x, y, 10, 10);
            }}




        }



    }
}