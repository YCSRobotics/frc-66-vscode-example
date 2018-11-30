package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Joystick;

public class Constants {
    //motor constants
    public static TalonSRX frontDriveMotor = new TalonSRX(0);
    public static TalonSRX backLeftDriveMotor = new TalonSRX(1);
    public static TalonSRX backrightDriveMotor = new TalonSRX(2);
    public static boolean invertBackRightMotor = true;

    //joystick constants
    public static int driverJoyID = 0;
    public static int operatorJoyID = 1;
    public static double deadzone = 0.08;

    //motor ramping
    public static double turnRampRate = 0.25;
    public static double rampRate = 0.30;

    //Controller Mapping
	public static final int LeftJoyX = 0;
	public static final int LeftJoyY = 1;
	public static final int RightJoyX = 4;
	public static final int RightJoyY = 5;
	public static final int LeftTrigger = 2;
	public static final int RightTrigger = 3;
	public static final int ButtonA = 1;
	public static final int ButtonB = 2;
	public static final int ButtonX = 3;
	public static final int ButtonY = 4;
	public static final int LeftBumper = 5;
	public static final int RightBumper = 6;
	public static final int SelectButton = 7;
	public static final int Startbutton = 8;
	
	public static final int DPAD_UP = 0;
	public static final int DPAD_LEFT = 90;
    public static final int DPAD_RIGHT = 270;

}