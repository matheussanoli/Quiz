package br.com.fatecpg.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    EditText  qtd = (EditText) findViewById(R.id.qtdperguntas);
    public void initTest(View view){
        Intent i = new Intent(this,TestActivity.class);
        i.putExtra("PARAM_ACTIVITY1", qtd.getText()).toString();
        startActivity(i);
    }

}
