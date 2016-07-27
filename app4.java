import mypkg.myPanel;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="app4.class"
	width=300
	height=300>
</applet>*/
public class app4 extends Applet
{
	myPanel pan;
	Image img;
	public void init()
	{
		img=getImage(getDocumentBase(),"sunipagal.jpg");
		pan=new myPanel();	
		pan.setImage(img);
		setLayout(new BorderLayout());
		add(pan,BorderLayout.CENTER);
	}
	public void paint(Graphics g)
	{}
}
		