package com.coolman.submission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Detail extends AppCompatActivity {
    private TextView tv_name,tv_detail,tv_cekdetail;
    private ImageView imgPhoto;
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_CEKDETAIL = "extra_cekdetail";
    public static final String EXTRA_PHOTO = "extra_photo";
    private String title = "CEO DETAIL ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setActionBarTitle(title);
        String name= getIntent().getStringExtra(EXTRA_NAME);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);
        String cekdetail = getIntent().getStringExtra(EXTRA_CEKDETAIL);
        int photo = getIntent().getIntExtra(EXTRA_PHOTO,0);




        tv_name = findViewById(R.id.ceonames);
        tv_detail = findViewById(R.id.ceodetail);
        tv_cekdetail = findViewById(R.id.ceocekdetail);
        imgPhoto = findViewById(R.id.imageceo);

        Glide.with(this)
                .load(photo)
                .apply(new RequestOptions().override(350, 550))
                .into(imgPhoto);

        tv_name.setText(name);
        tv_detail.setText(detail);
        tv_cekdetail.setText(cekdetail);


    }
    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}
