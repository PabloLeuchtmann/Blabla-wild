package fr.wcs.blablawild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ItinerarySearchActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary_search);
        Button search = findViewById(R.id.searchButton);
        search.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            EditText nom = findViewById(R.id.nameText);
            String nomstring = "Destination";
            EditText departure = findViewById(R.id.departureText);
            String departurestring = "Departure";
            TextView congrats = findViewById(R.id.textViewcongrats);
            String condition1 = nom.getText().toString();
            String condition2 = departure.getText().toString();

            if (condition1.equals("") || condition2.equals("")  ) {
                Toast.makeText(ItinerarySearchActivity.this, " Sorry, empty fields ! ", Toast.LENGTH_SHORT).show();
            } else {
                congrats.setText("Congratulation " + nomstring + " ");

                Intent searchIt = new Intent(ItinerarySearchActivity.this, ItineraryListActivity.class);

                searchIt.putExtra(nomstring, nom.getText().toString());
                searchIt.putExtra(departurestring, departure.getText().toString());

                startActivity(searchIt);
            }
        }

    });
}}


