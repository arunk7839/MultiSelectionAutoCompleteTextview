package com.example.lenovo.multiautocompletetextview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    String[] country = {"Australia", "Albania", "Belgium", "Bhutan", "Canada", "China", "India"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //We can use any of the built_in android layout simple_list_item_1 and select_dialog_item
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, country);

        MultiAutoCompleteTextView mac_tv = (MultiAutoCompleteTextView) findViewById(R.id.mac_tv);

        //Start character for search
        mac_tv.setThreshold(1);

        //Setting adapter
        mac_tv.setAdapter(adapter);

        // set tokenizer that distinguish the various substrings by comma
        mac_tv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

        //Setting textcolor after selection
        mac_tv.setTextColor(Color.BLUE);
    }
}
