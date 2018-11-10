package msc.eee.hku.hkueee.StreamInformation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import msc.eee.hku.hkueee.Course;
import msc.eee.hku.hkueee.Facilities;
import msc.eee.hku.hkueee.R;
import msc.eee.hku.hkueee.facilities.Optics;

public class StreamInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stream_information);

        Button tocourse = (Button) findViewById(R.id.tocourse);
        tocourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StreamInformation.this, Course.class);
                startActivity(intent);
            }
        });
    }
}
