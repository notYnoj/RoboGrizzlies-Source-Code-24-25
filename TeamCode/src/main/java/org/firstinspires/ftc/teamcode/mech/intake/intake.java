package org.firstinspires.ftc.teamcode.mech.intake;
import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.revrobotics.ColorSensorV3;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
import org.firstinspires.ftc.vision.opencv.PredominantColorProcessor;

//TODO: Integrate CV with this


public class intake {
    public static String color = "NULL";
    CRServo active_intake;
    ColorSensor color_sensor;

    public static double intake_constant = 1.0;
    public intake(LinearOpMode l){
        l.hardwareMap.get(Servo.class, "active_intake");
        l.hardwareMap.get(ColorSensor.class, "color_sensor");
    }
    public void takeIn(){

    }
    public void eject(){
        active_intake.setPower(-intake_constant);
    }
    public void stop(){
        active_intake.setPower(0);
    }
}
