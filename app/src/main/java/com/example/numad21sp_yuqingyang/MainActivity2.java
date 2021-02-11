package com.example.numad21sp_yuqingyang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity2 extends AppCompatActivity {
    ArrayList<String> listItems = new ArrayList<String>();
    ArrayAdapter<String> adapter;
    private ListView myListView;
    EditText itemText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        FloatingActionButton fab = findViewById(R.id.fab_1);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addListItem();
                Snackbar.make(view, "Item added to list",
                        Snackbar.LENGTH_LONG)
                        .setAction("Undo", undoOnClickListener).show();
            }
        });

    }
    @Override
    protected void onStart() {
        super.onStart();
        myListView = findViewById(R.id.listView);
        itemText = (EditText) findViewById(R.id.editText2);
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                listItems);
        myListView.setAdapter(adapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Uri uri = Uri.parse("https://"+ adapter.getItem(position).split(":",2)[1]);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }

    private void addListItem() {

        listItems.add(itemText.getText().toString());
        itemText.setText("");
        adapter.notifyDataSetChanged();
    }
    View.OnClickListener undoOnClickListener = new
            View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listItems.remove(listItems.size() -1);
                    adapter.notifyDataSetChanged();
                    Snackbar.make(view, "Item removed", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            };
}