package com.nvt.recapchademo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private static final String SAFETY_NET_API_SITE_KEY ="6Lc-eVwUAAAAAD2nX9KGxqWwjkX5Q0VgsFwe_KDI";
    Button btnSend;
    EditText edtFeedbackContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSend = findViewById(R.id.btn_send);
        edtFeedbackContent = findViewById(R.id.input_feedback);
    }
}
