package edu.cs.birzeit.homeactivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ApartmentAdapter adapter;
    private List<Apartment> apartmentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        apartmentList = new ArrayList<>();


        apartmentList.add(new Apartment(R.drawable.apartment4, "بجانب المحكمة", "Evaluation 2"));
        apartmentList.add(new Apartment(R.drawable.apartment5, "بالقرب من الجامعة", "Evaluation 3"));

        adapter = new ApartmentAdapter(apartmentList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
