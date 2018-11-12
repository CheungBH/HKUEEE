package msc.eee.hku.hkueee.facilities;

import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import msc.eee.hku.hkueee.R;

public class Optics extends AppCompatActivity {

    private String[] data={"Device & Process Simulation Lab.","Integrated Circuit / Thin Film Lab.","Laboratory of Nanoscale Optoelectronics (LONO)","Magnetics Technology Lab.\n" +
            "Additive Microfabrication Lab.","Nanotechology Research Lab.","Optoelectronics / Electro-Optics Lab.","Photonic Systems Research Lab.","Semiconductor Lighting and Display Lab.","Solid State Electronics / Photo Voltaic Lab.","VLSI Design Lab."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optics);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(
                Optics.this, android.R.layout.simple_list_item_1, data);
        ListView listViewo = (ListView) findViewById(R.id.list_viewopt);
        listViewo.setAdapter(adapter3);
    }
}
