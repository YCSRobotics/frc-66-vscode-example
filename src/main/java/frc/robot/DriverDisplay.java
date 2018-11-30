package frc.robot;

import java.util.Map;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardContainer;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardLayout;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.shuffleboard.SimpleWidget;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DriverDisplay {

    ShuffleboardTab myTab = Shuffleboard.getTab("Robot Diagnostics");
    NetworkTableEntry test = myTab
    .add("String Test", "")
    .withWidget("Text View")
    .withPosition(2, 2)
    .getEntry();

    NetworkTableEntry RobotTime = myTab
    .add("Robot Time", 0.0)
    .withWidget("Text View")
    .withPosition(5, 2)
    .getEntry();

    int i = 0;
    double time = 0;

    public DriverDisplay() {

    }
    
    public void updateDisplay() {
        i++;

        //warning: very vulnerable to err
        time = (i/2.0)/100;
        System.out.println(time);
        test.setString("Plz Work");
        RobotTime.setNumber(time);


    }

}