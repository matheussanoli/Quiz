package br.com.fatecpg.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class TestActivity extends AppCompatActivity {
    private ArrayList<Question> questions = new ArrayList<>();
    private ArrayList<String> userAnswers = new ArrayList<>();
    private int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        createTest();
        clearAnswers();
        refreshQuestion();
    }

    private void createTest(){
        Question q = new Question();
        q.question="Qual a resposta para a vida, universo e tudo mais??";q.answer="42";q.options = new String[]{"Nada","42","0"};
        questions.add(q);
    }

    private void clearAnswers(){
        for(Question question: questions){
            userAnswers.add("");
        }
    }

    private void refreshQuestion(){
        Question q = questions.get(position);
        TextView posTextView = (TextView)findViewById(R.id.positionTextView);
        posTextView.setText((position+1)+" de "+questions.size());
        TextView qTextView = (TextView)findViewById(R.id.questionTextView);
        qTextView.setText(q.question);
        RadioButton opt1 = (RadioButton)findViewById(R.id.option1Radio);
        opt1.setText(q.options[0]);
        RadioButton opt2 = (RadioButton)findViewById(R.id.option2Radio);
        opt2.setText(q.options[1]);
        RadioButton opt3 = (RadioButton)findViewById(R.id.option3Radio);
        opt3.setText(q.options[2]);
        RadioGroup group = (RadioGroup)findViewById(R.id.optionGroup);
        group.check(0);
        if(userAnswers.get(position).equals(opt1.getText()))
            group.check(R.id.option1Radio);
        else if(userAnswers.get(position).equals(opt2.getText()))
            group.check(R.id.option2Radio);
        else if(userAnswers.get(position).equals(opt3.getText()))
            group.check(R.id.option3Radio);
    }

    public void back(View view){
        if(position>0) {
            position--;
            refreshQuestion();
        }
    }

    public void next(View view){
        if(position<questions.size()-1) {
            position++;
            refreshQuestion();
        }
    }

    public void optionSelection(View view){
        RadioButton opt = (RadioButton)findViewById(view.getId());
        userAnswers.set(position, opt.getText().toString());
    }

    public void finish(View view){
        int sum = 0;
        for(int i=0; i<questions.size(); i++){
            if(questions.get(i).answer.equals(userAnswers.get(i))){
                sum++;
            }
        }
        double result = 100.0 * (double)sum / (double)questions.size();
        Intent i = new Intent(getApplicationContext(), ResultActivity.class);
        i.putExtra("result", result);
        startActivity(i);
        finish();
    }
}
