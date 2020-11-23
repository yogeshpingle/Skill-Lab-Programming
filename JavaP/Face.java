import java.applet.*;
import java.awt.*;
/*
<Applet code=Face.class width = 300 height = 200></applet>
*/
public class Face extends Applet
{
	public void paint(Graphics g) 
	{
		Dimension d = getSize();
		int midx,midy;
		midx = d.width /2;
		midy = d.height/2;
		g.drawOval(midx-80,midy-80,160,160);		//FACE
		g.drawOval(midx-50,midy-52,30,30);			//LEFT EYE
		g.drawOval(midx+20,midy-52,30,30);			//RIGHT EYE
		g.drawArc(midx-15,midy-20,30,40,0,-180);	//NOSE
		g.fillArc(midx-100,midy-35,40,70,90,180);	//LEFT EAR
		g.fillArc(midx+60,midy-35,40,70,90,-180);	//RIGHT EAR
		g.fillArc(midx-35,midy+10,70,40,0,-180);	//MOUTH
	}
}