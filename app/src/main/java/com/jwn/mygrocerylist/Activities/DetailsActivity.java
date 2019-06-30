package com.jwn.mygrocerylist.Activities;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.jwn.mygrocerylist.R;

public class DetailsActivity extends AppCompatActivity {
    private TextView itemName;
    private TextView quantity;
    private TextView dateAdded;
    private int groceryId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        itemName = findViewById(R.id.itemNameDet);
        quantity = findViewById(R.id.quantityDet);
        dateAdded= findViewById(R.id.dateAddedDet);

        Bundle bundle = getIntent().getExtras();

        if (bundle !=null) {
            itemName.setText(bundle.getString("name"));
            quantity.setText(bundle.getString("quantity"));
            dateAdded.setText(bundle.getString("date"));
            groceryId = bundle.getInt("Id");
        }

    }

}// end DetailsActivity
