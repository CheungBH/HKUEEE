package msc.eee.hku.hkueee.course;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import msc.eee.hku.hkueee.R;

public class CommunicationCourse extends AppCompatActivity {


    private String[] data3={"ELEC6006 Communications policy and regulations","ELEC6026 Digital signal processing  ","ELEC6065 Data compression","ELEC6080 Telecommunications systems and management","ELEC6097 IP networks","ELEC6098 Electronic and mobile commerce","ELEC6099 Wireless communications and networking","ELEC6100 Digital communications","ELEC6103 Satellite communications","ELEC7051 Advanced topics in communication theory and systems","ELEC7077 Advanced topics in multimedia signals and systems "};

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.com,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.ctog:
                Intent intent2 = new Intent(CommunicationCourse.this, GeneralCourse.class);
                startActivity(intent2);
                break;
            case R.id.ctop:
                Intent intent3 = new Intent(CommunicationCourse.this, PowerCourse.class);
                startActivity(intent3);
                break;
            case R.id.cdes:
                Intent intent = new Intent(CommunicationCourse.this, Description.class);
                startActivity(intent);
                break;
            default:
        }
        return true;
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication_course);

//            ActionBar actionbar = getSupportActionBar();
//            if (actionbar != null){
//                actionbar.hide();
//            }

        ArrayAdapter<String> adapter3=new ArrayAdapter<String>(
                CommunicationCourse.this,android.R.layout.simple_list_item_1,data3);
        ListView listViewc=(ListView) findViewById(R.id.list_viewc);
        listViewc.setAdapter(adapter3);
    }
}
