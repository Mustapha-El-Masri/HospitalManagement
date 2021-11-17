package com.whysoserious.neeraj.SmartHospital.Patient;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.whysoserious.neeraj.SmartHospital.R;

/**
 * Created by Neeraj on 07-Apr-16.
 */
public class Wait_Appointment extends AppCompatActivity {

    String username,password,user_type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wait_appointment);

        Bundle bb = getIntent().getExtras();
        username = bb.getString("username");
        password = bb.getString("password");
        user_type = bb.getString("user_type");
    }
}
