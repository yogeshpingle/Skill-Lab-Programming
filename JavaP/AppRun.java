import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener
{
  Button b1,b2,b3;
  Process p;
  Runtime r;
  public MyFrame(String s)
	{
       super(s);
       b1 = new Button("Calculator");
	   add(b1);
       b1.addActionListener(this);
	   b2 = new Button("MS Paint");
	   add(b2);
       b2.addActionListener(this);
	   b3 = new Button("NotePad");
	   add(b3);
       b3.addActionListener(this);
	   r = Runtime.getRuntime();
	   addWindowListener(
		   new WindowAdapter()
		       {
		           public void windowClosing(WindowEvent we)
					   {
					     hide();
						 System.exit(0);
			           }
			   }
			           );
	}

   public void actionPerformed(ActionEvent ae)
	{
	   String s;
	   s = ae.getActionCommand();
	   try
	   {
		   if (s.equals("Calculator"))
		           p = r.exec("calc.exe");   
		   else if (s.equals("MS Paint"))
			       p = r.exec("mspaint.exe");
		   else
			       p = r.exec("notepad.exe");  
		      	
	   }
	   catch (Exception e) { }
	         
	}
}

class AppRun
{
   public static void main(String args[])
	{
       MyFrame f = new MyFrame("Child Process");
	   f.setSize(300,300);
	   f.setLayout(new FlowLayout());
	   f.show();
	}
}
 