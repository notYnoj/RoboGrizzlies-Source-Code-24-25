package org.firstinspires.ftc.teamcode.opmodes.teleop;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.teamcode.robot.robot;
public class controls {
    robot robot;
    LinearOpMode op;
    long init_time;
    public controls(robot r, LinearOpMode l, long t){
        robot = r;
        op = l;
        init_time = t;
    }
    public void action() {
        robot.movement.odo.bulkUpdate();
        robot.movement.move(op.gamepad1.left_stick_x, op.gamepad1.left_stick_y, op.gamepad1.right_stick_x);
        if (op.gamepad1.right_trigger > 0.3) {
            robot.intake.takeIn();
        }
        else if (op.gamepad1.left_trigger > 0.3) {
            robot.intake.eject();
        }else{
            robot.intake.stop();
        }
        if(op.gamepad1.right_bumper && op.gamepad1.left_bumper){
            robot.arm.afterSpecimen();
        }
        else if(op.gamepad1.right_bumper){
            robot.arm.getSpecimen();
        }
        else if(op.gamepad1.left_bumper){
            robot.arm.placeSpecimen();
        }
    }
}
