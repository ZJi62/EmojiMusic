package kr.ac.cwnu.it.kej.emojimusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity0 extends AppCompatActivity {

    private Button btn_move;
    private String str;
    private EditText sendData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);

        btn_move = findViewById(R.id.btn_move);
        sendData = (EditText)findViewById(R.id.et_id);

        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity0.this, MainActivity.class);
                intent.putExtra("sendData",sendData.getText().toString());
                startActivity(intent); // 액티비티 이동
            }
        });

    }
}