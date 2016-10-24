package br.com.fatecpg.quiz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Alyne on 24/10/2016.
 */

public class HistoricAdapter extends BaseAdapter {
    private Context context;
    private List<Test> testList;

    public HistoricAdapter(Context context, List<Test> testList){
        this.context = context;
        this.testList = testList;
    }

    @Override
    public int getCount() {
        return testList.size();
    }

    @Override

    public Object getItem(int position) {
        return testList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        Test list = testList.get(position);
        View view;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater)
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.order_list, null);
        } else {
            view = convertView;
        }
        TextView number = (TextView)view.findViewById(R.id.ordem_numero);
        number.setText(list.getId());

        TextView date = (TextView)view.findViewById(R.id.data);
        date.setText(list.getDate());

        TextView hour = (TextView)view.findViewById(R.id.horario);
        hour.setText(String.valueOf(list.getHour()));

        TextView pount = (TextView)view.findViewById(R.id.pontuacao);
        pount.setText(String.valueOf(list.getPunctuation()));

        return view;
    }

}