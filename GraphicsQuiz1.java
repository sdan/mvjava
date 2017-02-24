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
        setSize(710,702);
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
            setBackground(Color.RED);
        }

        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);

            for (int y=0; y<=660; y+=30){
            for (int x = 0; x <=690; x+=30){
            g.drawOval( x, y, 20, 20);
            g.drawRect(x,y,26,26);
            g.fillArc(x+5,y+5,10,20,0,180);
          }} //end of for loops on x and y axis

        	g.setColor(Color.BLACK);

      int [] llx = {0, 200, 200, 0};
			int [] lly = {300, 200, 700, 700};
			g.fillPolygon(llx, lly, 4);



        }



    }
}
