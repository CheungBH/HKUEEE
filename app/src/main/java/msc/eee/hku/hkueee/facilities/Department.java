package msc.eee.hku.hkueee.facilities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import msc.eee.hku.hkueee.R;

public class Department extends AppCompatActivity {

    private String[] data={"Computing Lab.","EEE Service Workshop","Equipment Storage Room","Postdoctoral Fellow Research Lab","Postgraduate Research Lab. A","Postgraduate Research Lab. B","Project Lab. I","Project Lab. II","Project Lab. III","Staff Workstation Lab.","Teaching Lab. I","Teaching Lab. II"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);

//            ActionBar actionbar = getSupportActionBar();
//            if (actionbar != null){
//                actionbar.hide();
//            }

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(
                Department.this, android.R.layout.simple_list_item_1, data);
        ListView listViewd = (ListView) findViewById(R.id.list_viewdep);
        listViewd.setAdapter(adapter3);
    }
}