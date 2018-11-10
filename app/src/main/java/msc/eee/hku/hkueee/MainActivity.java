package msc.eee.hku.hkueee;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import msc.eee.hku.hkueee.course.CommunicationCourse;
import msc.eee.hku.hkueee.course.GeneralCourse;
import msc.eee.hku.hkueee.course.PowerCourse;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.contact:
                Intent intent = new Intent(MainActivity.this,Contact.class);
                startActivity(intent);
                break;
            case R.id.career:
                Intent intent2 = new Intent(MainActivity.this,CourseProspect.class);
                startActivity(intent2);
                break;
            case R.id.research:
                Uri uri1 = Uri.parse("https://www.eee.hku.hk/research/");
                Intent intent3 = new Intent(Intent.ACTION_VIEW, uri1);
                startActivity(intent3);
                break;
            case R.id.news:
                Uri uri2 = Uri.parse("https://www.eee.hku.hk/news/");
                Intent intent4 = new Intent(Intent.ACTION_VIEW, uri2);
                startActivity(intent4);
                break;
            case R.id.scholars:
                Uri uri3 = Uri.parse("https://www.eee.hku.hk/study/scholarships/");
                Intent intent5 = new Intent(Intent.ACTION_VIEW, uri3);
                startActivity(intent5);
                break;
            default:
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


//
//        ActionBar actionbar = getSupportActionBar();
//        if (actionbar != null){
//            actionbar.hide();
//        }

        Button button_study = (Button) findViewById(R.id.button_study);
        button_study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Study.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"Welcome to the INTRODUCTION",
                        Toast.LENGTH_SHORT).show();
            }
        });

        Button button_about = (Button) findViewById(R.id.button_about);
        button_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Schedule.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"Welcome to the SCHEDULE",
                        Toast.LENGTH_SHORT).show();
            }
        });

        Button button_addmission = (Button) findViewById(R.id.button_addmission);
        button_addmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Addmission.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"Welcome to the ADMISSION",
                        Toast.LENGTH_SHORT).show();
            }
        });

        Button button_facility = (Button) findViewById(R.id.button_facility);
        button_facility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Facilities.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"Welcome to the FACILITY",
                        Toast.LENGTH_SHORT).show();
            }
        });

        Button button_people = (Button) findViewById(R.id.button_people);
        button_people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,People.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"Welcome to the PEOPLE",
                        Toast.LENGTH_SHORT).show();
            }
        });

        Button button_course_information = (Button) findViewById(R.id.button_course_information);
        button_course_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Course.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"Welcome to the COURSE",
                        Toast.LENGTH_SHORT).show();
            }
        });



    }
}