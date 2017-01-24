package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Noah Pietrafesa on 12/3/16.
 */
@TeleOp
public class NoahOpMode extends OpMode {

    DcMotor left1;
    DcMotor left2;
    DcMotor right1;
    DcMotor right2;
    DcMotor lift;
    DcMotor hatch;
    @Override
    public void init() {
        left1 = hardwareMap.dcMotor.get("left1");
        left2 = hardwareMap.dcMotor.get("left2");
        right1 = hardwareMap.dcMotor.get("right1");
        right2 = hardwareMap.dcMotor.get("right2");
        lift = hardwareMap.dcMotor.get("lift");
        hatch = hardwareMap.dcMotor.get("hatch");
    }
    //Noah was here

    @Override
    public void loop() {
        //horizontal
        if (gamepad1.right_bumper) {
            left1.setPower(gamepad1.left_stick_x);
            left2.setPower(-1 * (gamepad1.left_stick_x));
            right1.setPower(gamepad1.left_stick_x);
            right2.setPower(-1 * (gamepad1.left_stick_x));

        }
        else if (gamepad1.left_bumper) {
            //turn
            left1.setPower(gamepad1.left_trigger - gamepad1.right_trigger);
            left2.setPower(gamepad1.left_trigger - gamepad1.right_trigger);
            right1.setPower(gamepad1.left_trigger - gamepad1.right_trigger);
            right2.setPower(gamepad1.left_trigger - gamepad1.right_trigger);

        } else {
            //vertical
            left1.setPower(gamepad1.right_stick_y);
            left2.setPower(gamepad1.right_stick_y);
            right2.setPower(-1 * (gamepad1.right_stick_y));
            right1.setPower(-1 * (gamepad1.right_stick_y));
        }

            lift.setPower(0.25 *(gamepad2.right_stick_y));
            hatch.setPower(0.25 *(gamepad2.left_stick_y));
        //Diagonals
//       else if(gamepad1.left_trigger ==0) {
//            left2.setPower(gamepad1.left_stick_y);
//            right1.setPower(-1 * (gamepad1.left_stick_y));
//        }
//        else {
//            left1.setPower(gamepad1.left_stick_x);
//            right2.setPower(-1 * (gamepad1.left_stick_x));
//        }

        //non mecanum wheels config
//        left1.setPower(gamepad1.left_stick_y);
//        left2.setPower(gamepad1.left_stick_y);
//        right2.setPower(-1*(gamepad1.right_stick_y));
//        right1.setPower(-1*(gamepad1.right_stick_y));
    }
}
