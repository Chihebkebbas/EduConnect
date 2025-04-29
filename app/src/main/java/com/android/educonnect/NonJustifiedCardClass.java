package com.android.educonnect;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NonJustifiedCardClass extends RecyclerView.Adapter<NonJustifiedCardClass.CardViewHolder> {

    String type, date, time;
    Context context;

    NonJustifiedCardClass (Context c, String type, String date, String time){

        this.context = c;
        this.date = date;
        this.type = type;
        this.time = time;

    }

    @NonNull
    @Override
    public NonJustifiedCardClass.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.layout_nonjustified_absence_card, parent, false);

        return new CardViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NonJustifiedCardClass.CardViewHolder holder, int position) {

        holder.type.setText(type);
        holder.date.setText(date);
        holder.date2.setText(date);
        holder.time.setText(time);

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        TextView type, date, date2, time;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            type = itemView.findViewById(R.id.nonjustified_type);
            date = itemView.findViewById(R.id.nonjustified_date);
            date2 = itemView.findViewById(R.id.nonjustified_date2);
            time = itemView.findViewById(R.id.nonjustified_time);

        }
    }
}
