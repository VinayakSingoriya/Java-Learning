import java.applet.Applet;
import java.awt.Graphics;

public class JavaApplet extends Applet{
	public static void main(String [] args){
	System.out.println();
	}
	public void paint (Graphics g){
		g.drawString("Hello World!!", 150, 150);
	}
}