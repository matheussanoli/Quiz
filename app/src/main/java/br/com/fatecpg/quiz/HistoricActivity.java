package br.com.fatecpg.quiz;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricActivity extends Activity implements AdapterView.OnItemClickListener{
    private HistoricAdapter historicAdapter;
    private ListView listView;
    private ArrayList<Test> itens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historic);

        listView = (ListView)findViewById(android.R.id.list);
        listView.setOnItemClickListener(this);

        createListView();
    }
    private void createListView()
    {
        //Criamos nossa lista que preenchera o ListView
        itens = new ArrayList<Test>();
        Test item1 = new Test("1");
        Test item2 = new Test("2");
        Test item3 = new Test("3");
        Test item4 = new Test("4");

        itens.add(item1);
        itens.add(item2);
        itens.add(item3);
        itens.add(item4);

        historicAdapter = new HistoricAdapter(this, itens);
        //Define o Adapter
        listView.setAdapter(historicAdapter);
        //Cor quando a lista é selecionada para ralagem.
        listView.setCacheColorHint(Color.TRANSPARENT);
    }

    public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
        Test item = (Test) historicAdapter.getItem(arg2);
    }
}

