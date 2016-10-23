package br.com.fatecpg.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TestActivity extends AppCompatActivity {
    public static ArrayList<Question> questions = new ArrayList<>();
    public static ArrayList<String> userAnswers = new ArrayList<>();
    private int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Intent i = getIntent();
        String result = i.getStringExtra("parametro");
        double resultado = Double.parseDouble(result);
        try {
            if (resultado == 10) {
                createTest10();
            }
            if (resultado == 20) {
                createTest20();
            }
            if (resultado==30){
                createTest30();
            }
        }catch(Exception e){
            Toast.makeText(this, "Ocorreu um erro", Toast.LENGTH_SHORT).show();
            Intent is = new Intent(this, MainActivity.class);
            startActivity(is);
            finish();
        }



        clearAnswers();
        refreshQuestion();
    }

    private void createTest10(){

        Question q = new Question();
        q = new Question();
        q.question="Qual o nome da empresa que tem no logo uma maçã?";q.answer="Apple";q.options = new String[]{"Nokia","BlackBerry","Apple"};
        questions.add(q);
        q = new Question();
        q.question="O que é uma matriz?";q.answer="Vários vetores";q.options = new String[]{"Vários vetores","nenhuma das respostas","Matriz ou Matrix?"};
        questions.add(q);
        q = new Question();
        q.question="Como se caracteriza um celular?";q.answer="Dispositivo Móvel";q.options = new String[]{"Smartphone","Dispositivo Móvel","Telefone móvel"};
        questions.add(q);
        q = new Question();
        q.question="Como se chama o fluxograma que simboliza o comportamente do Software com o hardware";q.answer="Diagrama de Máquina";q.options = new String[]{"Diagrama de Máquina1","Fluxograma","Binário"};
        questions.add(q);
        q = new Question();
        q.question="Linguagem de programação da Microsoft";q.answer="VB.NET";q.options = new String[]{"VB.NET","VBA","Word"};
        questions.add(q);
        q = new Question();
        q.question="Como se chama a técnica que une o mundo real com o virtual?";q.answer="Realidade Aumentada";q.options = new String[]{"Inteligência Artificial","Realidade Aumentada","Realiadade Virtual"};
        questions.add(q);
        q = new Question();
        q.question="Como se declara um atributo privado?";q.answer="Private";q.options = new String[]{"Public","Extend","Private"};
        questions.add(q);
        q = new Question();
        q.question="Na área da computação um computador desligado se engloba em que nomenclatura?";q.answer="00";q.options = new String[]{"00","01","off"};
        questions.add(q);
        q = new Question();
        q.question="Como se chama a 'setinha' que aparece no monitor?";q.answer="Cursor";q.options = new String[]{"Setinha","Demonstrador","Cursor"};
        questions.add(q);
        q = new Question();
        q.question="Como se chama enviar a tela de um notebook para um projetor?";q.answer="Espelhamento";q.options = new String[]{"Extender","Espelhamento","Duplicar"};
        questions.add(q);


        Collections.shuffle(questions);

    }
    private void createTest20(){

        Question q = new Question();
        q = new Question();
        q.question="Qual o nome da empresa que tem no logo uma maçã?";q.answer="Apple";q.options = new String[]{"Nokia","BlackBerry","Apple"};
        questions.add(q);
        q = new Question();
        q.question="O que é uma matriz?";q.answer="Vários vetores";q.options = new String[]{"Vários vetores","nenhuma das respostas","Matriz ou Matrix?"};
        questions.add(q);
        q = new Question();
        q.question="Como se caracteriza um celular?";q.answer="Dispositivo Móvel";q.options = new String[]{"Smartphone","Dispositivo Móvel","Telefone móvel"};
        questions.add(q);
        q = new Question();
        q.question="Como se chama o fluxograma que simboliza o comportamente do Software com o hardware";q.answer="Diagrama de Máquina";q.options = new String[]{"Diagrama de Máquina1","Fluxograma","Binário"};
        questions.add(q);
        q = new Question();
        q.question="Linguagem de programação da Microsoft";q.answer="VB.NET";q.options = new String[]{"VB.NET","VBA","Word"};
        questions.add(q);
        q = new Question();
        q.question="Como se chama a técnica que une o mundo real com o virtual?";q.answer="Realidade Aumentada";q.options = new String[]{"Inteligência Artificial","Realidade Aumentada","Realiadade Virtual"};
        questions.add(q);
        q = new Question();
        q.question="Como se declara um atributo privado?";q.answer="Private";q.options = new String[]{"Public","Extend","Private"};
        questions.add(q);
        q = new Question();
        q.question="Na área da computação um computador desligado se engloba em que nomenclatura?";q.answer="00";q.options = new String[]{"00","01","off"};
        questions.add(q);
        q = new Question();
        q.question="Como se chama a 'setinha' que aparece no monitor?";q.answer="Cursor";q.options = new String[]{"Setinha","Demonstrador","Cursor"};
        questions.add(q);
        q = new Question();
        q.question="Como se chama enviar a tela de um notebook para um projetor?";q.answer="Espelhamento";q.options = new String[]{"Extender","Espelhamento","Duplicar"};
        questions.add(q);
        q = new Question();
        q.question="O que produz imagem?";q.answer="pixels";q.options = new String[]{"pixels","1080p","luz"};
        questions.add(q);
        q = new Question();
        q.question="O que é tentativa de roubo de dados?";q.answer="phishing";q.options = new String[]{"phishing","malware","roubo"};
        questions.add(q);
        q = new Question();
        q.question="Como se chama uma rede que permite a conexão de vários dispositivos na internet?";q.answer="Wi-fi";q.options = new String[]{"Wi-fi","rede","Ethernet"};
        questions.add(q);
        q = new Question();
        q.question="O que é um 'hd' portátil?";q.answer="pendrive";q.options = new String[]{"nuvem","pendrive","cd"};
        questions.add(q);
        q = new Question();
        q.question="Como se chama o método de armazenamento sem ser físico?";q.answer="Armazenamento na nuvem";q.options = new String[]{"disket","Matrix","Armazenamento na nuvem"};
        questions.add(q);
        q = new Question();
        q.question="Como se chama a função de apagar coisas?";q.answer="delete";q.options = new String[]{"delete","apagar","clean"};
        questions.add(q);
        q = new Question();
        q.question="Como se chama o dispositivo que permite moviementar o cursor?";q.answer="Mouse";q.options = new String[]{"Teclado","Mouse","Mão"};
        questions.add(q);
        q = new Question();
        q.question="Como se chama o matemático que mudou a história na 2ª Guerra Mundial?";q.answer="Allan Turing";q.options = new String[]{"J.K.Rowlling","Pupo","Allan Turing"};
        questions.add(q);
        q = new Question();
        q.question="Como se chama o dispositivo que possibilita imprimir documentos e imagens?";q.answer="Impressora";q.options = new String[]{"Impressora","Impressor","nenhuma das respostas"};
        questions.add(q);
        q = new Question();
        q.question="Qual é a nomenclatura de quando se modifica algo no GITHUB?";q.answer="Commit";q.options = new String[]{"Commit","Done","Ready"};
        questions.add(q);



        Collections.shuffle(questions);

    }
    private void createTest30(){
        Question q = new Question();
        q = new Question();
        q.question="Qual o comando que cria tabela em Banco de Dados?";q.answer="create table";q.options = new String[]{"create table","join table","drop table "};
        questions.add(q);
        q = new Question();
        q.question="Como se chama o código que usa somente 0 e 1?";q.answer="binário";q.options = new String[]{"matemática","binário","nenhuma das opções"};
        questions.add(q);
        q = new Question();
        q.question="Qual o nome da marca que tem como mascote um 'robozinho'?";q.answer="Android";q.options = new String[]{"ZapImóveis","Android","Asus"};
        questions.add(q);
        q = new Question();
        q.question="Cartões perfurados é invenção de que homem?";q.answer="Hermann Hollerith";q.options = new String[]{"Hermann Hollerith","Pica-Pau","Michael Jackson"};
        questions.add(q);
        q = new Question();
        q.question="Computador famoso da 1ª geração?";q.answer="ENIAC";q.options = new String[]{"x67","MacAir","ENIAC"};
        questions.add(q);
        q = new Question();
        q.question="O que é 'POO'";q.answer="Programação Orientada a Objetos";q.options = new String[]{"Programação Orientada a Objetos","Pão Ovo e Omelete","Programação Orientada a Ondeestou?"};
        questions.add(q);
        q = new Question();
        q.question="Qual a parte do computador que é responsável por conectar e interligar todos os componentes?";q.answer="Placa Mãe";q.options = new String[]{"Mouse","Hardware","Placa Mãe"};
        questions.add(q);
        q = new Question();
        q.question="Como se chama uma representação gráfica de um problema ou sistema?";q.answer="Fluxograma";q.options = new String[]{"Caso de Uso","Fluxograma","Diagrama de Máquina"};
        questions.add(q);
        q = new Question();
        q.question="Como se chama a transmissão de dados via ondas de rádio?";q.answer="Bluetooth";q.options = new String[]{"Bluetooth","Wi-fi","Pacote de Dados"};
        questions.add(q);
        q = new Question();
        q.question="Como se chama o pacote da Microsoft?";q.answer="Office";q.options = new String[]{"Office","PowerPoint","AndroidStudio"};
        questions.add(q);
        q = new Question();
        q.question="Qual o nome da empresa que tem no logo uma maçã?";q.answer="Apple";q.options = new String[]{"Nokia","BlackBerry","Apple"};
        questions.add(q);
        q = new Question();
        q.question="O que é uma matriz?";q.answer="Vários vetores";q.options = new String[]{"Vários vetores","nenhuma das respostas","Matriz ou Matrix?"};
        questions.add(q);
        q = new Question();
        q.question="Como se caracteriza um celular?";q.answer="Dispositivo Móvel";q.options = new String[]{"Smartphone","Dispositivo Móvel","Telefone móvel"};
        questions.add(q);
        q = new Question();
        q.question="Como se chama o fluxograma que simboliza o comportamente do Software com o hardware";q.answer="Diagrama de Máquina";q.options = new String[]{"Diagrama de Máquina1","Fluxograma","Binário"};
        questions.add(q);
        q = new Question();
        q.question="Linguagem de programação da Microsoft";q.answer="VB.NET";q.options = new String[]{"VB.NET","VBA","Word"};
        questions.add(q);
        q = new Question();
        q.question="Como se chama a técnica que une o mundo real com o virtual?";q.answer="Realidade Aumentada";q.options = new String[]{"Inteligência Artificial","Realidade Aumentada","Realiadade Virtual"};
        questions.add(q);
        q = new Question();
        q.question="Como se declara um atributo privado?";q.answer="Private";q.options = new String[]{"Public","Extend","Private"};
        questions.add(q);
        q = new Question();
        q.question="Na área da computação um computador desligado se engloba em que nomenclatura?";q.answer="00";q.options = new String[]{"00","01","off"};
        questions.add(q);
        q = new Question();
        q.question="Como se chama a 'setinha' que aparece no monitor?";q.answer="Cursor";q.options = new String[]{"Setinha","Demonstrador","Cursor"};
        questions.add(q);
        q = new Question();
        q.question="Como se chama enviar a tela de um notebook para um projetor?";q.answer="Espelhamento";q.options = new String[]{"Extender","Espelhamento","Duplicar"};
        questions.add(q);
        q = new Question();
        q.question="O que produz imagem?";q.answer="pixels";q.options = new String[]{"pixels","1080p","luz"};
        questions.add(q);
        q = new Question();
        q.question="O que é tentativa de roubo de dados?";q.answer="phishing";q.options = new String[]{"phishing","malware","roubo"};
        questions.add(q);
        q = new Question();
        q.question="Como se chama uma rede que permite a conexão de vários dispositivos na internet?";q.answer="Wi-fi";q.options = new String[]{"Wi-fi","rede","Ethernet"};
        questions.add(q);
        q = new Question();
        questions.add(q);
        q = new Question();
        q.question="O que é um 'hd' portátil?";q.answer="pendrive";q.options = new String[]{"nuvem","pendrive","cd"};
        questions.add(q);
        q = new Question();
        q.question="Como se chama o método de armazenamento sem ser físico?";q.answer="Armazenamento na nuvem";q.options = new String[]{"disket","Matrix","Armazenamento na nuvem"};
        questions.add(q);
        q = new Question();
        q.question="Como se chama a função de apagar coisas?";q.answer="delete";q.options = new String[]{"delete","apagar","clean"};
        questions.add(q);
        q = new Question();
        q.question="Como se chama o dispositivo que permite moviementar o cursor?";q.answer="Mouse";q.options = new String[]{"Teclado","Mouse","Mão"};
        questions.add(q);
        q = new Question();
        q.question="Como se chama o matemático que mudou a história na 2ª Guerra Mundial?";q.answer="Allan Turing";q.options = new String[]{"J.K.Rowlling","Pupo","Allan Turing"};
        questions.add(q);
        q = new Question();
        q.question="Como se chama o dispositivo que possibilita imprimir documentos e imagens?";q.answer="Impressora";q.options = new String[]{"Impressora","Impressor","nenhuma das respostas"};
        questions.add(q);
        q = new Question();
        q.question="Qual é a nomenclatura de quando se modifica algo no GITHUB?";q.answer="Commit";q.options = new String[]{"Commit","Done","Ready"};





        Collections.shuffle(questions);

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
        Intent i = new Intent(this, ResultActivity.class);
        i.putExtra("result", result);
        startActivity(i);
        finish();
    }
}
