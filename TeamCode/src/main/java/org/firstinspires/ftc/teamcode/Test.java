package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
public class Test extends OpMode{

    DcMotor RF;
    DcMotor RB;
    DcMotor LF;
    DcMotor LB;


    @Override
    public void init() {

        RF = hardwareMap.get(DcMotor.class, "RF");
        RB = hardwareMap.get(DcMotor.class, "RB");
        LF = hardwareMap.get(DcMotor.class, "LF");
        LB = hardwareMap.get(DcMotor.class, "LB");

    }

    @Override
    public void loop() {

        RF.setPower(1);
        RB.setPower(1);
        LF.setPower(1);
        LB.setPower(1);

    }
}
