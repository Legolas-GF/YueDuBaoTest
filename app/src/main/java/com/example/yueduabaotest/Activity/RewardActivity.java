package com.example.yueduabaotest.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.yueduabaotest.R;

public class RewardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reward);
        Button button=(Button) findViewById(R.id.btn_BacktoBR_1);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(RewardActivity.this, BookRankActivity.class);
                startActivity(intent);
            }
        });
    }
}
