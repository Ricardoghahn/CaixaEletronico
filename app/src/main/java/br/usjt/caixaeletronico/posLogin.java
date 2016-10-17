package br.usjt.caixaeletronico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class posLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pos_login);

        Intent intent = getIntent();
        String agencia = intent.getStringExtra(MainActivity.agencia);
        String conta = intent.getStringExtra(MainActivity.conta);
        TextView textViewAge = new TextView(this);
        textViewAge.setText(agencia);
        TextView textViewCon = new TextView(this);
        textViewCon.setText(conta);

        LinearLayout layout = (LinearLayout) findViewById(R.id.activity_posLogin);
        layout.addView(textViewAge);
        layout.addView(textViewCon);
    }
}
