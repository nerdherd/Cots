package org.usfirst.frc.team687.robot;

import org.usfirst.frc.team687.robot.commands.Shoot;
import org.usfirst.frc.team687.robot.commands.ShootEnd;
import org.usfirst.frc.team687.robot.commands.ShootPrepare;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 * 
 * @author NerdHerd687
 * @version 1.0
 * @since 2017-05-19
 */
public class OI {
	
	 private final Joystick lstick, rstick, artic;
	 private final Button shootPrepare, shoot;
	 
	 public OI(){
		 lstick = new Joystick(0);
		 rstick = new Joystick(1);
		 artic = new Joystick(2);
		 
		 shootPrepare = new JoystickButton(artic, 10);
		 shootPrepare.whenPressed(new ShootPrepare());
		 shootPrepare.whenReleased(new ShootEnd());
		 
		 shoot = new JoystickButton(artic,1);
		 shoot.whenPressed(new Shoot());
		 
	 }
	 
	 /**
	  * @return Y value of the left joystick
	  */
	 public double getLeftY(){
		 return lstick.getY();
	 }

	 /**
	  * @return Y value of the right joystick
	  */
	 public double getRightY(){
		 return rstick.getY();
	 }
	 
	 /**
	  * @return Y value of the articulation joystick
	  */
	 public double getArticY(){
		 return artic.getY();
	 }
}
