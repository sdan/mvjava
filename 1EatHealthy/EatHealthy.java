/*Surya Dantuluri
* April 17th 2017
*
* Digestive System Game
*
* Welcome screen starts and button is under title
*
* Human, health bar and foods are present. A drawing on the human pops up trying to signify that s(he) should  feed the human food.
*
* Should have 6 different classes signifying each of the stages: Mouth, Esophogous, Stomach, Duodenum, Small intestine, *Large intestine
*
*-------
* Game starts off with welcome screen.
* Human points to the food options on the right
* Health bar is shown.
* Virtual human player urges normal human player to eat food by showing food on the right.
*
WelcomePage panel shows up with the background
Asks for name and you press start Game
If name is not provided and they press start:::: give them alert asking them to enter a name






*/



// import javax.swing.JFrame;	//import javax.swing.*;
// import javax.swing.JPanel;
//
// //import java.awt.event.MouseEvent;
//
// import java.awt.Color;		//import java.awt.*;
// import java.awt.Font;
// import java.awt.Dimension;
///////////////////////// import Classes needed for Layouts ////////////////////////
// import java.awt.BorderLayout;
// import java.awt.GridLayout;
// import java.awt.CardLayout;
// import java.awt.FlowLayout;
// import javax.swing.JButton;
// import javax.swing.JRadioButton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import java.io.File;
import javax.swing.JFrame;	//import javax.swing.*;
import javax.swing.JPanel;

import java.awt.event.MouseListener;	// or import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.awt.Image; //imports graphics components with swing

import java.awt.Color;		//import java.awt.*;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Dimension;
///////////////////////// import Classes needed for Layouts ////////////////////////
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import java.io.BufferedWriter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;


public class EatHealthy extends JFrame
{
	private Image image;
	private PanelHolder pHolder;//panel holder
	private CardLayout cards;//card layout
	private FlowLayout flow;
	private BorderLayout border;
	private GridLayout grid;
	private String name;

	private InitializeGame initPan;
	private WelcomePage welcomePan;//welcome screen                      ADD THAT THE GOAL IS TO MAKE THE PERSON HAPPY
	private LandingPage landingPan;//where the user is most of the time
	// private HealthBarPanel healthyBar;//health bar panel in LandingPage
	// private FoodPanel foodyBar;//list of images regarding food in LandingPage
	// //Mouth, Esophogous, Stomach, Duodenum, Small intestine, *Large intestine
	// private MouthPanel mouthProcess;
	// private MouthQuestions mouthQuiz;
	// private EsophogousPanel esophogousProcess;
	// private EsophogousQuestions esophogousQuiz;
	// private StomachPanel stomachProcess;
	// private StomachQuestions stomachQuiz;
	// private SmallIntestinePanel smallIntestineProcess;
	// private SmallIntestineQuestions smallintestineQuiz;
	// private LargeIntestinePanel largeIntestineProcess;
	// private LargeIntestineQuestions largeIntestineQuiz;
	// private EndingPanel ending;
	public static void main(String[] args)
	{
		System.out.println("CheckPoint1");
		EatHealthy eaty = new EatHealthy();
	}

	public EatHealthy()
	{
		super("Eat Healthy!");
		//	setLayout(new BorderLayouyt());
		setSize(800, 800);		//will change later
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocation(0,0);
		setResizable(false);

		pHolder = new PanelHolder();
		cards = new CardLayout();
		flow = new FlowLayout();
		border = new BorderLayout();
		grid = new GridLayout();

		pHolder.setLayout(cards);

		welcomePan = new WelcomePage();
		landingPan = new LandingPage();
		//healthyBar = new HealthyBarPanel();
		//   foodyBar = new FoodPanel();
		//   mouthProcess = new MouthPanel();
		//   mouthQuiz = new MouthQuestions();
		//  esophogousProcess = new EsophogousPanel();
		//  esophogousQuiz = new EsophogousQuestions();
		//  stomachProcess = new StomachPanel();
		//  stomachQuiz = new StomachQuestions();
		//  smallIntestineProcess = new SmallIntestinePanel();
		//  smallintestineQuiz = new SmallIntestineQuestions();
		//  largeIntestineProcess = new LargeIntestinePanel();
		//  largeIntestineQuiz = new LargeIntestineQuestions();
		//  ending = new EndingPanel();


		pHolder.add(welcomePan, "WelcomePage");
		pHolder.add(landingPan, "LandingPage");
	 	//pHolder.add(healthyBar, "HealthyBarPanel");
		// pHolder.add(foodyBar, "FoodPanel");
		// pHolder.add(mouthProcess, "MouthPanel");
		// pHolder.add(mouthQuiz, "MouthQuestions");
		// pHolder.add(esophogousProcess, "EsophogousPanel");
		// pHolder.add(esophogousQuiz, "EsophogousQuestions");
		// pHolder.add(stomachProcess, "StomachPanel");
		// pHolder.add(stomachQuiz, "StomachQuestions");
		// pHolder.add(smallIntestineProcess, "SmallIntestinePanel");
		// pHolder.add(smallintestineQuiz, "SmallIntestineQuestions");
		// pHolder.add(largeIntestineProcess, "LargeIntestinePanel");
		// pHolder.add(largeIntestineQuiz, "LargeIntestineQuestions");
		// pHolder.add(ending, "EndingPanel");
		add(pHolder);
		setVisible(true);

		welcomePan.setBounds(0, 0, 800, 600);

	}

	class PanelHolder extends JPanel
	{
		public PanelHolder()
		{
			setBackground(Color.GREEN);
			System.out.print("PanelHolder");
		}                                //  Panel holder (Holds all the Panels,for the Card Layout)(essentially)
	}


	class WelcomePage extends JPanel
	{

		Image welcomeBackground = Toolkit.getDefaultToolkit().getImage("welcome.jpg");//getsImage from my computer using the get DefaultToolKit sets the background
		String name;
		String input;
		boolean tfinput;
		boolean noName;//asks for name
		boolean isPressed;
		JTextField enterName;

		public WelcomePage()
		{
			setLayout(flow);			//Card Layout made( needs more pseudocode)
			setBackground(Color.WHITE);
			InitializeGame initGame = new InitializeGame();                //Instantiate the Start Panel
			initGame.setBounds(0,200,500,200);
			 add(initGame);

			 enterName = new JTextField("Enter Name");
			 StartAction login = new StartAction();
			 enterName.addActionListener(login);
			 enterName.setBounds(0,600,10,10);
			 add(enterName);

 			//this is the text field handler

		}//end Constructor

		public void paintComponent(Graphics g)
		{                //graphics method header
			super.paintComponent(g);                        // draw Images first, draws background
			g.drawImage(welcomeBackground, 0,0,800,600,this);//this makes the image
			//g.drawImage(back, 0,0,600,400,this);
			Font font = new Font ("Sans", Font.BOLD, 30);//initializes font
			g.setFont(font);//sets font int graphics
			g.drawString("Welcome to the Eat Healthy Game!",100,100);//sets the string that is displayed on the panel
			System.out.println("paint");
			if(noName)
			{
				g.drawString("Please enter your name!",200,200);
				System.out.println("Name has not been entered");
				isPressed = false;
			}


		}//end of paintComponent

	}//end of welcomePage
		class InitializeGame extends JPanel
		{
			public InitializeGame()
			{
			setLayout(border);
			setBackground(Color.RED);//set background to yello


				JButton enterGameButton = new JButton("Start THE GAMEYY Game");
				StartAction login = new StartAction();
				enterGameButton.addActionListener(login);
				enterGameButton.setPreferredSize(new Dimension(100,50));
				add(enterGameButton, BorderLayout.CENTER);
				//added enterGameButton ActionListener
				//this is the button handler

			}
		}//end of InitializeGame


	class StartAction implements ActionListener
			{
				public void actionPerformed(ActionEvent e)
				{
					welcomePan.input = e.getActionCommand();

					if(e.getActionCommand().equals("Start THE GAMEYY Game"))
					{
						welcomePan.isPressed = true;
						//	String input = enterName.getText();
						System.out.println("THIS IS THE NAME AFTER THE BUTTONO");
						System.out.println(welcomePan.enterName.getText());
						if (welcomePan.enterName.getText() == null || welcomePan.enterName.getText().trim().isEmpty() || welcomePan.enterName.getText().equals("Enter Name"))
						{
							//if the textfield is empty and button is pressed
								 welcomePan.noName = true;
								 System.out.println("Start Action no NAmae");
								 repaint();
						}
						else if(welcomePan.noName==false&&welcomePan.isPressed==true)
						{
							cards.show(pHolder, "Landing Page");
							System.out.println("Goes to LandingPage");
						}
					}//end of if the BUTTON IS PRESSED

			}//end of action performed
		}//end of start action class




	//
	// class JButtonHandlerS implements ActionListener
	// {
	// 	public void actionPerformed(ActionEvent e)
	// 	{
	// 		welcomePan.tempString = "you just pressed start bro";
	// 		welcomePan.enterName.setBounds(650,500,200,50);
	// 		welcomePan.startPressed = true;
	// 		welcomePan.repaint();
	// 	}
	// }

	// class JButtonHandlerH implements ActionListener
	// {
	// 	public void actionPerformed(ActionEvent e)
	// 	{
	// 		welcomePan.tempString = "you just pressed the high scores button brodie";
	// 		welcomePan.hsPressed = true;
	// 		welcomePan.repaint();
	// 	}
	// }

	class LandingPage extends JPanel
	{

		public LandingPage()
		{
			setLayout(flow);//sets the layout to flow
			//Card Layout made( needs more pseudocode)
			setBackground(Color.BLUE);//set background to yello
			Font titleFont = new Font("Serif", Font.BOLD, 20);                //Set Fonts
			setFont(titleFont);
			System.out.println("Houston, we've landed");
		}
	}//end of landing page
}

//correct
// class Mouth extends JPanel implements ActionListener//mouth class not finished(unneccesary buttons)
// {
//   //variables
//     public Mouth(int numIn, Color colorIn) 		//numbers on the panel
//     {
//         JRadioButton radiobutton = new JRadioButton("1"); //add buttons (unneccesary)
//         radiobutton.addActionListener(this);
//         add(radiobutton);
//         JRadioButton radiobutton2 = new JRadioButton("2");
//         radiobutton2.addActionListener(this);
//         add(radiobutton2);
//         JRadioButton radiobutton3 = new JRadioButton("3");
//         radiobutton3.addActionListener(this);
//         add(radiobutton3);
//         JRadioButton radiobutton4 = new JRadioButton("4");
//         radiobutton4.addActionListener(this);
//         add(radiobutton4);
//
//     }
//     public void paintComponent(Graphics g)  //paintComponent for implementing image
//     {
//         //super.paintComponent(g);
//         //g.setFont(new Font("Arial", Font.BOLD, 18));
//         //g.setColor(Color.RED);
//         //g.drawString(num, 10, 20);
//     }
//
//     public void actionPerformed(ActionEvent evt)//to set borders for panels
//     {
//         String command=button.getText();
//         if(command.equals("Press my belly."))
//         {
//             pressed=true;
//             button.setText("reset");
//         }
//
//         else
//         {
//             button.setText("Press my belly.");
//         }
//         repaint();

//  }
// end class Mouth

//start Esophogous class panels
