package fr.wcs.blablawild;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class VehicleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle);


        final Spinner spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Button send = findViewById(R.id.buttonSend);
                final EditText model = findViewById((R.id.editTextModel));
                final EditText brand = findViewById(R.id.editTextBrand);
                final EditText hour = findViewById(R.id.editTextHour);
                final EditText km = findViewById(R.id.editTextKm);
                final EditText speed = findViewById(R.id.editTextSpeed);

                if (i == 0) {
                    send.setEnabled(false);
                    hour.setVisibility(View.GONE);
                    km.setVisibility(View.GONE);
                    speed.setVisibility(View.GONE);
                    send.setEnabled(false);
                }


                    if (i == 1) {


                        send.setEnabled(true);
                        km.setVisibility(View.VISIBLE);
                        hour.setVisibility(View.GONE);
                        speed.setVisibility(View.GONE);
                        send.setEnabled(true);
                        send.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                String kmcar = km.getText().toString();
                                String modelcar = model.getText().toString();
                                String brandcar = brand.getText().toString();

                                int kmvoit = Integer.parseInt(kmcar);

                                VehiclesCar supercar = new VehiclesCar(modelcar,brandcar,kmvoit);

                                Toast.makeText(VehicleActivity.this,supercar.getDescription(), Toast.LENGTH_SHORT).show();
                            }
                        });
                    }

                        if (i==2){
                            send.setEnabled(true);
                            km.setVisibility(View.GONE);
                            speed.setVisibility(View.GONE);
                            hour.setVisibility(View.VISIBLE);
                            send.setEnabled(true);
                            send.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    String modelboat = model.getText().toString();
                                    String brandboat = brand.getText().toString();
                                    String hourboat = hour.getText().toString();

                                    int hourbat = Integer.parseInt(hourboat);

                                    VehiclesBoat superboat = new VehiclesBoat(modelboat,brandboat,hourbat);

                                    Toast.makeText(VehicleActivity.this,superboat.getDescription(), Toast.LENGTH_SHORT).show();
                                }
                            });


                        }


                     if (i==3){
                    send.setEnabled(true);
                    km.setVisibility(View.GONE);
                    hour.setVisibility(View.GONE);
                    speed.setVisibility(View.VISIBLE);
                    send.setEnabled(true);
                    send.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String modelplane = model.getText().toString();
                            String brandplane = brand.getText().toString();
                            String speedplane = speed.getText().toString();

                            int speedpla = Integer.parseInt(speedplane);

                            VehiclesPlane superplane = new VehiclesPlane(modelplane,brandplane,speedpla);

                            Toast.makeText(VehicleActivity.this,superplane.getDescription(), Toast.LENGTH_SHORT).show();
                        }
                    });


                }




            }




            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });



    }


}
