package org.usfirst.frc.team687.robot.subsystems;

import org.usfirst.frc.team687.robot.Robot;
import org.usfirst.frc.team687.robot.RobotMap;
import org.usfirst.frc.team687.robot.commands.Articulation;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * The Arm class controls the articulation for the shooting mechanism 
 * allowing for vertical-aim adjustments.
 * 
 * @author NerdHerd687
 * @version 1.0
 * @since 2017-05-19
 */
public class Arm extends Subsystem {
	
	private final DoubleSolenoid ejector;
	private final Victor intake1, intake2;
	private final Victor articVictor;
	private final Compressor c;
	
	public Arm() {
		c = new Compressor();
		c.start();
		ejector = new DoubleSolenoid(RobotMap.p_ejector1,RobotMap.p_ejector2);
		intake1 = new Victor(RobotMap.p_intake1);
		intake2 = new Victor(RobotMap.p_intake2);
		articVictor = new Victor(RobotMap.p_artic);
	}
	
	/**
	 * Sets the arm of the robot to the Y value of the artic joystick
	 */
	public void articulate(){
		articVictor.set(Robot.oi.getArticY());
	}
	
	/**
	 * Sets the DoubleSolenoid to true to eject the disk
	 */
	public void eject(){
		ejector.set(DoubleSolenoid.Value.kForward);
	}
	
	/**
	 * Sets the DoubleSolenoid to reverse to retract the piston
	 */
	public void retract(){
		ejector.set(DoubleSolenoid.Value.kReverse);
	}
	
	/**
	 * Sets the fly wheels to full power
	 */
	public void flyWheelActivate(){
		intake1.set(0.8);
		intake2.set(0.8);
	}
	
	/**
	 * Sets the fly wheels to zero power
	 */
	public void flyWheelEnd(){
		intake1.set(0);
		intake2.set(0);
	}
	
	/**
	 * Sets the initial command when an instance of Arm is created
	 */
    public void initDefaultCommand() {
        setDefaultCommand(new Articulation());
    }
}

