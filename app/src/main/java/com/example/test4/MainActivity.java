package com.example.test4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    String userID = null;
    String userPassword = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        if (intent != null) {
            userID = intent.getStringExtra("userID");
            userPassword = intent.getStringExtra("userPassword");
        }

        Button findButton = findViewById(R.id.findButton);
        Button reservationButton = findViewById(R.id.reservationButton);
        Button ticketButton =findViewById(R.id.ticketButton);

        findButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // activity_lost_item으로 이동하는 Intent 생성
                Intent lostitemintent = new Intent(MainActivity.this, LostItemActivity.class);
                lostitemintent.putExtra("userID", userID);
                lostitemintent.putExtra("userPassword", userPassword);
                startActivity(lostitemintent);
            }
        });

        reservationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // activity_reservation으로 이동하는 Intent 생성
                Intent reservation = new Intent(MainActivity.this, ReservationActivity.class);
                reservation.putExtra("userID", userID);
                reservation.putExtra("userPassword", userPassword);
                startActivity(reservation);
            }
        });

        ticketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // activity_ticket으로 이동하는 Intent 생성
                Intent ticketintent = new Intent(MainActivity.this, TicketActivity.class);
                ticketintent.putExtra("userID", userID);
                ticketintent.putExtra("userPassword", userPassword);
                startActivity(ticketintent);
            }
        });

    }
}