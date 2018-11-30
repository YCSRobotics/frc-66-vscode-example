package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Joystick;

public class Drivetrain {
    private TalonSRX frontDriveMotor = Constants.frontDriveMotor;
    private TalonSRX backLeftDriveMotor = Constants.backLeftDriveMotor;
    private TalonSRX backRightDriveMotor = Constants.backrightDriveMotor;

    public Drivetrain() {
        frontDriveMotor.configOpenloopRamp(Constants.turnRampRate);

        backLeftDriveMotor.setNeutralMode(NeutralMode.Brake);
        backLeftDriveMotor.configOpenloopRamp(Constants.rampRate);
        backRightDriveMotor.setInverted(Constants.invertBackRightMotor);
        backRightDriveMotor.set(ControlMode.Follower, backLeftDriveMotor.getDeviceID());
    }

    public void updateDrivetrain() {
        Joystick driverJoy = new Joystick(Constants.driverJoyID);

        double driveForwardValue = driverJoy.getRawAxis(Constants.LeftJoyY);
        double turnValue = driverJoy.getRawAxis(Constants.RightJoyX);

        //implement a basic deadzone
        if (Math.abs(driveForwardValue) > Constants.deadzone) {
            backLeftDriveMotor.set(ControlMode.PercentOutput, driveForwardValue);

        } else {
            backLeftDriveMotor.set(ControlMode.PercentOutput, 0.0);
        }

        if (Math.abs(turnValue) > Constants.deadzone) {
            frontDriveMotor.set(ControlMode.PercentOutput, turnValue);

        } else {
            frontDriveMotor.set(ControlMode.PercentOutput, 0.0);
        }

    }

    public double getCurrentSpeed() {
        return backLeftDriveMotor.getBusVoltage();
    }

}