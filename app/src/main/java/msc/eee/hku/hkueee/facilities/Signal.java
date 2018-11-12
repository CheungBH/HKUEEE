package msc.eee.hku.hkueee.facilities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import msc.eee.hku.hkueee.R;

public class Signal extends AppCompatActivity {

    private String[] data={"Digital Signal Processing Lab.","Control System Research Lab.","Imaging System Lab.","Industrial Automation Research Lab.","Information Science Lab."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signal);

        ArrayAdapter<String> adapter3=new ArrayAdapter<String>(
                Signal.this,android.R.layout.simple_list_item_1,data);
        ListView listViews=(ListView) findViewById(R.id.list_viewsig);
        listViews.setAdapter(adapter3);
    }
}
