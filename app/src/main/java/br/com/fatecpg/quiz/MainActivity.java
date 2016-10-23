package br.com.fatecpg.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText qtd = (EditText) findViewById(R.id.qtdperguntas);
        final TextView t = (TextView) findViewById(R.id.resulteste);
        Intent a = getIntent();

            double b = a.getDoubleExtra("teste",0);
            b = b*b/100;
            TextView ty = (TextView) findViewById(R.id.resulteste);

            t.setText(b+"%");

    }

       public void initTest(View view){

        try {

        Intent i = new Intent(this,TestActivity.class);
        EditText  qtd = (EditText) findViewById(R.id.qtdperguntas);
            if (qtd.getText().toString().trim().equalsIgnoreCase("")) {
                qtd.setError("Digite o campo corretamente");
            } if (Integer.parseInt(qtd.getText().toString()) < 10 || Integer.parseInt(qtd.getText().toString()) > 30) {
                    qtd.setError("Preencha conforme as instruções");
                    qtd.requestFocus();
            }else{
                i.putExtra("parametro", qtd.getText().toString());
                startActivity(i);
            }

    }catch (Exception e){

    }

    }

}
