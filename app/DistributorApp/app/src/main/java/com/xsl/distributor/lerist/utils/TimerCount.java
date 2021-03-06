package com.xsl.distributor.lerist.utils;

import android.os.CountDownTimer;
import android.widget.TextView;

import com.xsl.distributor.lerist.AppApplication;


public class TimerCount extends CountDownTimer {
    private TextView bnt;
    private AppApplication application;
    public TimerCount(long millisInFuture, long countDownInterval, TextView bnt) {
        super(millisInFuture, countDownInterval);
        this.bnt = bnt;
    }

    public TimerCount(long millisInFuture, long countDownInterval) {
        super(millisInFuture, countDownInterval);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onFinish() {
        bnt.setClickable(true);
        bnt.setText("获取验证码");
    }

    @Override
    public void onTick(long arg0) {
        bnt.setClickable(false);
        bnt.setText(arg0 / 1000 + "秒后重新获取");
    }
}