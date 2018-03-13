package fr.wcs.blablawild;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ItinerarySearchActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary_search);
        Button search = findViewById(R.id.searchButton);
        final EditText datecal = findViewById(R.id.dateText);
        final Calendar myCalendar = Calendar.getInstance();
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

                if (condition1.equals("") || condition2.equals("")) {
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




         final DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel(datecal,myCalendar);
            }

        };

        datecal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new DatePickerDialog(ItinerarySearchActivity.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }


        });
    }

    private void updateLabel(EditText editText, Calendar myCalendar) {
        String myFormat = "MM/dd/yy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        editText.setText(sdf.format(myCalendar.getTime()));
    }
}





