package com.brenda.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void display(View view) {
        double result=10/2;
        tvResults.setText("Answer is"+result);
        Toast.makeText(this, "Answer is"+result, Toast.LENGTH_SHORT).show();
        Log.d("KENYA",""+result);
        Log.e("KENYA","ERROR MESSAGE" );
        Log.i("KENYA","INFO MESSAGE" );
        Log.wtf("KENYA","SOME MESSAGE" );
    }
}
