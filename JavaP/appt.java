import java.applet.*;
import java.awt.*;
/*
<Applet code=appt.class width = 300 height = 200></applet>
*/
public class appt extends Applet
{
	public void paint(Graphics g) 
	{
		int x,y,f = 0;
		for (x = 1; x<=3 ; x++)
		{
			for (y = 1;y <=3 ;y++ )
			{
				if (f == 0)
				{
					g.drawOval(x*45,y*45,40,40);
                    f = 1; 
				}
				else 
                {
				   g.fillOval(x*45,y*45,40,40);
                   f = 0;
				} 
			}
		}
	}
}
