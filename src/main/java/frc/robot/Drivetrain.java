package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;

public class Drivetrain {
    private Spark frontDriveMotor = new Spark(0);
    private Spark backLeftDriveMotor = new Spark(1);
    private Spark backRightDriveMotor = new Spark(2);

    public Drivetrain() {
        backRightDriveMotor.setInverted(Constants.invertBackRightMotor);

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

        backRightDriveMotor.set(backLeftDriveMotor.getSpeed());

    }

    public double getCurrentSpeed() {
        return 0;
    }

}