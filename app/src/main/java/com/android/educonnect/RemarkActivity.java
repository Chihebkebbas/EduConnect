package com.android.educonnect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

public class RemarkActivity extends AppCompatActivity {

    String Module1, Teacher1, Date1, Time1, Remark1;

    RecyclerView RemarkCards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remark);

        RemarkCards = findViewById(R.id.remark_recycler_list);
        Module1 = getString(R.string.remark1_module);
        Teacher1 = getString(R.string.remark1_teacher);
        Date1 = getString(R.string.remark1_date);
        Time1 = getString(R.string.remark1_time);
        Remark1 = getString(R.string.remark1);


        RemarkCardClass remarkCardAdapter = new RemarkCardClass(this, Module1, Teacher1, Date1, Time1, Remark1);
        RemarkCards.setAdapter(remarkCardAdapter);
        RemarkCards.setLayoutManager(new LinearLayoutManager(this));


    }
}