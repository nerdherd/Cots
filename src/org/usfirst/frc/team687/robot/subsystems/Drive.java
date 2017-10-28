package org.usfirst.frc.team687.robot.subsystems;

import org.usfirst.frc.team687.robot.Robot;
import org.usfirst.frc.team687.robot.RobotMap;
import org.usfirst.frc.team687.robot.commands.Tank;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * The Drive class controls the robot's drive system.
 * 
 *@author NerdHerd687
 * @version 1.0
 * @since 2017-05-19
 */
public class Drive extends Subsystem {

	private final Victor lf, lb, rf, rb;
	
	public Drive(){
		lf = new Victor(RobotMap.p_leftFrontDrive);
		lb = new Victor(RobotMap.p_leftBackDrive);
		rf = new Victor(RobotMap.p_rightFrontDrive);
		rb = new Victor(RobotMap.p_rightBackDrive);
	}
	
	/**
	 * Sets the drive system to a tank drive in which forward on
	 * both joysticks causes forward movement, backwards on both
	 * joysticks causes backward movement, and one back and one
	 * forward joystick direction causes rotation of the robot
	 */
	public void tankDrive(){
		lf.set(-Robot.oi.getLeftY());
		lb.set(Robot.oi.getLeftY());
		rf.set(-Robot.oi.getRightY());
		rb.set(Robot.oi.getRightY());
	}
	
	public void setPower() {
		
	}
	
	/**
	 * Sets the initial command when an instance of Arm is created
	 */
    public void initDefaultCommand() {
        setDefaultCommand(new Tank());
    }
}
