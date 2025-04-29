package com.android.educonnect;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.zip.Inflater;

import de.hdodenhof.circleimageview.CircleImageView;

public class NotificationItemClass extends RecyclerView.Adapter<NotificationItemClass.ItemViewHolder> {

    Context Context;
    String[] NotifTitle, NotifDescription, NotifDate, NotifTime;
    int[] NotifAvatar;

    NotificationItemClass(Context c, String[] title, String[] desc, String[] date, String[] time, int[] avatar) {

        this.Context = c;
        this.NotifAvatar = avatar;
        this.NotifTitle = title;
        this.NotifDescription = desc;
        this.NotifDate = date;
        this.NotifTime = time;
    }


    // View layout (Layoutinfalter) inflate layout
    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(Context);
        View v = inflater.inflate(R.layout.layout_notification_item,parent, false);
        return new ItemViewHolder(v);
    }

    // set variable to layout
    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

        holder.notif_title.setText(NotifTitle[position].toString());
        holder.notif_description.setText(NotifDescription[position].toString());
        holder.notif_date.setText(NotifDate[position].toString());
        holder.notif_time.setText(NotifTime[position].toString());
        holder.notif_avatar.setImageResource(NotifAvatar[position]);

    }

    // Lenght
    @Override
    public int getItemCount() {
        return NotifTitle.length;
    }


    // Inner Class, associer des objets a des éléments graphique
    public class ItemViewHolder extends RecyclerView.ViewHolder {

        CircleImageView notif_avatar;
        TextView notif_title, notif_description, notif_date, notif_time;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            notif_avatar = itemView.findViewById(R.id.notification_item_icon);
            notif_title = itemView.findViewById(R.id.notification_item_title);
            notif_description = itemView.findViewById(R.id.notification_item_subtitle);
            notif_date = itemView.findViewById(R.id.notification_item_date);
            notif_time = itemView.findViewById(R.id.notification_item_time);

        }
    }
}
