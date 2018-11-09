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

public class GeneralCourse extends AppCompatActivity {

    private String[] data1={"ELEC6008 Pattern recognition and machine learning","ELEC6027 Integrated circuit systems design ","ELEC6036 High performance computer architecture","ELEC6043 Digital image processing","ELEC6049 Digital system design techniques","ELEC6063 Optoelectronics and lightwave technology  ","ELEC6067 Magnetic resonance imaging (MRI) technology and applications ","ELEC6079 Biomedical ultrasound","ELEC6081 Biomedical signals and systems","ELEC6092 Green project management ","ELEC6105 Magnetics engineering for data storage and emerging applications \n" +
            " ","ELEC6601 Industrial marketing  ","ELEC6602 Business venture in China","ELEC6603 Success in industrial entrepreneurship","ELEC6604 Neural networks, fuzzy systems and genetic algorithms","ELEC7078 Advanced topics in electrical and electronic engineering","ELEC7079 Investment and trading for engineering students","ELEC7080 Algorithmic trading and high frequency trading","ELEC7081 Advanced topics in computational finance  "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_course);

//            ActionBar actionbar = getSupportActionBar();
//            if (actionbar != null){
//                actionbar.hide();
//            }

        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(
                GeneralCourse.this,android.R.layout.simple_list_item_1,data1);
        ListView listViewg=(ListView) findViewById(R.id.list_viewg);
        listViewg.setAdapter(adapter1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.general,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.gtoc:
                Intent intent2 = new Intent(GeneralCourse.this, CommunicationCourse.class);
                startActivity(intent2);
                break;
            case R.id.gtop:
                Intent intent3 = new Intent(GeneralCourse.this, PowerCourse.class);
                startActivity(intent3);
                break;
            default:
        }
        return true;
    }
}
