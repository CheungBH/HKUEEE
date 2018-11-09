package msc.eee.hku.hkueee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import msc.eee.hku.hkueee.facilities.Biomedical;
import msc.eee.hku.hkueee.facilities.Communication;
import msc.eee.hku.hkueee.facilities.Department;
import msc.eee.hku.hkueee.facilities.Energy;
import msc.eee.hku.hkueee.facilities.Optics;
import msc.eee.hku.hkueee.facilities.Signal;

public class Facilities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facilities);



    Button button_biomedcial = (Button) findViewById(R.id.biomedical);
        button_biomedcial.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Facilities.this,Biomedical.class);
            startActivity(intent);
        }
    });

    Button button_communication = (Button) findViewById(R.id.communication);
        button_communication.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Facilities.this,Communication.class);
            startActivity(intent);
        }
    });

    Button button_department = (Button) findViewById(R.id.department);
        button_department.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Facilities.this,Department.class);
            startActivity(intent);
        }
    });

    Button  button_energy  = (Button) findViewById(R.id.energy);
        button_energy.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Facilities.this,Energy.class);
            startActivity(intent);
        }
    });

    Button button_optics = (Button) findViewById(R.id.optics);
        button_optics.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Facilities.this,Optics.class);
            startActivity(intent);
        }
    });
        Button button_signal = (Button) findViewById(R.id.signal);
        button_signal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Facilities.this,Signal.class);
                startActivity(intent);
            }
        });

    }


}
