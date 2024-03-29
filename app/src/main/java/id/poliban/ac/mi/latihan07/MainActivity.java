package id.poliban.ac.mi.latihan07;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar()!=null) getSupportActionBar().setTitle("Main Activity");

        Button bbExplicit = findViewById(R.id.bbexplicit);
        Button bbImplicit = findViewById(R.id.bbimplicit);

        bbExplicit.setOnClickListener(v -> {
            Intent intent = new Intent( MainActivity.this, SecondActivity.class);
        });
        bbImplicit.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Ryanda-Utama"));
            startActivity(intent);
        });
    }
}
