package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
public class Test extends OpMode{

    DcMotor RF;


    @Override
    public void init() {

        RF = hardwareMap.get(DcMotor.class, "RF");

    }

    @Override
    public void loop() {

        RF.setPower(1);

    }
}
