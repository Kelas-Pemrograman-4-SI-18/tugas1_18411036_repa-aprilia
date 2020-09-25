package com.repa.prj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtTampil;
    EditText edtNpm, edtNama, edtjeniskelamin, edtnotlp;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTampil = findViewById(R.id.txtNpmNamaJeniskelaminDanNotelp);

        edtNpm = (EditText) findViewById(R.id.edtNpm);
        edtNama = (EditText) findViewById(R.id.edtNama);
        edtjeniskelamin = (EditText) findViewById(R.id.edtjeniskelamin);
        edtnotlp = (EditText) findViewById(R.id.edtnotlp);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNpm = edtNpm.getText().toString();
                String strNama = edtNama.getText().toString();
                String strJeniskelamin = edtjeniskelamin.getText().toString();
                String strNotelp= edtnotlp.getText().toString();

                txtTampil.setText(strNpm + "\n" + strNama + "\n" + strJeniskelamin + "\n" + strNotelp);
            }
        });
    }
}