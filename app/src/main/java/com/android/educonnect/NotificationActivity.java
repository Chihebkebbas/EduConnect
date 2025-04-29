package com.android.educonnect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class NotificationActivity extends AppCompatActivity {

    String[] Title, Description, Date, Time;
    int[] Avatar ={R.drawable.school1_photo, R.drawable.teacher1_avatar, R.drawable.teacher2_avatar};
    RecyclerView Notification;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        // implimenter les tableaux avec les Notification Arrays (Déclaré dans strings.xml)
        Notification = findViewById(R.id.notification_recycler_list);
        Title = getResources().getStringArray(R.array.notification_item_title);
        Description = getResources().getStringArray(R.array.notification_item_description);
        Date = getResources().getStringArray(R.array.notification_item_time);
        Time = getResources().getStringArray(R.array.notification_item_time);

        NotificationItemClass notificationAdapter = new NotificationItemClass(this, Title, Description, Date, Time, Avatar);
        Notification.setAdapter(notificationAdapter);
        Notification.setLayoutManager(new LinearLayoutManager(this));

    }
}