package com.android.educonnect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class AbsenceActivity extends AppCompatActivity {

    String jType, jDateFrom, jTimeFrom, jDateTo, jTimeTo, j, nType, nDate, nTime;
    RecyclerView JustifiedCard, NonJustifiedCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absence);

        jType = getString(R.string.justified_type);
        jDateFrom = getString(R.string.justified_date_from);
        jTimeFrom = getString(R.string.justified_time_from);
        jDateTo = getString(R.string.justified_date_to);
        jTimeTo = getString(R.string.justified_time_to);
        j = getString(R.string.justified_justification);

        nType = getString(R.string.non_justified_type);
        nDate = getString(R.string.non_justified_date);
        nTime = getString(R.string.non_justified_time);

        JustifiedCard = findViewById(R.id.justified_recycler_list);
        NonJustifiedCard = findViewById(R.id.nonjustified_recycler_list);


        JustifiedCardClass justifiedAdapter = new JustifiedCardClass(this, jType, jDateFrom, jTimeFrom, jDateTo, jTimeTo, j);
        JustifiedCard.setAdapter(justifiedAdapter);
        JustifiedCard.setLayoutManager(new LinearLayoutManager(this));


        NonJustifiedCardClass nonjustifiedAdapter = new NonJustifiedCardClass(this, nType, nDate, nTime);
        NonJustifiedCard.setAdapter(nonjustifiedAdapter);
        NonJustifiedCard.setLayoutManager(new LinearLayoutManager(this));


    }
}