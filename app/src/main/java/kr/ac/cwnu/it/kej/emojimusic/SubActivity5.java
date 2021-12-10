package kr.ac.cwnu.it.kej.emojimusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class SubActivity5 extends AppCompatActivity {

    private Button btn_spr;
    private ImageView img_spr;

    Button mbtn_random5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub5);

        btn_spr = findViewById(R.id.btn_spr);
        btn_spr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/ESKfHHtiSjs"));
                startActivity(intent);
            }
        });

        img_spr = (ImageView) findViewById(R.id.img_spr);
        img_spr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "하단 버튼을 눌러주세요!", Toast.LENGTH_SHORT).show();
            }
        });

        mbtn_random5 = findViewById(R.id.btn_random5);
        TextView random_text5 = findViewById(R.id.random_text5);

        mbtn_random5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 버튼클릭시 랜덤발생
                Random random = new Random();

                int arr_random_num = random.nextInt(99) + 1;
                // 랜덤숫자를 텍스트뷰에 대입
                random_text5.setText(Integer.toString(arr_random_num));
            }

        });
    }
}