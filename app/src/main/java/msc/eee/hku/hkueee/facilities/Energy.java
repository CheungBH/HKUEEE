package msc.eee.hku.hkueee.facilities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import msc.eee.hku.hkueee.R;

public class Energy extends AppCompatActivity {

    private String[] data={"Building Services Lab.","Centre for Electrical Energy Systems","Electric Drives Lab.","Electrical Energy Utilization Lab.","Electric Vehicles Research Lab.","Electrical Services Application Lab.","Emerging Power Electronics Lab.","Initiative on Clean Energy and Environment","Laboratory for Power Networks with High Renewables (LPNHR)","Modern Lighting Lab.","Power Electronics Lab.","RGC TBRS – 100 kVA Smart Grid Research Facility","Smart Power Grid Lab.","Wireless Power Lab."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energy);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(
                Energy.this, android.R.layout.simple_list_item_1, data);
        ListView listViewe = (ListView) findViewById(R.id.list_viewene);
        listViewe.setAdapter(adapter3);
    }
}
