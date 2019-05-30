package br.senac.pi.contacliques;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int click = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void countClick(View view) {
        TextView txtCountClicks = findViewById(R.id.txtCountClicks);
        click++;
        txtCountClicks.setText("Você clicou " + click + " vezes!");
    }
}
