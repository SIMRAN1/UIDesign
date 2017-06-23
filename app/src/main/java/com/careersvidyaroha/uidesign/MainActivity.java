package com.careersvidyaroha.uidesign;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView camera,word_day,interactive,personality,status_report;
    ConstraintLayout cameracl,word_daycl,interactivecl,personalitycl,status_reportcl;
    private Typeface type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        type = Typeface.createFromAsset(getAssets(), "fonts/CarnevaleeFreakshow.ttf");
        camera=(TextView)findViewById(R.id.cameratxt);
        word_day=(TextView)findViewById(R.id.wordtxt);
        interactive=(TextView)findViewById(R.id.interactive);
        personality=(TextView)findViewById(R.id.personalitytxt);
        status_report=(TextView)findViewById(R.id.statusreport);
        cameracl=(ConstraintLayout)findViewById(R.id.cameracon);
        word_daycl=(ConstraintLayout)findViewById(R.id.wordcons);
        interactivecl=(ConstraintLayout)findViewById(R.id.ilcons);
        personalitycl=(ConstraintLayout)findViewById(R.id.podc);
        status_reportcl=(ConstraintLayout)findViewById(R.id.srcons);
        camera.setTypeface(type);
        word_day.setTypeface(type);
        interactive.setTypeface(type);
        personality.setTypeface(type);
        status_report.setTypeface(type);
        cameracl.setOnClickListener(this);
        word_daycl.setOnClickListener(this);
        interactivecl.setOnClickListener(this);
        personalitycl.setOnClickListener(this);
        status_reportcl.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cameracon:
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(intent);
                break;
            case R.id.wordcons:
                Intent intent4 = new Intent(this,WordActivity.class);
                startActivity(intent4);
                break;
            case R.id.ilcons:
                Intent intent1 = new Intent(this,InteractiveLearningActivity.class);
                startActivity(intent1);
                break;
            case R.id.podc:
                Intent i = new Intent(this, PersinalityActivity.class);
                startActivity(i);
                break;
            case R.id.srcons:
                Intent in = new Intent(this, StatusReportActivity.class);
                startActivity(in);
                break;


        }
    }
}
