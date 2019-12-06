package com.example.myapplication;

        import android.view.View;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;

class AllQuestionsViewHolder extends RecyclerView.ViewHolder {

    private Question question;

    private TextView textView;

    public AllQuestionsViewHolder(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.question);
    }

    public void bindTo(Question question) {
        this.question = question;

        textView.setText(question.getQuestionResId());
    }
}
