import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class PasswordLogin2 extends Applet implements ActionListener
{
	AppletContext context;

	URL u;

	String urlString, queryString;

	String s1, s2, s3;

	StringBuffer sb;
	
	// Panel for Label
	Panel p1;
	Label l32,l33,l34,l35,l36;
	
	// Panel for Two Labels
	Panel p2;
	Label l2,l3;
	Label l12,l13,l14,l15;
	Label l16,l17,l22;

	// Panel for Two Textboxes
	Panel p3;
	Label l6,l7,l8,l18,l19,l20,l21;
	TextField t1,t2;

	// Panel for Two Buttons
	Panel p4;
	Label l9,l10,l11,l40;
	Button b1,b2;
	
	// Panel LeftPanel
	Panel left;

	// Panel RightPanel
	Panel right;

	// Panel TopPanel
	Panel top;

	// Panel Bottom
	Panel bottom;

	public void init()
	{
		makep1();
		makep2();
		makep3();
		makep4();
		makeleft();
		makeright();
		maketop();
		makebottom();
		add(top);
		add(left);
		add(right);
		add(bottom);
		urlString = "http://localhost:8080/servlet/PasswordServlet10";
		context = getAppletContext();

		b1.addActionListener(this);
		b2.addActionListener(this);

	}
	
	// Panel for Label
	
	private void makep1()
	{

		p1 = new Panel();
		p1.setForeground(Color.black);
		

		p1.setLayout(new FlowLayout());
		l32 = new Label("");
		l33 = new Label("");
		l34 = new Label("");
		l35 = new Label("");
		l36 = new Label();

		p1.setLocation(700,200);
		p1.repaint(10,18,18,20,20);	
		p1.add(l32);
		p1.add(l33);
		p1.add(l34);
		p1.add(l35);
		p1.add(l36);
	}

	// Panel for Two Labels 

	private void makep2()
	{
		p2 = new Panel();
		l2 = new Label(" Login: ");
		l3 = new Label(" Password: ");
		l12 = new Label(" ");
		l13 = new Label(" ");
		l14 = new Label(" ");
		l15 = new Label(" ");
		l16 = new Label(" ");
		l17 = new Label(" ");
		l22 = new Label(" ");
		
		p2.setLayout(new GridLayout(9,5));
		p2.setLocation(700,200);
		p2.add(l12);
		p2.add(l13);
		p2.add(l14);
		p2.add(l15);
		p2.add(l16);
		p2.add(l17);
		p2.add(l2);
		p2.add(l22);
		p2.add(l3);
	}

	// Panel for Two TextBoxes

	private void makep3()
	{
		p3 = new Panel();
		t1 = new TextField(15);
		t2 = new TextField(15);
		t2.setEchoChar('*');
		l6 = new Label(" ");
		l7 = new Label(" ");
		l8 = new Label(" ");
		l18 = new Label(" ");
		l19 = new Label(" ");
		l20 = new Label(" ");
		l21 = new Label(" ");

		p3.setLayout(new GridLayout(9,5));
		p3.setLocation(700,200);
		p3.add(l6);
		p3.add(l7);
		p3.add(l8);
		p3.add(l18);
		p3.add(l19);
		p3.add(l20);
		p3.add(t1);
		p3.add(l21);
		p3.add(t2);
	}

	// Panel for Two Buttons

	private void makep4()
	{
		p4 = new Panel();
		b1 = new Button("       Submit      ");
		b2 = new Button("       Clear       ");
		l9 = new Label(" ");
		l10 = new Label(" ");
		l11 = new Label(" ");
		l40 = new Label(" ");

		p4.setLayout(new FlowLayout());
		p4.add(l9);
		p4.add(l10);
		p4.add(l11);
		p4.add(l40);
		p4.add(b1);
		p4.add(b2);
	}

	// Panel leftPanel

	private void makeleft()
	{
		left = new Panel();

		left.setLayout(new BorderLayout());
		left.add(p2, BorderLayout.CENTER);
	}

	// Panel rightPanel

	private void makeright()
	{
		right = new Panel();

		right.setLayout(new BorderLayout());
		right.add(p3, BorderLayout.CENTER);
	}

	// Panel topPanel

	private void maketop()
	{
		top = new Panel();
	
		top.setLayout(new BorderLayout());
		top.add(p1, BorderLayout.NORTH);
	}

	private void makebottom()
	{
		bottom = new Panel();

		bottom.setLayout(new BorderLayout());
		bottom.add(p4, BorderLayout.SOUTH);
	}
	public void paint(Graphics g)
	{
		// Create & set the Font

		Font font = new Font("MS Serif", Font.BOLD, 15);
		g.setFont(font);

		// Translate the Origin
		
		g.translate(getInsets().left,getInsets().top);

		// Draw a String

		String str = "   Your Account  ";
		g.drawString(str,18,18);

		// Get The font metrics for the font
		FontMetrics metrics = g.getFontMetrics(font);

		// Find the Maximum ascent for all characters in the font.
		int maxAscent = metrics.getMaxAscent();

		// Find the Maximum descent for all characters in the font.
		int maxDescent = metrics.getMaxDescent();

		// Find the width of the string
		int stringWidth = metrics.stringWidth(str);

		// Draw box round the String
		g.draw3DRect(18,18-maxAscent, stringWidth, maxAscent+maxDescent,true);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b1)
		{
			String s1, s2;
			char s;
			int i, j;
			boolean flag;
			StringBuffer sb;

			s1 = t1.getText();
			s2 = t2.getText();

			
 			if(!s1.equals("") && !s2.equals(""))
			{
				if(!s1.equals(s2))
				{
						i = s1.length();
						j = s2.length();
						s = s1.charAt(0);
						flag = Character.isLetter(s);
					
						if(flag)
						{
							if(i <= 15)
							{
								if(j >= 8) 
								{
									if(j <= 15)
									{
										try
										{
											sb = new StringBuffer(s2);
											sb.reverse();
											queryString = "?Login="+s1+"&Password="+sb;
					
											u = new URL(urlString + queryString);
											context.showDocument(u);
										}
	
										catch(Exception e1)
										{
											showStatus("Error: "+e1.getMessage());
										}
									}
									else
									{
										showStatus("Password should not be greater than 15 characters");
									}
								}
								else
								{
									showStatus("Password must have atleast 8 characters");
								}
							}
							else
							{
								showStatus("Login Name should not be greater than 15 characters");
							}
						}
						else
						{
							showStatus("Your first character of Login Name must be a letter");
						}
						flag = false;
				}
				else
				{
					showStatus("Your Login Name & Passwords are same. Please reenter the Password");
				}
			}
			else
			{
				showStatus("Your Login & Password should not be empty");
			}
		}
		else if(e.getSource() == b2)
		{
			t1.setText("");
			t2.setText("");
			showStatus("");
		}
	}

}