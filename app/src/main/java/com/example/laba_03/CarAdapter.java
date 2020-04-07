package com.example.laba_03;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CarAdapter extends BaseAdapter {
    private List<Car> list;

    public CarAdapter(List<Car> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null)
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.car_item, viewGroup, false);

        ImageView photo = view.findViewById(R.id.car_img);
        TextView carName = view.findViewById(R.id.car_name);
        TextView carPrice = view.findViewById(R.id.car_price);
        TextView city = view.findViewById(R.id.car_city);

        photo.setImageResource(list.get(i).getPhoto());
        carName.setText(list.get(i).getName());
        carPrice.setText(list.get(i).getPrice());
        city.setText(list.get(i).getCity());

        view.setOnClickListener(v -> {
            Context context = v.getContext();
            Intent intent = new Intent(context, CarDetailsActivity.class);
            intent.putExtra("car", list.get(i));
            context.startActivity(intent);
        });
        return view;
    }
}
