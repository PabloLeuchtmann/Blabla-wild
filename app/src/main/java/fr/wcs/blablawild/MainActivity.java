package fr.wcs.blablawild;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    public final static String AGE = "sdz.chapitreTrois.intent.example.AGE";

    private Button buttonIt = null;
    private Button buttonSc = null;

    private Button buttonGo = null;
    private Button buttonVh = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        buttonIt = (Button) findViewById(R.id.button_itinerary);
        buttonIt.setOnClickListener(new View.OnClickListener (){


            @Override
            public void onClick(View v) {
                Intent searchIt = new Intent(MainActivity.this, ItinerarySearchActivity.class);

                startActivity(searchIt);


            }
        });


        buttonGo = (Button) findViewById(R.id.buttonVehicle);
        buttonGo.setOnClickListener(new View.OnClickListener (){

            Intent vehicles = new Intent(MainActivity.this, VehicleActivity.class);



            @Override
            public void onClick(View view) {

                startActivity(vehicles);

            }






        });





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
