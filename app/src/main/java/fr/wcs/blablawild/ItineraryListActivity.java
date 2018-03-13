package fr.wcs.blablawild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ItineraryListActivity extends AppCompatActivity {

    public ArrayList ma_liste;
    public ListView mListeV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary_list);

        String nomstring = "Destination";
        String departurestring = "Departure";


        mListeV = (ListView)findViewById(R.id.maListe);

        ma_liste = new ArrayList<>();



            ListView listTrip = findViewById(R.id.maListe);
            ArrayList<TripModel> results = new ArrayList<>();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy-hh:mm");

            try {
                results.add(new TripModel("Eric", "Cartman", sdf.parse("21/02/2017-15:30"), 15));
                results.add(new TripModel("Stan", "Marsh", sdf.parse("21/02/2017-16:00"), 20));
                results.add(new TripModel("Kenny", "Broflovski", sdf.parse("21/02/2017-16:30"), 16));
                results.add(new TripModel("Kyle", "McCormick", sdf.parse("21/02/2017-17:00"), 40));
                results.add(new TripModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
            } catch (ParseException e) {
            }
            ListAdapter adapter = new ListAdapter(this, results);
            listTrip.setAdapter(adapter);

        SearchModel recup = getIntent().getExtras().getParcelable("Extra");

        Toast.makeText(ItineraryListActivity.this,recup.getDate(), Toast.LENGTH_SHORT).show();

        String departure = recup.getDeparture();
        String destination = recup.getDestination();

        this.setTitle(departure + " >> " + destination);

            // [...]
        }






    }

