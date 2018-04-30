package com.example.user.embdeshologram;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class car_motion extends AppCompatActivity {

    TextView fr1,fr2,fr3,fr4,fl1,fl2,fl3,fl4,br1,br2,br3,br4,bl1,bl2,bl3,bl4;
    private void updateTextView1()
    {

        fr1.setText("31 psi");
        fr2.setText("31 psi");
        fr3.setText("31 psi");
        fr4.setText("31 psi");
        fl1.setText("31 psi");
        fl2.setText("31 psi");
        fl3.setText("31 psi");
        fl4.setText("31 psi");
        br1.setText("34 psi");
        bl1.setText("34 psi");
        bl2.setText("34 psi");
        bl3.setText("34 psi");
        bl4.setText("34 psi");
        br1.setText("34 psi");
        br2.setText("34 psi");
        br3.setText("34 psi");
        br4.setText("34 psi");
    }

    private void updateTextView2()
    {

        fr1.setText("32 psi");
        fr2.setText("32 psi");
        fr3.setText("32 psi");
        fr4.setText("32 psi");
        fl1.setText("32 psi");
        fl2.setText("32 psi");
        fl3.setText("32 psi");
        fl4.setText("32 psi");
        br1.setText("33 psi");
        bl1.setText("33 psi");
        bl2.setText("33 psi");
        bl3.setText("33 psi");
        bl4.setText("33 psi");
        br1.setText("33 psi");
        br2.setText("33 psi");
        br3.setText("33 psi");
        br4.setText("33 psi");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_motion);
        ImageView carimageView = (ImageView)findViewById(R.id.carimageView);
        ImageView carimageView2 = (ImageView)findViewById(R.id.carimageView2);
        ImageView carimageView3 = (ImageView)findViewById(R.id.carimageView3);
        ImageView carimageView4 = (ImageView)findViewById(R.id.carimageView4);
        ImageView carimageView5 = (ImageView)findViewById(R.id.carimageView5);
        ImageView carimageView6 = (ImageView)findViewById(R.id.carimageView6);
        ImageView carimageView7 = (ImageView)findViewById(R.id.carimageView7);
        ImageView carimageView8 = (ImageView)findViewById(R.id.carimageView8);
         fl1= (TextView) findViewById(R.id.fl1) ;
         fl2= (TextView) findViewById(R.id.fl2) ;
         fl3= (TextView) findViewById(R.id.fl3) ;
         fl4= (TextView) findViewById(R.id.fl4) ;
         fr1= (TextView) findViewById(R.id.fr1) ;
         fr2= (TextView) findViewById(R.id.fr2) ;
         fr3= (TextView) findViewById(R.id.fr3) ;
         fr4= (TextView) findViewById(R.id.fr4) ;
         br1= (TextView) findViewById(R.id.br1) ;
         br2= (TextView) findViewById(R.id.br2) ;
         br3= (TextView) findViewById(R.id.br3) ;
         br4= (TextView) findViewById(R.id.br4) ;
         bl1= (TextView) findViewById(R.id.bl1) ;
         bl2= (TextView) findViewById(R.id.bl2) ;
         bl3= (TextView) findViewById(R.id.bl3) ;
         bl4= (TextView) findViewById(R.id.bl4) ;
        fr1.setText("34 psi");
        fr1.setRotation(180f);
        fr1.setRotationX(180f);
        fr1.animate().alpha(1f).setDuration(15000);
        fr2.setText("34 psi");
        fr2.setRotation(90f);
        fr2.setRotationX(180f);
        fr2.animate().alpha(1f).setDuration(15000);
        fr3.setText("34 psi");
         fr3.setRotationY(180f);

        fr3.animate().alpha(1f).setDuration(15000);
        fr4.setText("34 psi");
        fr4.setRotation(270f);
        fr4.setRotationX(180f);
        fr4.animate().alpha(1f).setDuration(15000);
        fl1.setText("34 psi");
        fl1.setRotation(180f);
        fl1.setRotationX(180f);
        fl1.animate().alpha(1f).setDuration(15000);
        fl2.setText("34 psi");
        fl2.setRotation(90f);
        fl2.setRotationX(180f);
        fl2.animate().alpha(1f).setDuration(15000);
        fl3.setText("34 psi");
        fl3.setRotationY(180f);

        fl3.animate().alpha(1f).setDuration(15000);
        fl4.setText("34 psi");
        fl4.setRotation(270f);
        fl4.setRotationX(180f);
        fl4.animate().alpha(1f).setDuration(15000);
        bl1.setText("32 psi");
        bl1.setRotation(180f);
        bl1.setRotationX(180f);
        bl1.animate().alpha(1f).setDuration(15000);
        bl2.setText("32 psi");
        bl2.setRotation(90f);
        bl2.setRotationX(180f);

        bl2.animate().alpha(1f).setDuration(15000);
        bl3.setText("32 psi");
        bl3.setRotationY(180f);

        bl3.animate().alpha(1f).setDuration(15000);
        bl4.setText("32 psi");
        bl4.setRotation(270f);
        bl4.setRotationX(180f);
        bl4.animate().alpha(1f).setDuration(15000);
        br1.setText("32 psi");
        br1.setRotation(180f);
        br1.setRotationX(180f);
        br1.animate().alpha(1f).setDuration(15000);
        br2.setText("32 psi");
        br2.setRotation(90f);
        br2.setRotationX(180f);
        br2.animate().alpha(1f).setDuration(15000);
        br3.setText("32 psi");
        br3.setRotationY(180f);

        br3.animate().alpha(1f).setDuration(15000);
        br4.setText("32 psi");
        br4.setRotation(270f);
        br4.setRotationX(180f);
        br4.animate().alpha(1f).setDuration(15000);
        carimageView5.animate().translationX(-100f).setDuration(5000).alpha(0f);
        carimageView6.animate().translationY(-100f).setDuration(5000).alpha(0f);
        carimageView7.animate().translationX(100f).setDuration(5000).alpha(0f);
        carimageView8.animate().translationY(100f).setDuration(5000).alpha(0f);
        carimageView.animate().alpha(1f).translationY(-10f).setDuration(10000);
        carimageView.setAlpha(1f);
        carimageView2.animate().alpha(1f).translationX(-10f).setDuration(10000);
        carimageView2.setAlpha(1f);
        carimageView3.animate().alpha(1f).translationY(-10f).setDuration(10000);
        carimageView3.setAlpha(1f);
        carimageView4.animate().alpha(1f).translationX(-10f).setDuration(10000);
        carimageView4.setAlpha(1f);
        Thread t1 = new Thread() {

            @Override
            public void run() {
                try {
                    while (!isInterrupted()) {
                        Thread.sleep(4000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {

                                updateTextView1();

                            }
                        });
                    }
                } catch (InterruptedException e) {
                }
            }
        };

        t1.start();
        Thread t2 = new Thread() {

            @Override
            public void run() {
                try {
                    while (!isInterrupted()) {
                        Thread.sleep(4500);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {

                                updateTextView2();

                            }
                        });
                    }
                } catch (InterruptedException e) {
                }
            }
        };

        t2.start();
        Handler mHandler1 = new Handler();
        mHandler1.postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent i = new Intent(car_motion.this, embdes_logo.class);


                startActivity(i);

            }

        }, 20000L);

    }
}
