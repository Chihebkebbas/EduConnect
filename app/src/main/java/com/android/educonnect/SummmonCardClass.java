package com.android.educonnect;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SummmonCardClass extends RecyclerView.Adapter<SummmonCardClass.CardViewHolder> {

    Context context;
    String SummonModule, SummonTeacher, SummonDate, SummonTime, Summon;

    SummmonCardClass(Context c, String module, String teacher, String date, String time, String summon) {

        this.context = c;
        this.SummonModule = module;
        this.SummonTeacher = teacher;
        this.SummonDate = date;
        this.SummonTime = time;
        this.Summon = summon;

    }

    @NonNull
    @Override
    public SummmonCardClass.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.layout_summon_card, parent, false);

        return new CardViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull SummmonCardClass.CardViewHolder holder, int position) {

        holder.summon_module.setText(SummonModule);
        holder.summon_teacher.setText(SummonTeacher);
        holder.summon_date.setText(SummonDate);
        holder.summon_time.setText(SummonTime);
        holder.summon.setText(Summon);

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        TextView summon_module, summon_teacher, summon_date, summon_time, summon;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            summon_module = itemView.findViewById(R.id.summon_module);
            summon_teacher = itemView.findViewById(R.id.summon_teacher);
            summon_date = itemView.findViewById(R.id.summon_date);
            summon_time = itemView.findViewById(R.id.summon_time);
            summon = itemView.findViewById(R.id.summon);

        }
    }
}
