package com.example.ckcstuden;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class AdaptetDanhBahs extends ArrayAdapter<Danhbahs>{
    Context context;
    int res;
    ArrayList<Danhbahs> danhbahs;

    public AdaptetDanhBahs(@NonNull Context context, int resource, @NonNull ArrayList<Danhbahs> objects) {
        super(context, resource, objects);
        this.context = context;
        this.res = resource;
        this.danhbahs = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null)
            convertView = LayoutInflater.from(context).inflate(R.layout.item_danhbahs, parent, false);
        TextView tenlop = convertView.findViewById(R.id.tenlop);
        TextView ca = convertView.findViewById(R.id.ca);
        ImageView hinhanh = convertView.findViewById(R.id.hinhanh);
        ImageButton nutnhan = convertView.findViewById(R.id.nutnhan);
        Danhbahs db = danhbahs.get(position);
        String cahs =db.getCa();
        ca.setText(cahs);
        String name = db.getTenlop();
        tenlop.setText(name);
        int logo = db.getHinhanh();
        hinhanh.setImageResource(logo);
        int button = db.getNutnhan();
        nutnhan.setImageResource(button);
        return convertView;
    }
}
