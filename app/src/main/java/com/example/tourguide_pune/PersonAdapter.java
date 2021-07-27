package com.example.tourguide_pune;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PersonAdapter extends ArrayAdapter<person> {

    private Context mContext;

    private int mResource;

    public PersonAdapter(@NonNull Context context, int resource, @NonNull ArrayList<person> objects) {
        super(context, resource, objects);

        this.mContext=context;
        this.mResource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        convertView = layoutInflater.inflate(mResource,parent,false);

        ImageView imageView = convertView.findViewById(R.id.image);

        TextView txtname = convertView.findViewById(R.id.Name);

        TextView txtdes = convertView.findViewById(R.id.Des);

        TextView txtvisit = convertView.findViewById(R.id.Visit);

        imageView.setImageResource(getItem(position).getImage());

        txtname.setText(getItem(position).getName());

        txtdes.setText(getItem(position).getDes());

        txtvisit.setText(getItem(position).getVisit());













        return convertView;
    }
}
