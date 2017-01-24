package com.example.blarg30.exploresensors;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.ArrayList;

class sensorbasicAdapter extends ArrayAdapter<String>{

    private String[] sensorDetails;
    private List<String> sensorValues;
    private String[] sensorUnits;

    public sensorbasicAdapter(Context context, String[] details, List<String> values, String[] units, int sensorType) {
        super(context, R.layout.sensor_basic, details);
        sensorDetails = details;
        sensorValues = values;
        sensorUnits = units;


    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater sensorInflator = LayoutInflater.from(getContext());
        View customView = sensorInflator.inflate(R.layout.sensor_basic, parent, false);


        TextView textView1 = (TextView) customView.findViewById(R.id.textView1);
        TextView textView2 = (TextView) customView.findViewById(R.id.textView2);
        TextView textView3 = (TextView) customView.findViewById(R.id.textView3);
        TextView textView4 = (TextView) customView.findViewById(R.id.textView4);
        TextView textView5 = (TextView) customView.findViewById(R.id.textView5);
        TextView textView6 = (TextView) customView.findViewById(R.id.textView6);
        TextView textView7 = (TextView) customView.findViewById(R.id.textView7);
        TextView textView8 = (TextView) customView.findViewById(R.id.textView8);
        TextView textView9 = (TextView) customView.findViewById(R.id.textView9);
        TextView textView10 = (TextView) customView.findViewById(R.id.textView10);
        TextView textView11 = (TextView) customView.findViewById(R.id.textView11);
        TextView textView12 = (TextView) customView.findViewById(R.id.textView12);
        TextView titleText = (TextView) customView.findViewById(R.id.titleText);

        textView1.setText(sensorDetails[0]);
        textView3.setText(sensorDetails[1]);
        textView5.setText(sensorDetails[2]);
        textView7.setText(sensorDetails[3]);
        textView9.setText(sensorDetails[4]);
        textView11.setText(sensorDetails[5]);

        textView2.setText(sensorValues.get(0) + " " + sensorUnits[0]);
        textView4.setText(sensorValues.get(1) + " " + sensorUnits[1]);
        textView6.setText(sensorValues.get(2) + " " + sensorUnits[2]);
        textView8.setText(sensorValues.get(3) + " " + sensorUnits[3]);
        textView10.setText(sensorValues.get(4) + " " + sensorUnits[4]);
        textView12.setText(sensorValues.get(5) + " " + sensorUnits[5]);







        return customView;
    }
}
