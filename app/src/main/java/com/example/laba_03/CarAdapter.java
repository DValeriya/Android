package com.example.laba_03;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.CarHolder> {
    private List<Car> list;

    public CarAdapter(List<Car> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public CarAdapter.CarHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.car_item, parent, false);
        return new CarHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarHolder holder, int position) {
        Car car = list.get(position);
        holder.getCarName().setText(car.getName());
        holder.getCarPrice().setText(car.getPrice());
        holder.getCity().setText(car.getCity());
        holder.getPhoto().setImageResource(car.getPhoto());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class CarHolder extends RecyclerView.ViewHolder {
        private ImageView photo;
        private TextView carName;
        private TextView carPrice;
        private TextView city;

        public CarHolder(@NonNull View itemView) {
            super(itemView);

            photo = itemView.findViewById(R.id.car_img);
            carName = itemView.findViewById(R.id.car_name);
            carPrice = itemView.findViewById(R.id.car_price);
            city = itemView.findViewById(R.id.car_city);

            itemView.setOnClickListener(view -> {
                Context context = view.getContext();
                Intent intent = new Intent(context, CarDetailsActivity.class);
                intent.putExtra("car", list.get(getAdapterPosition()));
                context.startActivity(intent);
            });
        }

        public ImageView getPhoto() {
            return photo;
        }

        public TextView getCarName() {
            return carName;
        }

        public TextView getCarPrice() {
            return carPrice;
        }

        public TextView getCity() {
            return city;
        }
    }
}
