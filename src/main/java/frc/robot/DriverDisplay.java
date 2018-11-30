package frc.robot;

import java.util.Map;

import org.opencv.core.Core;
import org.opencv.core.Mat;

import edu.wpi.cscore.CvSource;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardContainer;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardLayout;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.shuffleboard.SimpleWidget;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DriverDisplay {

    //adds string
    ShuffleboardTab myTab = Shuffleboard.getTab("Robot Diagnostics");
    NetworkTableEntry test = myTab
    .add("String Test", "")
    .withWidget("Text View")
    .withPosition(2, 2)
    .getEntry();

    //add simple counter that counts up, takes double
    NetworkTableEntry RobotTime = myTab
    .add("Robot Time", 0.0)
    .withWidget("Text View")
    .withPosition(5, 2)
    .getEntry();

    int i = 0;
    double time = 0;

    //add camera to shuffleboard
    UsbCamera camera = CameraServer.getInstance().startAutomaticCapture(0);
    myTab.add(ShuffleboardCameraWrapper.wrap(camera));

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