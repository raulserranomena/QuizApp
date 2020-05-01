package com.example.quizapp;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int correctAnswer1, correctAnswer2, correctAnswer3, correctAnswer4,
            correctAnswer5, correctAnswer6, correctAnswer7, correctAnswer8,
            correctAnswer9, correctAnswer10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gradeQuiz(View view) {

        correctAnswer1 = 0; correctAnswer2 = 0; correctAnswer3 = 0; correctAnswer4 = 0;
        correctAnswer5 = 0; correctAnswer6 = 0; correctAnswer7 = 0; correctAnswer8 = 0;
        correctAnswer9 = 0; correctAnswer10 = 0;

        EditText namefield = findViewById(R.id.name_field_text);
        String name = namefield.getText().toString();

        int score = calculateScore();

        showAnswers(name, score);

//        Toast.makeText(getApplicationContext(),"Tu puntaje es: " + total, Toast.LENGTH_SHORT).show();

    }

    private void showAnswers(String name, int score){

        TextView answerTextView = findViewById(R.id.answer_question1_text_view);
        setParams(answerTextView);
        String correctOption = getString(R.string.question1_option1_text);
        String answertext = getString(R.string.question1_answer);
        String answer = getString(R.string.correct_answer_text) + "\n" + correctOption + "\n\n" + answertext;
        answerTextView.setText(answer);
        answerTextView.setTextColor(Color.BLUE);
        if (correctAnswer1 != 1){
            answerTextView.setTextColor(Color.RED);
        }


        answerTextView = findViewById(R.id.answer_question2_text_view);
        setParams(answerTextView);
        correctOption = getString(R.string.question2_option4_text);
        answertext = getString(R.string.question2_answer);
        answer = getString(R.string.correct_answer_text) + "\n" + correctOption + "\n\n" + answertext;
        answerTextView.setText(answer);
        answerTextView.setTextColor(Color.BLUE);
        if (correctAnswer2 != 1){
            answerTextView.setTextColor(Color.RED);
        }

        answerTextView = findViewById(R.id.answer_question3_text_view);
        setParams(answerTextView);
        correctOption = getString(R.string.question3_option1_text);
        answertext = getString(R.string.question3_answer);
        answer = getString(R.string.correct_answer_text) + "\n" + correctOption + "\n\n" + answertext;
        answerTextView.setText(answer);
        answerTextView.setTextColor(Color.BLUE);
        if (correctAnswer3 != 1){
            answerTextView.setTextColor(Color.RED);
        }

        answerTextView = findViewById(R.id.answer_question4_text_view);
        setParams(answerTextView);
        correctOption = getString(R.string.question4_option1_text);
        answertext = getString(R.string.question4_answer);
        answer = getString(R.string.correct_answer_text) + "\n" + correctOption + "\n\n" + answertext;
        answerTextView.setText(answer);
        answerTextView.setTextColor(Color.BLUE);
        if (correctAnswer4 != 1){
            answerTextView.setTextColor(Color.RED);
        }

        answerTextView = findViewById(R.id.answer_question5_text_view);
        setParams(answerTextView);
        correctOption = getString(R.string.question5_option1_text);
        answertext = getString(R.string.question5_answer);
        answer = getString(R.string.correct_answer_text) + "\n" + correctOption + "\n\n" + answertext;
        answerTextView.setText(answer);
        answerTextView.setTextColor(Color.BLUE);
        if (correctAnswer5 != 1){
            answerTextView.setTextColor(Color.RED);
        }

        answerTextView = findViewById(R.id.answer_question6_text_view);
        setParams(answerTextView);
        correctOption = getString(R.string.question6_option3_text);
        answertext = getString(R.string.question6_answer);
        answer = getString(R.string.correct_answer_text) + "\n" + correctOption + "\n\n" + answertext;
        answerTextView.setText(answer);
        answerTextView.setTextColor(Color.BLUE);
        if (correctAnswer6 != 1){
            answerTextView.setTextColor(Color.RED);
        }

        answerTextView = findViewById(R.id.answer_question7_text_view);
        setParams(answerTextView);
        correctOption = getString(R.string.question7_option4_text);
        answertext = getString(R.string.question7_answer);
        answer = getString(R.string.correct_answer_text) + "\n" + correctOption + "\n\n" + answertext;
        answerTextView.setText(answer);
        answerTextView.setTextColor(Color.BLUE);
        if (correctAnswer7 != 1){
            answerTextView.setTextColor(Color.RED);
        }

        answerTextView = findViewById(R.id.answer_question8_text_view);
        setParams(answerTextView);
        correctOption = getString(R.string.question8_option4_text);
        answertext = getString(R.string.question8_answer);
        answer = getString(R.string.correct_answer_text) + "\n" + correctOption + "\n\n" + answertext;
        answerTextView.setText(answer);
        answerTextView.setTextColor(Color.BLUE);
        if (correctAnswer8 != 1){
            answerTextView.setTextColor(Color.RED);
        }

        answerTextView = findViewById(R.id.answer_question9_text_view);
        setParams(answerTextView);
        correctOption = getString(R.string.question9_option1_text);
        answertext = getString(R.string.question9_answer);
        answer = getString(R.string.correct_answer_text) + "\n" + correctOption + "\n\n" + answertext;
        answerTextView.setText(answer);
        answerTextView.setTextColor(Color.BLUE);
        if (correctAnswer9 != 1){
            answerTextView.setTextColor(Color.RED);
        }

        answerTextView = findViewById(R.id.answer_question10_text_view);
        setParams(answerTextView);
        correctOption = getString(R.string.question10_option3_text);
        answertext = getString(R.string.question10_answer);
        answer = getString(R.string.correct_answer_text) + "\n" + correctOption + "\n\n" + answertext;
        answerTextView.setText(answer);
        answerTextView.setTextColor(Color.BLUE);
        if (correctAnswer10 != 1){
            answerTextView.setTextColor(Color.RED);
        }

        TextView scoreTextView = findViewById(R.id.score);
        scoreTextView.setText(name +"\nTu nota es: " + score +"/10!");
    }


    private int calculateScore (){
        int total=0;

        RadioGroup optionsGroup1 = findViewById(R.id.radio_group_question_1);
        RadioGroup optionsGroup2 = findViewById(R.id.radio_group_question_2);
        RadioGroup optionsGroup3 = findViewById(R.id.radio_group_question_3);
        RadioGroup optionsGroup4 = findViewById(R.id.radio_group_question_4);
        RadioGroup optionsGroup5 = findViewById(R.id.radio_group_question_5);
        RadioGroup optionsGroup6 = findViewById(R.id.radio_group_question_6);
        RadioGroup optionsGroup7 = findViewById(R.id.radio_group_question_7);
        RadioGroup optionsGroup8 = findViewById(R.id.radio_group_question_8);
        RadioGroup optionsGroup9 = findViewById(R.id.radio_group_question_9);
        RadioGroup optionsGroup10 = findViewById(R.id.radio_group_question_10);

        RadioButton correctOptionQuestion1 = findViewById(R.id.question1_option1_radio_button);
        RadioButton correctOptionQuestion2 = findViewById(R.id.question2_option4_radio_button);
        RadioButton correctOptionQuestion3 = findViewById(R.id.question3_option1_radio_button);
        RadioButton correctOptionQuestion4 = findViewById(R.id.question4_option1_radio_button);
        RadioButton correctOptionQuestion5 = findViewById(R.id.question5_option1_radio_button);
        RadioButton correctOptionQuestion6 = findViewById(R.id.question6_option3_radio_button);
        RadioButton correctOptionQuestion7 = findViewById(R.id.question7_option4_radio_button);
        RadioButton correctOptionQuestion8 = findViewById(R.id.question8_option4_radio_button);
        RadioButton correctOptionQuestion9 = findViewById(R.id.question9_option1_radio_button);
        RadioButton correctOptionQuestion10 = findViewById(R.id.question10_option3_radio_button);


        if (optionsGroup1.getCheckedRadioButtonId() != -1){
            if (correctOptionQuestion1.isChecked()){
                total += 1;
                correctAnswer1 = 1;
            }
        }

        if (optionsGroup2.getCheckedRadioButtonId() != -1){
            if (correctOptionQuestion2.isChecked()){
                total += 1;
                correctAnswer2 = 1;
            }
        }

        if (optionsGroup3.getCheckedRadioButtonId() != -1){
            if (correctOptionQuestion3.isChecked()){
                total += 1;
                correctAnswer3 = 1;
            }
        }

        if (optionsGroup4.getCheckedRadioButtonId() != -1){
            if (correctOptionQuestion4.isChecked()){
                total += 1;
                correctAnswer4 = 1;
            }
        }

        if (optionsGroup5.getCheckedRadioButtonId() != -1){
            if (correctOptionQuestion5.isChecked()){
                total += 1;
                correctAnswer5 = 1;
            }
        }

        if (optionsGroup6.getCheckedRadioButtonId() != -1){
            if (correctOptionQuestion7.isChecked()){
                total += 1;
                correctAnswer6 = 1;
            }
        }

        if (optionsGroup7.getCheckedRadioButtonId() != -1){
            if (correctOptionQuestion7.isChecked()){
                total += 1;
                correctAnswer7 = 1;
            }
        }

        if (optionsGroup8.getCheckedRadioButtonId() != -1){
            if (correctOptionQuestion8.isChecked()){
                total += 1;
                correctAnswer8 = 1;
            }
        }

        if (optionsGroup9.getCheckedRadioButtonId() != -1){
            if (correctOptionQuestion9.isChecked()){
                total += 1;
                correctAnswer9 = 1;
            }
        }

        if (optionsGroup10.getCheckedRadioButtonId() != -1){
            if (correctOptionQuestion10.isChecked()){
                total += 1;
                correctAnswer10 = 1;
            }
        }

        return total;

    }

    private void setParams (View view){

        ViewGroup.LayoutParams params = view.getLayoutParams();
        params.height = ViewGroup.LayoutParams.WRAP_CONTENT;
        params.width = ViewGroup.LayoutParams.WRAP_CONTENT;
        view.setLayoutParams(params);


    }

}
