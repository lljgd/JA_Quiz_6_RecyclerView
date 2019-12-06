package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AllQuestionAdapter extends RecyclerView.Adapter<AllQuestionsViewHolder> {

    private List<Question> questions;

    public AllQuestionAdapter(List<Question> questions) {
        this.questions = questions;
    }

    @NonNull
    @Override
    public AllQuestionsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_question, parent, false);

        return new AllQuestionsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AllQuestionsViewHolder holder, int position) {
        Question question = questions.get(position);
        holder.bindTo(question);
    }

    @Override
    public int getItemCount() {
        return questions.size();
    }
}
