
package _02_loop_variables._3_robot_walk_of_fame;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.setWindowSize(1120, 600);
		Random ran = new Random();
		
		rob.setSpeed(50);
		rob.show();
		rob.penDown();
		rob.setX(68);
		rob.turn(90);
		rob.setRandomPenColor();
		
	for(int e= 0; e<10; e++) {
		int speed = ran.nextInt(100-30+1)+30;
		rob.setSpeed(speed);
		
		for(int i = 0; i<5; i++) {
		rob.move(75);
		rob.turn(144);
		}
		rob.penUp();
		rob.move(100);
		rob.setRandomPenColor();
		rob.penDown();
		}
		rob.setSpeed(60);
		rob.penUp();
		rob.move(200);
		
		
		
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.

		// 2. Make the robot draw a star shape. Hint: angle=144.

		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
