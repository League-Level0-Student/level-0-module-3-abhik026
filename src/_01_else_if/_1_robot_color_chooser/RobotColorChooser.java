
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
	
		Robot rob = new Robot();
		rob.setPenWidth(10);
		rob.setSpeed(50);
		rob.penDown();
	
		for(int e = 0; e<1;) {
		String userColor = JOptionPane.showInputDialog("What color square would you like: (Colors of the Rainbow)?\n"
				+ "Or if you want a random color leave the space empty!");
		
			if(userColor.equalsIgnoreCase("red")) {
				rob.setPenColor(217, 13, 13);	
			}
			else if(userColor.equalsIgnoreCase("orange")) {
				rob.setPenColor(217, 135, 13);
			}
			else if(userColor.equalsIgnoreCase("yellow")) {
				rob.setPenColor(245, 238, 44);
			}
			else if(userColor.equalsIgnoreCase("green")) {
				rob.setPenColor(92, 191, 42);
			}
			else if(userColor.equalsIgnoreCase("blue")) {
				rob.setPenColor(22, 116, 204);
			}
			else if(userColor.equalsIgnoreCase("indigo")) {
				rob.setPenColor(115, 26, 125);
			}
			else if(userColor.equalsIgnoreCase("violet")) {
				rob.setPenColor(115, 26, 125);
			}
			else if(userColor.isBlank()) {
				rob.setRandomPenColor();
			}
			else {
			JOptionPane.showMessageDialog(null, "Sorry, we didn't understand that color\nMake sure color is spelt correctly!");
			
			}
		
			for(int i = 0; i<4; i++) {
				rob.move(100);
				rob.turn(90);
			}
	}	
	
	//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
