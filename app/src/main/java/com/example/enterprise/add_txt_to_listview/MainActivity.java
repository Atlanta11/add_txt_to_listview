package com.example.enterprise.add_txt_to_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView listView;
    EditText editText;
    ArrayList<String> strings;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.ListView);
        editText = (EditText) findViewById(R.id.editText );
        strings = new ArrayList<>();
        adapter =  new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strings);
        listView.setAdapter(adapter);

    }
    public void buttonOnClick(View v) {

        String text = editText.getText().toString();
        // Now add it to the list
        strings.add(text);
        // And finally, update the list
        adapter.notifyDataSetChanged();

    }

}
