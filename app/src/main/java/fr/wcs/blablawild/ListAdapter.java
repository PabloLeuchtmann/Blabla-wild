package fr.wcs.blablawild;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Created by wilder on 06/03/18.
 */

public class ListAdapter extends ArrayAdapter<TripModel> {
    public ListAdapter(Context context, ArrayList<TripModel> trips) {
        super(context, 0, trips);}

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Get the data item for this position
            TripModel trip = getItem(position);
            // Check if an existing view is being reused, otherwise inflate the view
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_trip, parent, false);
            }
            // Lookup view for data population
            TextView viewFirst = (TextView) convertView.findViewById(R.id.textViewFirst);
            TextView viewLast = (TextView) convertView.findViewById(R.id.textViewLast);
            TextView viewDate = (TextView) convertView.findViewById(R.id.textViewDate);
            TextView viewPrice = (TextView) convertView.findViewById(R.id.textViewPrice);
            String money = String.valueOf(trip.getPrice());
            String finalprice = "$ " + money;

            // Populate the data into the template view using the data object
            viewFirst.setText(trip.getFirstname());
            viewLast.setText(trip.getLastname());
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy hh:mm");
            String date2 = date.format(trip.getDate());
            viewPrice.setText(finalprice);
            viewDate.setText(date2);
            // Return the completed view to render on screen
            return convertView;
        }
    }


