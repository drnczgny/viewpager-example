package com.adrian.viewpagerexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.adrian.viewpagerexample.v1.TabsWithTextActivity;
import com.adrian.viewpagerexample.v2.TabsWithIconActivity;
import com.adrian.viewpagerexample.v3.TabsWithTextAndIconActivity;
import com.adrian.viewpagerexample.v4.TabsWithDifferentLayoutsActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnTabsWithText;
    private Button btnTabsWithIcon;
    private Button btnTabsWithTextAndIcon;
    private Button btnTabsWithDifferentLayoutsActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTabsWithText = (Button) findViewById(R.id.btnTabsWithText);
        btnTabsWithIcon = (Button) findViewById(R.id.btnTabsWithIcon);
        btnTabsWithTextAndIcon = (Button) findViewById(R.id.btnTabsWithTextAndIcon);
        btnTabsWithDifferentLayoutsActivity = (Button) findViewById(R.id.btnTabsWithDifferentLayoutsActivity);

        btnTabsWithText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TabsWithTextActivity.class);
                startActivity(intent);
            }
        });

        btnTabsWithIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TabsWithIconActivity.class);
                startActivity(intent);
            }
        });

        btnTabsWithTextAndIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TabsWithTextAndIconActivity.class);
                startActivity(intent);
            }
        });

        btnTabsWithDifferentLayoutsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TabsWithDifferentLayoutsActivity.class);
                startActivity(intent);
            }
        });
    }

}
