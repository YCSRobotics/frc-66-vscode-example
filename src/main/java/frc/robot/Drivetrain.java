package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;

public class Drivetrain {
    private Spark frontDriveMotor = new Spark(0);
    private Spark backLeftDriveMotor = new Spark(1);
    private Spark backRightDriveMotor = new Spark(2);

    public Drivetrain() {
        /*frontDriveMotor.configOpenloopRamp(Constants.turnRampRate);

        backLeftDriveMotor.setNeutralMode(NeutralMode.Brake);
        backLeftDriveMotor.configOpenloopRamp(Constants.rampRate);
        backRightDriveMotor.setInverted(Constants.invertBackRightMotor);
        backRightDriveMotor.set(ControlMode.Follower, backLeftDriveMotor.getDeviceID());*/
    }

    public void updateDrivetrain() {
        Joystick driverJoy = new Joystick(Constants.driverJoyID);

        double driveForwardValue = driverJoy.getRawAxis(Constants.LeftJoyY);
        double turnValue = driverJoy.getRawAxis(Constants.RightJoyX);

        //implement a basic deadzone
        if (Math.abs(driveForwardValue) > Constants.deadzone) {
            backLeftDriveMotor.set(driveForwardValue);

        } else {
            backLeftDriveMotor.set(0.0);
        }

        if (Math.abs(turnValue) > Constants.deadzone) {
            frontDriveMotor.set(turnValue);

        } else {
            frontDriveMotor.set( 0.0);
        }

    }

    public double getCurrentSpeed() {
        return 0;
    }

}