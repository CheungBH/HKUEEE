package msc.eee.hku.hkueee.facilities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import msc.eee.hku.hkueee.R;

public class Communication extends AppCompatActivity {


    private String[] data={"Audio Engineering Lab.","Broadband Networking Lab.","Computer Lab.","Computer Architecture and System Research Lab.","Electromagnetics Lab.","Industrial System Development Unit","Micro wave / RF Engineering Lab.","Multimedia Networking Lab.","Radio Frequency Lab."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication);

//            ActionBar actionbar = getSupportActionBar();
//            if (actionbar != null){
//                actionbar.hide();
//            }

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(
                Communication.this, android.R.layout.simple_list_item_1, data);
        ListView listViewc = (ListView) findViewById(R.id.list_viewcom);
        listViewc.setAdapter(adapter3);
    }
}
