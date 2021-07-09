package com.example.pokerbb;

import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button10;
    Button button11;
    Button button12;
    Button button13;
    Button button14;
    Button button15;
    Button button30;
    Button button31;
    Button button32;
    Button button33;
    Button button34;
    Button button35;
    Button buttonStart;
    Button buttonReset;
    TextView view2;
    TextView view3;
    Handler handler;
    Button buttonminus;
    Button buttonplus;

    Switch switch2;
    Boolean checkswitch2;
    Switch switch3;
    Boolean checkswitch3;

    Switch switch6;
    Boolean checkswitch6;
    int buttoncolor0;
    int buttoncolor1;
    int buttoncolor2;
    int buttoncolor3;
    int buttoncolor4;
    int buttoncolor5;

    //TextView textTimer;
        int counter0 = 0;
        int counter1 = 0;
        int counter2 = 1;
        int counter3 = 2;
        int counter4 = 0;
        int counter5 = 0;

    int [] arr = new int[11];
    //int timer =60;
    int currentColor = 0;
    //boolean timerRun = false;
    TextView textTimer;
    Integer timer =600;
    Integer time = 600;
    boolean timerRun = false;
    Thread thread;

    //Звук
    MediaPlayer mPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //app ID


        /*try {
            getSupportActionBar().hide();
        }
        catch (Exception e){

        }*/
        //Звук
        mPlayer=MediaPlayer.create(this,R.raw.clock);

        textTimer=(TextView) findViewById(R.id.textTimer);

        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);



        button32 = (Button) findViewById(R.id.button32);
        button33 = (Button) findViewById(R.id.button33);


        buttonStart = (Button) findViewById(R.id.buttonStart);
        buttonReset = (Button) findViewById(R.id.buttonReset);
        buttonplus = (Button) findViewById(R.id.buttonplus);
        buttonminus = (Button) findViewById(R.id.buttonminus);

        view2 =(TextView)findViewById(R.id.textView2);
        view3 =(TextView)findViewById(R.id.textView3);


        view2.setText(String.valueOf(counter2));
        view3.setText(String.valueOf(counter3));








        switch6 = (Switch) findViewById(R.id.switch6);
        checkswitch6 = switch6.isChecked();
        final Drawable color3= getResources().getDrawable(R.color.color3);
        final Drawable color1= getResources().getDrawable(R.color.color1);



        switch6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (switch6.isChecked()){
                    buttonStart.setVisibility(View.VISIBLE);
                    buttonReset.setVisibility(View.VISIBLE);
                    buttonplus.setVisibility(View.VISIBLE);
                    buttonminus.setVisibility(View.VISIBLE);
                    button12.setVisibility(View.VISIBLE);
                    button13.setVisibility(View.VISIBLE);
                    button32.setVisibility(View.VISIBLE);
                    button33.setVisibility(View.VISIBLE);
                }

                else {
                    buttonStart.setVisibility(View.INVISIBLE);
                    buttonReset.setVisibility(View.INVISIBLE);
                    buttonplus.setVisibility(View.INVISIBLE);
                    buttonminus.setVisibility(View.INVISIBLE);
                    button12.setVisibility(View.INVISIBLE);
                    button13.setVisibility(View.INVISIBLE);
                    button32.setVisibility(View.INVISIBLE);
                    button33.setVisibility(View.INVISIBLE);
                }
            }

        });

        handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                String text = (String) msg.obj;
                textTimer.setText( text );
            }
        };

        //textTimer=(TextView)findViewById(R.id.textTimer);
        //textTimer.setText(timer);
        /*view0.setText(counter0);
        view1.setText(counter1);
        view2.setText(counter2);
        view3.setText(counter3);
        view4.setText(counter4);
        view5.setText(counter5);*/

        arr[0]=getResources().getColor(R.color.colorGREEN);
        arr[1]=getResources().getColor(R.color.colorBLUE);
        arr[2]=getResources().getColor(R.color.colorYELLOW);
        arr[3]=getResources().getColor(R.color.colorRED);
        arr[4]=getResources().getColor(R.color.colorPURPLE);
        arr[5]=getResources().getColor(R.color.colorBLACK);
        arr[6]=getResources().getColor(R.color.colorWHITE);
        arr[7]=getResources().getColor(R.color.colorBROWN);
        arr[8]=getResources().getColor(R.color.colorGRAY);
        arr[9]=getResources().getColor(R.color.colorPINK);
        arr[10]=getResources().getColor(R.color.colorORANGE);




    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

        // Save UI state changes to the savedInstanceState.
        // This bundle will be passed to onCreate if the process is
        // killed and restarted.



        savedInstanceState.putInt("ViewInt2", counter2);
        savedInstanceState.putInt("ViewInt3", counter3);
        savedInstanceState.putInt("time", time);
        savedInstanceState.putBoolean("switch6",switch6.isChecked());




        // etc.

        super.onSaveInstanceState(savedInstanceState);
    }
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {

        super.onRestoreInstanceState(savedInstanceState);

        // Restore UI state from the savedInstanceState.
        // This bundle has also been passed to onCreate.




        time = savedInstanceState.getInt("time");
        switch6.setChecked(savedInstanceState.getBoolean("switch6"));

        counter2 = savedInstanceState.getInt("ViewInt2");
        counter3 = savedInstanceState.getInt("ViewInt3");
        view2.setText(String.valueOf(counter2));
        view3.setText(String.valueOf(counter3));
        textTimer.setText(String.valueOf(time));






        if (switch2.isChecked()){
            button2.setVisibility(View.VISIBLE);
            button12.setVisibility(View.VISIBLE);
            button32.setVisibility(View.VISIBLE);
            view2.setVisibility(View.VISIBLE);
        }

        else {
            button2.setVisibility(View.INVISIBLE);
            button12.setVisibility(View.INVISIBLE);
            button32.setVisibility(View.INVISIBLE);
            view2.setVisibility(View.INVISIBLE);
        }


        if (switch3.isChecked()){
            button3.setVisibility(View.VISIBLE);
            button13.setVisibility(View.VISIBLE);
            button33.setVisibility(View.VISIBLE);
            view3.setVisibility(View.VISIBLE);
        }

        else {
            button3.setVisibility(View.INVISIBLE);
            button13.setVisibility(View.INVISIBLE);
            button33.setVisibility(View.INVISIBLE);
            view3.setVisibility(View.INVISIBLE);
        }







        if (switch6.isChecked()){
            buttonStart.setVisibility(View.VISIBLE);
            buttonReset.setVisibility(View.VISIBLE);
            buttonplus.setVisibility(View.VISIBLE);
            buttonminus.setVisibility(View.VISIBLE);
            button12.setVisibility(View.VISIBLE);
            button13.setVisibility(View.VISIBLE);
            button32.setVisibility(View.VISIBLE);
            button33.setVisibility(View.VISIBLE);
        }
        else {
            buttonStart.setVisibility(View.INVISIBLE);
            buttonReset.setVisibility(View.INVISIBLE);
            buttonplus.setVisibility(View.INVISIBLE);
            buttonminus.setVisibility(View.INVISIBLE);
            button12.setVisibility(View.INVISIBLE);
            button13.setVisibility(View.INVISIBLE);
            button32.setVisibility(View.INVISIBLE);
            button33.setVisibility(View.INVISIBLE);
        }
    }
    public void plus2 (View view){
        if (counter2==0){
            counter2=1;
        } else {
        counter2= counter2*2;}
        view2.setText(String.valueOf(counter2));
    }
    public void minus2 (View view){
        if(counter2!=0) {
            if (counter2 == 1)
                counter2 = 0;
            else {
                counter2 = counter2 / 2;
            }
        }

        view2.setText(String.valueOf(counter2));
    }
    public void plus3 (View view){
        if (counter3==0){
            counter3=1;
        } else{
        counter3= counter3*2;}
        view3.setText(String.valueOf(counter3));
    }
    public void minus3 (View view){
        if(counter3!=0) {
            if (counter3 == 1)
                counter3 = 0;
            else {
                counter3 = counter3 / 2;
            }
        }

        view3.setText(String.valueOf(counter3));
    }
    public void startTimer (View view){
        if (!timerRun) {
            thread = new Thread(new timerForCounter());
            thread.start();
        }
    }
    public void resetTimer (View view){
        timerRun = false;
        timer = time;
        mPlayer.pause();
        //textTimer.setText(String.valueOf(timer));
        Message msg2 = new Message();
        msg2.obj = convertSecondsInTime(timer);
        handler.sendMessage(msg2);
    }
    public void plus5sec (View view){
        time = time +30;
        Message msg4 = new Message();
        msg4.obj = convertSecondsInTime(time);
        handler.sendMessage(msg4);
    }
    public void minus5sec (View view){
        time = time -30;
        Message msg5 = new Message();
        msg5.obj = convertSecondsInTime(time);
        handler.sendMessage(msg5);
    }
    public String convertSecondsInTime (Integer time){

        int minutes =time / 60;
        int seconds = time -minutes*60;
        if (seconds ==0){
        String result= minutes+":"+"00";
        return result;}
        else {String result= minutes+":"+seconds;
        return result;}
    }
    class timerForCounter implements Runnable {

        public void run() {
                try {
                    Thread.sleep(100);
                    timer = time;
                    timerRun = true;
                    Message msg = new Message();
                    msg.obj = convertSecondsInTime(timer);
                    handler.sendMessage(msg);

                    //textTimer.setText(timer);

                    while (timerRun) {
                        if (timer == 0) {
                            mPlayer.start();
                            Thread.sleep(2500);
                            mPlayer.start();
                            Thread.sleep(2500);
                            timer=time;
                            button12.callOnClick();
                            button13.callOnClick();
                        }
                        timer--;

                        Message msg1 = new Message();
                        msg1.obj = convertSecondsInTime(timer);
                        handler.sendMessage(msg1);
                        //textTimer.setText(timer);

                        Thread.sleep(1000);
                        //TimeUnit.SECONDS.sleep(1);
                    }
                }

            catch(Exception e){
                textTimer.setText("Error");
            }

        }


    }
}

