package com.example.test4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class LostitemUploadActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 1;
    private ImageView uploadimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lostitem_upload);

        uploadimg = findViewById(R.id.uploadimg);
        Button findPhotoButton = findViewById(R.id.findimgButton);

        findPhotoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK && data != null) {
            // 선택한 사진의 경로 가져오기
            Uri selectedImageUri = data.getData();

            // 선택한 사진을 이미지뷰에 설정하기
            uploadimg.setImageURI(selectedImageUri);
        }
    }
}
