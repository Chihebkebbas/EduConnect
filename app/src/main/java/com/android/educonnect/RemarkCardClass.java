package com.android.educonnect;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RemarkCardClass extends RecyclerView.Adapter<RemarkCardClass.CardViewHolder> {

    String RemarkModule, RemarkTeacher, RemarkDate, RemarkTime, Remark;
    Context context;

    RemarkCardClass(Context c, String module, String teacher, String date, String time, String remark) {
        this.RemarkModule = module;
        this.RemarkTeacher = teacher;
        this.RemarkDate = date;
        this.RemarkTime = time;
        this.Remark = remark;
        this.context = c;
    }


    @NonNull
    @Override
    public RemarkCardClass.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.layout_remark_card, parent, false);

        return new CardViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RemarkCardClass.CardViewHolder holder, int position) {

        holder.module.setText(RemarkModule);
        holder.teacher.setText(RemarkTeacher);
        holder.date.setText(RemarkDate);
        holder.time.setText(RemarkTime);
        holder.remark.setText(Remark);

    }

    @Override
    public int getItemCount() {
        return 1;
    }


    public class CardViewHolder extends RecyclerView.ViewHolder {

        TextView module, teacher, date, time, remark;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            module = itemView.findViewById(R.id.remark_module);
            teacher = itemView.findViewById(R.id.remark_teacher);
            date = itemView.findViewById(R.id.remark_date);
            time = itemView.findViewById(R.id.remark_time);
            remark = itemView.findViewById(R.id.remark);

        }
    }



}
