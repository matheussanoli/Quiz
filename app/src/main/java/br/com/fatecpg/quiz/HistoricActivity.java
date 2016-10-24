package br.com.fatecpg.quiz;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricActivity extends ListActivity {
    ArrayList<String> test = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, test);
        ListView lv = (ListView)findViewById(R.id.list);
        lv.setAdapter(aa);
    }
}
