package msc.eee.hku.hkueee.facilities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import msc.eee.hku.hkueee.R;
import msc.eee.hku.hkueee.course.CommunicationCourse;

public class Biomedical extends AppCompatActivity {

    private String[] data={"Applied Life Photonic at HKU (Alpha HKU)","Biomedical Engineering Lab","Biomedical Imaging and Signal Processing – Data Analysis Lab","Biomedical Imaging and Signal Processing – 7T MRI Lab"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biomedical);

//            ActionBar actionbar = getSupportActionBar();
//            if (actionbar != null){
//                actionbar.hide();
//            }

        ArrayAdapter<String> adapter3=new ArrayAdapter<String>(
                Biomedical.this,android.R.layout.simple_list_item_1,data);
        ListView listViewc=(ListView) findViewById(R.id.list_viewbio);
        listViewc.setAdapter(adapter3);
    }
}
