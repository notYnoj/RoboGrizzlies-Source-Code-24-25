package org.firstinspires.ftc.teamcode.mech.intake;
import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
//TODO: Integrate CV with this
public class intake {
    CRServo active_intake;
    public static double intake_constant = 1.0;
    public intake(LinearOpMode l){
        l.hardwareMap.get(Servo.class, "active_intake");
    }
    public void takeIn(){
        active_intake.setPower(intake_constant);
    }
    public void eject(){
        active_intake.setPower(-intake_constant);
    }
    public void stop(){
        active_intake.setPower(0);
    }
}
