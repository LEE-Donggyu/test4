package com.example.test4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 분실물 버튼을 레이아웃 파일과 연결
        Button findButton = findViewById(R.id.findButton);
        Button reservationButton = findViewById(R.id.reservationButton);
        Button ticketButton =findViewById(R.id.ticketButton);

        // 분실물 버튼 클릭 리스너 설정
        findButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // activity_lost_item으로 이동하는 Intent 생성
                Intent intent = new Intent(MainActivity.this, LostItemActivity.class);
                startActivity(intent);
            }
        });

        reservationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // activity_lost_item으로 이동하는 Intent 생성
                Intent intent = new Intent(MainActivity.this, ReservationActivity.class);
                startActivity(intent);
            }
        });

        ticketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // activity_lost_item으로 이동하는 Intent 생성
                Intent intent = new Intent(MainActivity.this, TicketActivity.class);
                startActivity(intent);
            }
        });
    }
}