package frc.robot;

import java.util.Map;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardContainer;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardLayout;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;

public class DriverDisplay {

    public DriverDisplay() {
        NetworkTableEntry maxSpeed = Shuffleboard.getTab("Main Diagnostics")
        .add("Left Back Motor Voltage", 1)
        .withWidget("Text View")
        .withProperties(Map.of("0", "1")) // Note: Map.of introduced in Java 9
        .getEntry();
    }
    
    public void updateDisplay() {


    }

}