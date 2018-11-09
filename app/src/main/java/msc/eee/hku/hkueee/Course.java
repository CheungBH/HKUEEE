package msc.eee.hku.hkueee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import msc.eee.hku.hkueee.addmisssion.Application;
import msc.eee.hku.hkueee.addmisssion.GeneralQualifications;
import msc.eee.hku.hkueee.course.CommunicationCourse;
import msc.eee.hku.hkueee.course.GeneralCourse;
import msc.eee.hku.hkueee.course.PowerCourse;

public class Course extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        Button button_general = (Button) findViewById(R.id.generalcourse);
        button_general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Course.this,GeneralCourse.class);
                startActivity(intent);
            }
        });

        Button button_communication = (Button) findViewById(R.id.communicationcourse);
        button_communication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Course.this, CommunicationCourse.class);
                startActivity(intent);
            }
        });

        Button button_power = (Button) findViewById(R.id.powercourse);
        button_power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Course.this, PowerCourse.class);
                startActivity(intent);
            }
        });
    }



}
