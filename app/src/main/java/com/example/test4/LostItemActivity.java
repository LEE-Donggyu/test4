package com.example.test4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LostItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost_item);

        Button uploadButton =findViewById(R.id.uploadButton);

        // 분실물 버튼 클릭 리스너 설정
        uploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // activity_lost_item으로 이동하는 Intent 생성
                Intent intent = new Intent(LostItemActivity.this, LostitemUploadActivity.class);
                startActivity(intent);
            }
        });


    }
}