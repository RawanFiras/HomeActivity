package edu.cs.birzeit.homeactivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ApartmentAdapter extends RecyclerView.Adapter<ApartmentAdapter.ViewHolder> {

    private List<Apartment> apartmentList;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public Button infoButton;
        public Button evaluationButton;

        public ViewHolder(View view) {
            super(view);
            imageView = view.findViewById(R.id.apartmentImageView);
            infoButton = view.findViewById(R.id.infoButton);
            evaluationButton = view.findViewById(R.id.evaluationButton);
        }
    }

    public ApartmentAdapter(List<Apartment> apartmentList) {
        this.apartmentList = apartmentList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.apartment_item, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Apartment apartment = apartmentList.get(position);
        holder.imageView.setImageResource(apartment.getImageResource());
        holder.infoButton.setOnClickListener(v -> {
            // Handle info button click
        });
        holder.evaluationButton.setOnClickListener(v -> {
            // Handle evaluation button click
        });
    }

    @Override
    public int getItemCount() {
        return apartmentList.size();
    }
}
