package com.android.educonnect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class SummonActivity extends AppCompatActivity {

    String module, teacher, date, time, summon;
    RecyclerView SummonCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summon);

        SummonCard = findViewById(R.id.summon_recycler_list);

        module   = getString(R.string.summon_module);
        teacher  = getString(R.string.summon_teacher);
        date     = getString(R.string.summon_date);
        time     = getString(R.string.summon_time);
        summon   = getString(R.string.summon_content);

        SummmonCardClass CardAdapter = new SummmonCardClass(this, module, teacher, date, time, summon);
        SummonCard.setAdapter(CardAdapter);
        SummonCard.setLayoutManager(new LinearLayoutManager(this));



    }
}