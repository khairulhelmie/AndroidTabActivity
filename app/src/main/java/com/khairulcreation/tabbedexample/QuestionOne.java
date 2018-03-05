package com.khairulcreation.tabbedexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_one);

        Button advanceToQuestionTwo = (Button) findViewById(R.id.next_quesstion_one);
        advanceToQuestionTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuestionOne.this, Tab1Contacts.class);
                startActivity(intent);
            }
        });
    }
}
