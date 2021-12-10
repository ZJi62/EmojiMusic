package kr.ac.cwnu.it.kej.emojimusic;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import java.util.Random;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageButton happy;
    private ImageButton angle;
    private ImageButton sad;
    private ImageButton christmas;
    private ImageButton summer;
    private ImageButton spring;
    ImageView pochun1;
    ImageView pochun2;
    ImageView pochun3;
    ImageView pochun;
    TextView receiveView;
    Button btn;

    int index = 0;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String receiveStr = intent.getExtras().getString("sendData");
        receiveView = (TextView)findViewById(R.id.receiveText);
        receiveView.setText(receiveStr);

        happy = findViewById(R.id.happy);
        angle = findViewById(R.id.angle);
        sad = findViewById(R.id.sad);
        christmas = findViewById(R.id.christmas);
        summer = findViewById(R.id.summer);
        spring = findViewById(R.id.spring);
        pochun1 = findViewById(R.id.pochun1);
        pochun2 = findViewById(R.id.pochun2);
        pochun = findViewById(R.id.pochun);
        pochun3 = findViewById(R.id.pochun3);
        btn = (Button) findViewById(R.id.btn);

        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                startActivity(intent);

            }

        });


        sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActivity1.class);
                startActivity(intent);

            }

        });

        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActivity2.class);
                startActivity(intent);
            }

        });

        christmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActivity3.class);
                startActivity(intent);

            }

        });



        summer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActivity4.class);
                startActivity(intent);

            }

        });

        spring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActivity5.class);
                startActivity(intent);
            }

        });



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = random.nextInt(3);

                switch (index) {
                    case 0:
                        pochun.setVisibility(View.INVISIBLE);
                        pochun1.setVisibility(View.VISIBLE);
                        pochun2.setVisibility(View.INVISIBLE);
                        pochun3.setVisibility(View.INVISIBLE);
                        break;

                    case 1:
                        pochun.setVisibility(View.INVISIBLE);
                        pochun2.setVisibility(View.VISIBLE);
                        pochun1.setVisibility(View.INVISIBLE);
                        pochun3.setVisibility(View.INVISIBLE);
                        break;

                    case 2:
                        pochun.setVisibility(View.INVISIBLE);
                        pochun3.setVisibility(View.VISIBLE);
                        pochun1.setVisibility(View.INVISIBLE);
                        pochun2.setVisibility(View.INVISIBLE);
                        break;


                }


            }

        });






    }


}