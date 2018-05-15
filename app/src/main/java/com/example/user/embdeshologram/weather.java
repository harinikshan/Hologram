package com.example.user.embdeshologram;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.widget.TextView;

import java.util.List;
import java.util.Locale;

public class weather extends AppCompatActivity implements LocationListener {

    // Project Created by Ferdousur Rahman Shajib
    // www.androstock.com


    TextView cityField, detailsField, currentTemperatureField, humidity_field, pressure_field, weatherIcon, updatedField, address;
    TextView cityField2, detailsField2, currentTemperatureField2, humidity_field2, pressure_field2, weatherIcon2, updatedField2, address2;
    TextView cityField3, detailsField3, currentTemperatureField3, humidity_field3, pressure_field3, weatherIcon3, updatedField3, address3;
    TextView cityField4, detailsField4, currentTemperatureField4, humidity_field4, pressure_field4, weatherIcon4, updatedField4, address4;
    Typeface weatherFont;
    LocationManager locationManager;
    Double latitude= 0.0, longitude= 0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_weather);

        if (ContextCompat.checkSelfPermission(getApplicationContext(), android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getApplicationContext(), android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION, android.Manifest.permission.ACCESS_COARSE_LOCATION}, 101);

        }
        try {
            locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
            locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 5000, 5, this);
        } catch (SecurityException e) {
            e.printStackTrace();
        }
        weatherFont = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/weathericons-regular-webfont.ttf");

        cityField = (TextView) findViewById(R.id.city_field);
        updatedField = (TextView) findViewById(R.id.updated_field);
        detailsField = (TextView) findViewById(R.id.details_field);
        currentTemperatureField = (TextView) findViewById(R.id.current_temperature_field);
        humidity_field = (TextView) findViewById(R.id.humidity_field);
        pressure_field = (TextView) findViewById(R.id.pressure_field);
        weatherIcon = (TextView) findViewById(R.id.weather_icon);
        address = (TextView) findViewById(R.id.address);
        cityField2 = (TextView) findViewById(R.id.city_field2);
        updatedField2 = (TextView) findViewById(R.id.updated_field2);
        detailsField2 = (TextView) findViewById(R.id.details_field2);
        currentTemperatureField2 = (TextView) findViewById(R.id.current_temperature_field2);
        humidity_field2 = (TextView) findViewById(R.id.humidity_field2);
        pressure_field2 = (TextView) findViewById(R.id.pressure_field2);
        weatherIcon2 = (TextView) findViewById(R.id.weather_icon2);
        address2 = (TextView) findViewById(R.id.address2);
        cityField3 = (TextView) findViewById(R.id.city_field3);
        updatedField3 = (TextView) findViewById(R.id.updated_field3);
        detailsField3 = (TextView) findViewById(R.id.details_field3);
        currentTemperatureField3 = (TextView) findViewById(R.id.current_temperature_field3);
        humidity_field3 = (TextView) findViewById(R.id.humidity_field3);
        pressure_field3 = (TextView) findViewById(R.id.pressure_field3);
        weatherIcon3 = (TextView) findViewById(R.id.weather_icon3);
        address3 = (TextView) findViewById(R.id.address3);
        cityField4 = (TextView) findViewById(R.id.city_field4);
        updatedField4 = (TextView) findViewById(R.id.updated_field4);
        detailsField4 = (TextView) findViewById(R.id.details_field4);
        currentTemperatureField4 = (TextView) findViewById(R.id.current_temperature_field4);
        humidity_field4 = (TextView) findViewById(R.id.humidity_field4);
        pressure_field4 = (TextView) findViewById(R.id.pressure_field4);
        weatherIcon4 = (TextView) findViewById(R.id.weather_icon4);
        address4 = (TextView) findViewById(R.id.address4);
        weatherIcon.setTypeface(weatherFont);
        weatherIcon2.setTypeface(weatherFont);
        weatherIcon3.setTypeface(weatherFont);
        weatherIcon4.setTypeface(weatherFont);



    }

    @Override
    public void onLocationChanged(Location location) {
        Log.i("TAG" , String.valueOf(location.getLatitude()));
        Log.i("TAG" , String.valueOf(location.getLongitude()));
        latitude = location.getLatitude();
        longitude = location.getLongitude();
        try {
            Geocoder geocoder = new Geocoder(this, Locale.getDefault());
            List<Address> addresses = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
            address.setText(addresses.get(0).getAddressLine(0)+".");
            address2.setText(addresses.get(0).getAddressLine(0)+".");
            address3.setText(addresses.get(0).getAddressLine(0)+".");
            address4.setText(addresses.get(0).getAddressLine(0)+".");
        }catch(Exception e)
        {

        }
        Function.placeIdTask asyncTask =new Function.placeIdTask(new Function.AsyncResponse() {
            public void processFinish(String weather_city, String weather_description, String weather_temperature, String weather_humidity, String weather_pressure, String weather_updatedOn, String weather_iconText, String sun_rise) {

                cityField.setText(weather_city);
                updatedField.setText(weather_updatedOn);
                detailsField.setText(weather_description);
                currentTemperatureField.setText(weather_temperature);
                humidity_field.setText("Humidity: "+weather_humidity);
                pressure_field.setText("Pressure: "+weather_pressure);
                weatherIcon.setText(Html.fromHtml(weather_iconText));
                cityField2.setText(weather_city);
                updatedField2.setText(weather_updatedOn);
                detailsField2.setText(weather_description);
                currentTemperatureField2.setText(weather_temperature);
                humidity_field2.setText("Humidity: "+weather_humidity);
                pressure_field2.setText("Pressure: "+weather_pressure);
                weatherIcon2.setText(Html.fromHtml(weather_iconText));
                cityField3.setText(weather_city);
                updatedField3.setText(weather_updatedOn);
                detailsField3.setText(weather_description);
                currentTemperatureField3.setText(weather_temperature);
                humidity_field3.setText("Humidity: "+weather_humidity);
                pressure_field3.setText("Pressure: "+weather_pressure);
                weatherIcon3.setText(Html.fromHtml(weather_iconText));
                cityField4.setText(weather_city);
                updatedField4.setText(weather_updatedOn);
                detailsField4.setText(weather_description);
                currentTemperatureField4.setText(weather_temperature);
                humidity_field4.setText("Humidity: "+weather_humidity);
                pressure_field4.setText("Pressure: "+weather_pressure);
                weatherIcon4.setText(Html.fromHtml(weather_iconText));

            }
        });



        asyncTask.execute( String.valueOf(location.getLatitude()), String.valueOf(location.getLongitude())); //  asyncTask.execute("Latitude", "Longitude")
    }



    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }
}
