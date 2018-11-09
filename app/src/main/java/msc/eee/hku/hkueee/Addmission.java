package msc.eee.hku.hkueee;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import msc.eee.hku.hkueee.addmisssion.Application;
import msc.eee.hku.hkueee.addmisssion.GeneralQualifications;

public class Addmission extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addmission);

        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null){
            actionbar.hide();
        }

        Button button_general = (Button) findViewById(R.id.general);
        button_general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Addmission.this,GeneralQualifications.class);
                startActivity(intent);
            }
        });

        Button button_application = (Button) findViewById(R.id.application);
        button_application.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Addmission.this,Application.class);
                startActivity(intent);
            }
        });

        Button button_fee = (Button) findViewById(R.id.compositionfee);
        button_fee.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Uri uri = Uri.parse("https://engg.hku.hk/Admissions/MSc/Fees");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
            }
        });
    }
}
