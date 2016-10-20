package br.com.fatecpg.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void initTest(View view){
        Intent i = new Intent(
                getApplicationContext()
                , TestActivity.class
        );
        startActivity(i);
    }
}
