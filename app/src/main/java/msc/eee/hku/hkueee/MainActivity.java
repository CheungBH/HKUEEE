package msc.eee.hku.hkueee;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null){
            actionbar.hide();
        }

        Button button_study = (Button) findViewById(R.id.button_study);
        button_study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Study.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"Welcome to the STUDY",
                        Toast.LENGTH_SHORT).show();
            }
        });

        Button button_about = (Button) findViewById(R.id.button_about);
        button_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,About.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"Welcome to the ABOUT",
                        Toast.LENGTH_SHORT).show();
            }
        });

        Button button_addmission = (Button) findViewById(R.id.button_addmission);
        button_addmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Addmission.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"Welcome to the ADDMISSION",
                        Toast.LENGTH_SHORT).show();
            }
        });

        Button button_contact = (Button) findViewById(R.id.button_contact);
        button_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Contact.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"Welcome to the Contact",
                        Toast.LENGTH_SHORT).show();
            }
        });

        Button button_people = (Button) findViewById(R.id.button_people);
        button_people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,People.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"Welcome to the Course",
                        Toast.LENGTH_SHORT).show();
            }
        });

        Button button_course_information = (Button) findViewById(R.id.button_course_information);
        button_course_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Course.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"Welcome to the Course",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
