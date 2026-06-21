/**
 * This is the program comment section, it houses all 
 * information related to the software below. 
 * 
 * This program creates a new GRect object, sets it to be filled,
 * colors it red, and then displays it on the screen. The GRect
 * is 125 pixels wide by 60 pixels high, with its upper left
 * corner at the point (100,50).
 * 
 * testing updates from VM with this comment. Disregard.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class CS106A_GRectExample extends GraphicsProgram
{
	public void run(){ createRectangle(); }
	
	
	private void createRectangle()
	{
		GRect rect = new GRect(100,50,125,60);
		rect.setFilled(true);
		rect.setColor(Color.RED);
		add(rect);
	}
}