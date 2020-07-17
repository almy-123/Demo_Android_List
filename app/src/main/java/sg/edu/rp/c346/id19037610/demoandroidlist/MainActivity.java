package sg.edu.rp.c346.id19037610.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroid = findViewById(R.id.lvAndroidList);

        ArrayList<AndroidVersion> androidList = new ArrayList<AndroidVersion>();
        androidList.add(new AndroidVersion("Pie", "9.0"));
        androidList.add(new AndroidVersion("Oreo", "8.0 - 8.1"));
        androidList.add(new AndroidVersion("Nougat", "7.0 - 7.1.2"));

        ArrayAdapter<AndroidVersion> aList = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,androidList);
        lvAndroid.setAdapter(aList);
    }
}
