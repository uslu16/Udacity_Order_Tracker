package com.example.sil_1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Context context;
    int totalOrder = 0;
    int totalCoffePrice = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;


        Button increaseID = findViewById(R.id.increaseID);
        Button decreaseID = findViewById(R.id.decreaseID);
        Button showSumID = findViewById(R.id.showSumID);

        final TextView orderID = findViewById(R.id.orderID);
        final TextView sumTotalID = findViewById(R.id.sumTotalID);



        decreaseID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( totalOrder == 0 ) {
                    totalOrder = 0;
                } else {
                    totalOrder -= 1 ;
                }
                Toast.makeText(context, "Total " + totalOrder, Toast.LENGTH_SHORT).show();
                orderID.setText("" + totalOrder );
            }
        });

        increaseID.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                totalOrder += 1;
                Toast.makeText(context, "Total " + totalOrder, Toast.LENGTH_SHORT).show();
                orderID.setText("" + totalOrder );
            }
        });


        showSumID.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                totalCoffePrice = totalOrder * 5 ;
                sumTotalID.setText("$" + totalCoffePrice );
            }
        });



    }




}
