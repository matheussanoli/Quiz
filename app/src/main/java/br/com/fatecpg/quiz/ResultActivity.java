package br.com.fatecpg.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent i = getIntent();
        double result = i.getDoubleExtra("result", 0);
        setResult(Math.round(result)+" pontos");
    }

    public Double getEditVal(int id) {
        EditText T = (EditText) findViewById(id);
        return Double.parseDouble(T.getText().toString());
    }
    public void setResult(String r) {
        TextView t = (TextView) findViewById(R.id.resul);
        t.setVisibility(View.VISIBLE);
        t.setText(r);
    }

    public void inicio(View view){
        Intent c = new Intent(this, MainActivity.class);
        double result = c.getDoubleExtra("result", 0);
        c.putExtra("result", result);
        startActivity(c);

        finish();
    }

}
