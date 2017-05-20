package org.usfirst.frc.team687.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 * 
 * @author NerdHerd687
 * @version 1.0
 * @since 2017-05-19
 */
public class RobotMap {
	//Drive Motors
	public static int p_leftFrontDrive = 1;
	public static int p_leftBackDrive = 2;
	public static int p_rightFrontDrive = 4;
	public static int p_rightBackDrive = 5;
	
	//Articulation Actuators
	public static int p_ejector1 = 0;
	public static int p_ejector2 = 1;
	public static int p_intake1 = 3;
	public static int p_intake2 = 6;
	public static int p_artic = 7;
}
