package com.test.roadsignquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;


public class QuizActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();


    private TextView mQuestionNumberView;
    private TextView mScoreView;
    private ImageView mImageView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonRestart;
    private TextView mFinalScoreView;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;
    private int mTotalQuestions = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionNumberView = (TextView)findViewById(R.id.questionNumber);
        mImageView = (ImageView)findViewById(R.id.roadSign);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonRestart = (Button)findViewById(R.id.restart);
        mFinalScoreView = (TextView)findViewById(R.id.finalScore);

        // invoke updateQuestion() method in the beginning
        updateQuestion();

        //Start of Button Listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optional
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice2.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optional
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button2


        //Start of Button Listener for Button3
        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice3.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optional
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button3

        //Start of Button Listener for Restart Button
        mButtonRestart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Restart Button goes in here
                mScore = 0;
                mQuestionNumber = 0;
                updateScore(mScore);
                updateQuestion();
                mFinalScoreView.setText("Final Score " + " ");

               }
        });
        // End of Button Listener for Restart



    }

    private void updateQuestion(){
        mImageView.setImageResource(mQuestionLibrary.getImage(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        if (mQuestionNumber<mTotalQuestions) {
            mQuestionNumberView.setText("Question " + (mQuestionNumber+1) + " of " + mTotalQuestions);
            mQuestionNumber++;
        }//end if
        else         {
            mFinalScoreView.setText("Final Score is " + ((mScore*100.0) / mTotalQuestions) +"%");
            mQuestionNumberView.setText("");
        }

        //end else
    }


    private void updateScore(int point) {
        mScoreView.setText("Points:  " + point);
    }
}
