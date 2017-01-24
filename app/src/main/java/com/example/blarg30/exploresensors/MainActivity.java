package com.example.blarg30.exploresensors;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.hardware.SensorEventListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.view.LayoutInflater;
import android.widget.TextView;

import java.util.List;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
    private Sensor Accelerometer, Magnetic_field, Gyroscope, Light, Pressure, Proximity, Gravity,
                Linear_acceleration, Rotation, Orientation, Humidity, Temperature;
    private SensorManager mySensorManager;
    private Sensor tempSensor;
    /*List of strings in the appropriate order of information
    * Name
    * Vendor
    * Power
    * Resolution
    * Version
    */
    private List<String> Accelerometer_details, Magnetic_field_details, Gyroscope_details, Light_details,
            Pressure_details, Proximity_details, Gravity_details, Linear_acceleration_details, Rotation_details,
            Orientation_details, Humidity_details, Temperature_details;
    private String[] SensorDetailNames = new String[]{"Name:", "Vendor:", "Power:", "Resolution:", "Version:", "Max Range:"};
    private String[] AccelerometerUnits = new String[]{"", "", "mA", "m/s2", "", "m/s2"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySensorManager = (SensorManager) this.getSystemService(this.SENSOR_SERVICE);
        //Get all of the sensors
        Accelerometer = mySensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        //Gravity = mySensorManager.getDefaultSensor(Sensor.TYPE_GRAVITY);

        //Get the sensor details
        Accelerometer_details = getSensorData( Accelerometer);


        //Display the sensor details



        ScrollView myScrollView1 = (ScrollView) findViewById(R.id.myScrollView1);
        myScrollView.addView(createSensorBasic(SensorDetailNames, Accelerometer_details, AccelerometerUnits));




        }


    //Gets the information about a sensor
    private List<String> getSensorData(Sensor mySensor){
        /*List of strings in the appropriate order of information
        * Name
        * Vendor
        * Power
        * Resolution
        * Version
        * Max Range
        */
        List<String> retString = new ArrayList<String>();
        retString.add(mySensor.getName());
        retString.add(mySensor.getVendor());
        retString.add(Float.toString(mySensor.getPower()));
        retString.add(Float.toString(mySensor.getResolution()));
        retString.add(Integer.toString(mySensor.getVersion()));
        retString.add(Float.toString(mySensor.getMaximumRange()));
        return retString;
    }

    private View createSensorBasic(String[] sensorDetails, List<String> sensorValues, String[] sensorUnits){
        View customView = LayoutInflater.from(this).inflate(R.layout.sensor_basic, null);

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


    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
        //do something here
    }
}
