import acm.graphics.*;
import acm.program.*;
import java.awt.*;

/*Robot Head by Robert Johns
 * 10/4/2020
 * This program creates a graphic to make a robot's head, the mouth, and eyes.
 * Constant variable are used for the sizes of the parts of the robot.
 * There are 2 variables for the head location and edited to best fit the other parts.
 */
public class RobotHead extends GraphicsProgram {
	public void run() {
		
		//Head location in x and y coordinates
		int headLocationX = (getWidth()-HEAD_WIDTH)/2;
		int headLocationY = (getHeight()-HEAD_HEIGHT)/2;
		
		
		//creator of the head, mouth, and eyes objects
		GRect head = new GRect(headLocationX,headLocationY,HEAD_WIDTH,HEAD_HEIGHT);
		head.setFilled(true);
		head.setFillColor(Color.GRAY);
		head.setColor(Color.BLACK);
		add(head);
		
		GRect mouth = new GRect(headLocationX+25,headLocationY+275,MOUTH_WIDTH,MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setFillColor(Color.WHITE);
		add(mouth);
		
		GOval eye1 = new GOval(headLocationX+125, headLocationY+75, EYE_RADIUS, EYE_RADIUS);
		eye1.setFilled(true);
		eye1.setFillColor(Color.YELLOW);
		add(eye1);
		
		GOval eye2 = new GOval(headLocationX+25, headLocationY+75, EYE_RADIUS, EYE_RADIUS);
		eye2.setFilled(true);
		eye2.setFillColor(Color.YELLOW);
		add(eye2);
	}
	
	/*Values used to set up the robot head*/
	private static final int HEAD_WIDTH = 200;
	private static final int HEAD_HEIGHT = 350;
	private static final int EYE_RADIUS = 50;
	private static final int MOUTH_WIDTH = 150;
	private static final int MOUTH_HEIGHT = 50;
}
