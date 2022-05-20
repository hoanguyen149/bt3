package com.example.ckcstuden;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ListView listdannhsach;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listdannhsach=findViewById(R.id.list_danh_ba);
        ArrayList<Danhbahs> danhsach =new ArrayList<>();
        Danhbahs danhsach1 = new Danhbahs(R.drawable.ec1be484b03f7161282e,"CĐ ĐTTT 20A","CA 1",R.drawable.ic_baseline_navigate_next_24);
        danhsach.add(danhsach1);
        Danhbahs danhsach2 = new Danhbahs(R.drawable.ec1be484b03f7161282e,"CĐ ĐTTT 20B","CA 2",R.drawable.ic_baseline_navigate_next_24);
        danhsach.add(danhsach2);
        Danhbahs danhsach3 = new Danhbahs(R.drawable.ec1be484b03f7161282e,"CĐ ĐTTT 21A","CA 1",R.drawable.ic_baseline_navigate_next_24);
        danhsach.add(danhsach3);
        Danhbahs danhsach4 = new Danhbahs(R.drawable.ec1be484b03f7161282e,"CĐ ĐTTT 21B","CA 2",R.drawable.ic_baseline_navigate_next_24);
        danhsach.add(danhsach4);
       AdaptetDanhBahs adapterDanhSach=new AdaptetDanhBahs(MainActivity.this,R.layout.item_danhbahs,danhsach);
        listdannhsach.setAdapter(adapterDanhSach);
    }
}