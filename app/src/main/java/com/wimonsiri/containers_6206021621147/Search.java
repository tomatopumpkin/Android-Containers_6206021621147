package com.wimonsiri.containers_6206021621147;

import androidx.appcompat.app.AppCompatActivity;

import android.webkit.WebView;
import android.widget.SearchView;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
public class Search extends AppCompatActivity implements SearchView.OnQueryTextListener {
    SearchView searchView;
    ListView listView;
    ArrayAdapter<String> adapter;
    String [] data = {"Arjun", "Ankit", "Arvind","Dipesh","Dinesh","Deven",

            "Java","Jeniva","Test","Thailand"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        searchView = (SearchView) findViewById(R.id.searchView);
        listView = (ListView) findViewById(R.id.listView);
        adapter = new ArrayAdapter<String>( this,

                android.R.layout.simple_list_item_1,data);

        listView.setAdapter(adapter);
        searchView.setOnQueryTextListener(this);
    }
    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }
    @Override
    public boolean onQueryTextChange(String newText) {
        String text = newText;
        adapter.getFilter().filter(newText);
        return false;
    }
}
