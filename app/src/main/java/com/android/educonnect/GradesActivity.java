package com.android.educonnect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GradesActivity extends AppCompatActivity {

    String ModuleTitle[], ModuleCoef[], ModuleGrade[];
    RecyclerView GradesCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grades);

        GradesCard = findViewById(R.id.module_recycler_list);
        ModuleTitle = getResources().getStringArray(R.array.module_title);
        ModuleCoef = getResources().getStringArray(R.array.module_coef);
        ModuleGrade = getResources().getStringArray(R.array.module_grade);

        GradesCardClass GradesCardAdapter = new GradesCardClass(this, ModuleTitle, ModuleCoef, ModuleGrade);
        GradesCard.setAdapter(GradesCardAdapter);
        GradesCard.setLayoutManager(new LinearLayoutManager(this));
    }
}