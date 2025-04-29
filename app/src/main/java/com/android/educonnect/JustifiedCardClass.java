package com.android.educonnect;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class JustifiedCardClass extends RecyclerView.Adapter<JustifiedCardClass.CardViewHolder> {

    Context context;
    String jType, jDateFrom, jTimeFrom, jDateTo, jTimeTo, j;

    public JustifiedCardClass (Context c, String type, String dfrom, String tfrom, String dto, String tto, String j) {

        this.context = c;
        this.jType = type;
        this.jDateFrom = dfrom;
        this.jTimeFrom = tfrom;
        this.jDateTo = dto;
        this.jTimeTo = tto;
        this.j = j;

    }


    @NonNull
    @Override
    public JustifiedCardClass.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.layout_justified_absence_card, parent, false);

        return new CardViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull JustifiedCardClass.CardViewHolder holder, int position) {

        holder.type.setText(jType);
        holder.date_from.setText(jDateFrom);
        holder.time_from.setText(jTimeFrom);
        holder.date_to.setText(jDateTo);
        holder.time_to.setText(jTimeTo);
        holder.j.setText(j);
        holder.date_from2.setText(jDateFrom);
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        TextView type, date_from, time_from, date_to, time_to, j, date_from2;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            type = itemView.findViewById(R.id.justified_type);
            date_from = itemView.findViewById(R.id.justified_date_from);
            time_from = itemView.findViewById(R.id.justified_time_from);
            date_to = itemView.findViewById(R.id.justified_date_to);
            time_to = itemView.findViewById(R.id.justified_time_to);
            j = itemView.findViewById(R.id.justified_justification);
            date_from2 = itemView.findViewById(R.id.justified_date_from2);
        }
    }
}
