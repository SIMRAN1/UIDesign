package com.careersvidyaroha.uidesign;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView camera,word_day,interactive,personality,status_report;
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
        camera.setTypeface(type);
        word_day.setTypeface(type);
        interactive.setTypeface(type);
        personality.setTypeface(type);
        status_report.setTypeface(type);



    }
}
