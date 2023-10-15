package com.example.grid_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.mygrid);

        // Creating string array
        String names [] = {"Akriti","Prakriti","Kriti","Kritika","Sunita","Kritima","Risika",
                "Ramesh","Harish","Goma","Sujata","Chadan","Ritik",
                "Rohit","Harihar","Gopal","Sunita","Chandan","Rishab",
                "Raman","Harish","Goman","Sujan","Chadan","Ritik","Rahul"
        };

        // Displaying item using arrayAdapter

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.gridview_item, R.id.grid_item, names);

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.gridview_item, R.id.mygrid, names);
        gridView.setAdapter(adapter);

        // Handling click events

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Retrieving value of array
                String value = adapter.getItem(position);

                // Displaying in to toast
                Toast.makeText(getApplicationContext(), "You just clicked on " + value, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
