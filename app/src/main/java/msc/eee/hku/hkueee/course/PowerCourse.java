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

public class PowerCourse extends AppCompatActivity {

    private String[] data2={"ELEC6055 Power system distribution" ,"ELEC6084 Power delivery management for metropolitan cities ","ELEC6085 The role of a computerized SCADA system in power system operation ","ELEC6095 Smart grid","ELEC7402 Advanced electric vehicle technology","ELEC7403 Advanced power electronics","ELEC7456 Advanced power system operation","ELEC7466 Advanced topics in power system engineering","MEBS6001 Electrical installations","MEBS6019 Extra-low-voltage electrical systems in buildings"};
            @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power_course);

//                ActionBar actionbar = getSupportActionBar();
//                if (actionbar != null){
//                    actionbar.hide();
//                }

        ArrayAdapter<String> adapter2=new ArrayAdapter<String>(
                PowerCourse.this,android.R.layout.simple_list_item_1,data2);
        ListView listViewp=(ListView) findViewById(R.id.list_viewp);
        listViewp.setAdapter(adapter2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.power,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.ptog:
                Intent intent2 = new Intent(PowerCourse.this, GeneralCourse.class);
                startActivity(intent2);
                break;
            case R.id.ptoc:
                Intent intent3 = new Intent(PowerCourse.this, CommunicationCourse.class);
                startActivity(intent3);
                break;
            default:
        }
        return true;
    }
}
