package fr.wcs.blablawild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ItineraryListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary_list);

        String nomstring = "Destination";
        String departurestring = "Departure";

        Intent searchIt = getIntent();

        String departure = searchIt.getStringExtra(departurestring);
        String destination = searchIt.getStringExtra(nomstring);

        this.setTitle(departure + " >> " + destination);


    }
}
