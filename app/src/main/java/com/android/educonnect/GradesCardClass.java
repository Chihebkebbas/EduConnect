package com.android.educonnect;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GradesCardClass extends RecyclerView.Adapter<GradesCardClass.CardViewHolder> {

    Context context;
    String[] ModuleTitle, ModuleCoef, ModuleGrade;
    public GradesCardClass(Context c, String[] Title, String[] Coef, String[] Grade){
        this.context = c;
        this.ModuleTitle = Title;
        this.ModuleCoef = Coef;
        this.ModuleGrade = Grade;
    }

    @NonNull
    @Override
    public GradesCardClass.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.layout_grades_module, parent, false);
        return new CardViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull GradesCardClass.CardViewHolder holder, int position) {
        holder.title.setText(ModuleTitle[position].toString());
        holder.coef.setText(ModuleCoef[position].toString());
        holder.grade.setText(ModuleGrade[position].toString());
    }

    @Override
    public int getItemCount() {
        return ModuleTitle.length;
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        TextView coef;
        TextView grade;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.module_title);
            coef = itemView.findViewById(R.id.module_coef);
            grade = itemView.findViewById(R.id.module_grade);
        }
    }
}
