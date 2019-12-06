package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class AllQuestionsActivity extends AppCompatActivity {

    private List<Question> mQuestions;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO set layout with RecyclerView inside
        setContentView(R.layout.activity_allquestions);
        recyclerView = findViewById(R.id.recycler);

        // TODO set LayoutManager to the RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // TODO pass an Adapter to the RecyclerView. Use MainActivity.QUESTION_BANK as an argument
        mQuestions = Arrays.asList(MainActivity.QUESTION_BANK);
        recyclerView.setAdapter(new AllQuestionAdapter(mQuestions));
    }
}
