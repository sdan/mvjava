/*
* Surya Dantuluri
* January 5, 2017
* EquationAnalyst.java
* Simple program that finds out slope and y-intercept depending on inputted equation
* Uses printf() and format, if and else, do while loops
* Uses double, integer, character, and float.
* Uses Scanner class
*
* initializes all needed variables
* generates random number, and depending on number a method is selected
* input possible next number
* program gives user 3 tries
* no matter if user gets 3 tries or not, program asks what the number sequence is
* user can enter 4 or more different answers on what the pattern is
* ex. add, plus, add by, positive
*
* Testing plan:
* input: integer, selection of Strings
 */
import java.util.Scanner;


public class EquationAnalyst
{
	private String equation;
	private String trimmedEquation;
	private int loopNumnber;
	private int proofread;
	private int charNum;
	private char newChar;
	private int findMethod;
	private double slope;
	private double yintercept;
	private String form;
	private int length;
	private int slopeIndexOf1;
	private int slopeIndexOf2;
	private String slopeSubstring;
	private int yInterceptIndexOf1;

	public static void main (String args[])
	{
		EquationAnalyst analysis = new EquationAnalyst();
		analysis.run();
		analysis.decideEquationType();
		analysis.printSlopeNIntercept();
	}

	public EquationAnalyst( ) //this is the constructor
	{
		equation = "";
		trimmedEquation = "";
		form = "";
		slopeSubstring = "";

	}

	public void run()
	{
	Scanner input = new Scanner(System.in);
	System.out.println("Welcome to EquationAnalyst. Please enter a linear equation in either standard, point-slope, \n or slope- intercept form. All signs need to be directly next to numbers.");
	equation = input.nextLine();
	}

	public void decideEquationType()
	{
		equation = equation.trim();
		equation = equation.toLowerCase();

		int loopNumber = 1;
    int proofread = 0;
        while (loopNumber <= length + 1)
           {
	            int charNum = (int)(equation.charAt(proofread));
	            if (charNum != 32)
		            {
		                char newChar = equation.charAt(proofread);
		                trimmedEquation = trimmedEquation + newChar;
		            }
	            loopNumber++;
	            proofread++;
        		}
		length = trimmedEquation.length();
		if (trimmedEquation.indexOf('=')==2)
			{
				findMethod = 1;
			}
		else if (trimmedEquation.endsWith(")"))
			{
				findMethod = 2;
			}
		else
			{
				findMethod = 3;
			}

		if (findMethod==1)
			{
				breakSlopeInterceptEquation();
			}

		else if (findMethod==2)
			{
				breakPointSlopeEquation();
			}

		else if (findMethod==3)
			{
				breakStandardForm();
			}
		else
			{
				decideEquationType();
			}

	}

	public void breakSlopeInterceptEquation()
		{
			slopeIndexOf1 = trimmedEquation.indexOf('=');
			slopeIndexOf2 = trimmedEquation.indexOf('x');
			slopeSubstring = trimmedEquation.substring(slopeIndexOf1,slopeIndexOf2);
			slopeSubstring.parseDouble()

			yInterceptIndexOf1 = trimmedEquation.indexOf('x');
			yInterceptSubstring = trimmedEquation.substring(yInterceptIndexOf1,length);
			form = "slope intercept";
		}

	public void breakPointSlopeEquation()
		{
			slope = Double.parseDouble(substring(indexOf('='),indexOf('(')));
			yIntMultiply = slope*Double.parseDouble(substring(indexOf('x'),indexOf(')')));
			yIntercept = yIntMultiply+Double.parseDouble(substring(indexOf('y'),indexOf('=')));
			form = "point slope";
		}

	public void breakStandardForm()
		{
			slopeStandardA = Double.parseDouble(substring(0,indexOf('x')));
			slopeStandardB = Double.parseDouble(substring(indexOf('x'),indexOf('y')));
			slope = -1*slopeStandardA/slopeStandardB;
			yInterceptC = Double.parseDouble(substring(indexOf('='),length));
			yIntercept = yInterceptC/slopeStandardB;
			form = "standard";
		}

	public void printSlopeNIntercept()
		{
			System.out.printf("Thanks for entering your line, %s, in %s form.",trimmedEquation, form);
			System.out.printf("\n slope = %6.2d", slope);
			System.out.printf("\n y-intercept = %6.2d", yIntercept);

		}
}
