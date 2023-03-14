package com.rajapps.spcoetcollege.ebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rajapps.spcoetcollege.R;

public class PdfViewerActivity extends AppCompatActivity {

    String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer);

        url = getIntent().getStringExtra("pdfUrl");

    }
}