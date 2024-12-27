package com.example.test_linearview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import com.example.test_linearview.ItemData;


public class MainActivity extends AppCompatActivity {

    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list);

        // 데이터 준비
        List<ItemData> data = new ArrayList<>();
        data.add(new ItemData(R.drawable.image1, "Item 1"));
        data.add(new ItemData(R.drawable.ic_launcher_foreground, "Item 2"));
        data.add(new ItemData(R.drawable.ic_launcher_foreground, "Item 3"));
        data.add(new ItemData(R.drawable.ic_launcher_foreground, "Item 4"));
        data.add(new ItemData(R.drawable.ic_launcher_foreground, "Item 5"));
        data.add(new ItemData(R.drawable.ic_launcher_foreground, "Item 1"));
        data.add(new ItemData(R.drawable.ic_launcher_foreground, "Item 2"));
        data.add(new ItemData(R.drawable.ic_launcher_foreground, "Item 3"));
        data.add(new ItemData(R.drawable.ic_launcher_foreground, "Item 4"));
        data.add(new ItemData(R.drawable.ic_launcher_foreground, "Item 5"));
        data.add(new ItemData(R.drawable.ic_launcher_foreground, "Item 1"));
        data.add(new ItemData(R.drawable.ic_launcher_foreground, "Item 2"));
        data.add(new ItemData(R.drawable.ic_launcher_foreground, "Item 3"));
        data.add(new ItemData(R.drawable.ic_launcher_foreground, "Item 4"));
        data.add(new ItemData(R.drawable.ic_launcher_foreground, "Item 5"));

        // 커스텀 어댑터 설정
        CustomAdapter adapter = new CustomAdapter(this, data);
        list.setAdapter(adapter);
    }
}
